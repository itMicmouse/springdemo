package com.yangyakun.jpa.controller;

import com.yangyakun.jpa.db.entity.User;
import com.yangyakun.jpa.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserRepository userServer;


    /**
     * 创建用户
     * @param user 用户信息
     */
    @PostMapping("")
    public void createUser(@RequestBody User user){
        User save = userServer.save(user);
        System.out.println(save);
    }


}
