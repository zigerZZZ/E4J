package org.cuit.ai212.e4j;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;



@EnableGlobalMethodSecurity(securedEnabled=true)  //开启注解控制用户权限
@MapperScan(value = "org.cuit.ai212.e4j.mapper")
@SpringBootApplication
public class E4JApplication {
    public static void main(String[] args) {
        SpringApplication.run(E4JApplication.class, args);
    }

}
