package com.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * @Description: TODO
 * @Author: iWitness
 * @Date: 2025/8/5 11:00
 * @Version 1.0
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthenticationSuccessHandler successHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // formLogin 就会跳到默认登陆表单页
        http.formLogin().successHandler(successHandler);

        http.authorizeRequests().anyRequest().authenticated();
    }
}
