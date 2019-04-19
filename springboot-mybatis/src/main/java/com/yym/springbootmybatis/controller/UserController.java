package com.yym.springbootmybatis.controller;

import com.yym.springbootmybatis.mapper.UserMapper;
import com.yym.springbootmybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("selectOne/{id}")
    public String selectOneById(@PathVariable Integer id){
        return userMapper.selectOneById(id).toString();
    }

    @RequestMapping("/selectUsers")
    public List<User> selectUsers()
    {
        return userMapper.selectUsers();
    }

    @RequestMapping("/insertUser/{name}/{password}")
    public User insertUser(User user){
        userMapper.insertUser(user);
        return user;
    }

    @RequestMapping("/deleteUser/{id}")
    public int deleteUsers(@PathVariable Integer id){
        return userMapper.deleteUserById(id);
    }

    @RequestMapping("/updateUser/{id}/{name}/{password}")
    public int updateUser(User user){
        return userMapper.updataUser(user);

    }


}
