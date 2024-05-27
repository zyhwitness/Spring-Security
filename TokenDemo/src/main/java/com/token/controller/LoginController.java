package com.token.controller;

import com.token.domain.ResponseResult;
import com.token.domain.User;
import com.token.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: iWitness
 * @Date: 2024/5/27 15:41
 * @Version 1.0
 */
@RestController
public class LoginController {

   @Autowired
   private LoginService loginService;

   @PostMapping("/user/login")
   public ResponseResult login(@RequestBody User user){
      //登录
      return loginService.login(user);
   }

   @RequestMapping("/user/logout")
   public ResponseResult logout(){
      return loginService.logout();
   }

}
