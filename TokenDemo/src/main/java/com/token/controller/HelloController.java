package com.token.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: iWitness
 * @Date: 2024/5/24 15:51
 * @Version 1.0
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    //调用hasAuthority方法来判断是否有权限访问，具有test权限才能访问
    //@PreAuthorize("hasAuthority('system:test:list11')")
    @PreAuthorize("@customExpressionRoot.hasAuthority('system:test:list')")
    public String hello(){
        return "hello";
    }

}
