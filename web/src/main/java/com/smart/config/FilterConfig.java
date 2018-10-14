package com.smart.config;

import com.smart.servlet.SessionFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean filterRegist() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter( new SessionFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }

}
