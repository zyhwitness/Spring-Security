package com.token.service;

import com.token.domain.ResponseResult;
import com.token.domain.User;

/**
 * @Description: TODO
 * @Author: iWitness
 * @Date: 2024/5/27 15:44
 * @Version 1.0
 */
public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
