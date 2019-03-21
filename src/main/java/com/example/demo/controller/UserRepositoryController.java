package com.example.demo.controller;

import com.example.demo.dao.UserRepository;
import com.example.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRepositoryController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getUser/{id}")
    public User selectUserById(@PathVariable("id") Integer id){
        System.out.println(id);
        return userRepository.getOne(id);
    }
}
