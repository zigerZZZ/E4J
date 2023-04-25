package org.cuit.ai212.e4j.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description:   mvc config
 * @author: Chenear
 * @time: 2023/4/25 20:21
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //login 转发
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/").setViewName("/main");
    }
}
