package org.cuit.ai212.e4j.config;



import org.cuit.ai212.e4j.sys.security.UserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;
/**
 * @description: security config
 * @author: Chenear
 * @time: 2023/4/24 21:24
 */
@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserDetailServiceImpl userDetailService;

    //配置密码解析器
    @Bean
    public PasswordEncoder passwordEncoder(){
        // 不对密码解析 明文
        return NoOpPasswordEncoder.getInstance();
        // 配置BCrypt 密码解析
//        return  new BCryptPasswordEncoder();
    }


    //配置 HttpSecurity
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity
                //认证配置
                .authorizeRequests()
                .antMatchers(HttpMethod.GET,"/login").permitAll()
                .anyRequest().authenticated()
                .and()
//                登录配置
                .formLogin()
                .loginPage("/login")
                .and()
                //登出配置
                .logout()
//                .logoutUrl("/login")
                .clearAuthentication(true)     //清除认证状态
                .invalidateHttpSession(true)  //清除 session对象
                .and()
                //csrf 配置
                .csrf()
                .disable()
                // remember 配置
                .rememberMe()
                .tokenRepository(getPersistentTokenRepository())
                .userDetailsService(userDetailService)
                .alwaysRemember(true)
                .tokenValiditySeconds(1000);

        return httpSecurity.build();
    }


    //remember me 持久化
    @Bean
    public PersistentTokenRepository getPersistentTokenRepository() {
        // 为Spring Security自带的令牌控制器设置数据源
        JdbcTokenRepositoryImpl jdbcTokenRepositoryImpl = new JdbcTokenRepositoryImpl();
        jdbcTokenRepositoryImpl.setDataSource(dataSource);
        //自动建表，第一次启动时需要，第二次启动时注释掉
//        jdbcTokenRepositoryImpl.setCreateTableOnStartup(true);
        return jdbcTokenRepositoryImpl;
    }
}
