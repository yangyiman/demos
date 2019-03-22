package com.example.demo.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class pageController {

    @PostMapping("/dashboard")
    public String toDashboard(String username, String password, Map<String,String> map,HttpSession session){
        System.out.println(username+" "+password);
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            session.setAttribute("loginUsername",username);
            return "redirect:/main.html";
        }else {
            map.put("msg","密码或用户名错误");
            return "index";
        }
    }

    @RequestMapping("/list")
    public String toList(){
        return "list";
    }

    @RequestMapping("/signout")
    public String toSignout(HttpServletRequest request){
        HttpSession session = request.getSession();
        String loginUsername = (String) session.getAttribute("loginUsername");
        System.out.println("signout"+" "+loginUsername);
        if(! StringUtils.isEmpty(loginUsername)){
            session.removeAttribute("loginUsername");
        }
        return "index";
    }
}
