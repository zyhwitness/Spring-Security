package com.token.expression;

import com.token.domain.LoginUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description: 自定义权限校验
 * @Author: iWitness
 * @Date: 2024/5/30 15:03
 * @Version 1.0
 */

@Component
public class CustomExpressionRoot {

    public boolean hasAuthority(String authority) {

        //获取当前用户的权限（在TokenFilter中获取解析完token后从redis中获取用户信息，再存入了SecurityContextHolder）
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        List<String> permissions = loginUser.getPermissions();
        //判断用户权限集合中是否存在authority
        return permissions.contains(authority);

    }
}
