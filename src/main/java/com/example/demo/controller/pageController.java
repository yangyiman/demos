package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import java.util.Map;

@Controller
public class pageController {

    @PostMapping("/dashboard")
    public String toDashboard(String username, String password, Map<String,String> map){
        System.out.println(username+" "+password);
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            return "dashboard";
        }else {
            map.put("msg","密码或用户名错误");
            return "redirect:/index.html";
        }
    }
}
