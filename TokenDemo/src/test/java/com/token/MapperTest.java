package com.token;

import com.token.domain.User;
import com.token.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

/**
 * @Description: TODO
 * @Author: iWitness
 * @Date: 2024/5/26 17:15
 * @Version 1.0
 */
@SpringBootTest
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void testUserMapper(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void testBCryptPasswordEncoder(){

        boolean matches = passwordEncoder.matches("admin",
                "$2a$10$6il0bGhzWWalUueYvpRX9ODGQ9blP0RJ3r/jVIjKzuwteUz/HiAuW");
        System.out.println(matches);

        String encode = passwordEncoder.encode("1234");
        String encode1 = passwordEncoder.encode("12345678");

        //$2a$10$LmoRnV86dTB2JWOKCLAUj.PorMSTePiznuBUrVZ97ef6I6QUz8wsG
        //$2a$10$gNwW1hZ4UFJ59NdW3/FKCObtJ1YbZgY2mYmo4/aHkwbUDEmJYUolS

        //$2a$10$uZnWqvEVtzQNM540FekGseFAkHScfZX0PR/zxfwfbcu8SuXDu15pO

        //System.out.println(encode);
        System.out.println(encode1);

    }


}
