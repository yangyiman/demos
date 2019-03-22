package com.example.demo.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class JsonController {

    @RequestMapping("/msg/test")
    @ResponseBody
    public String testJsonObject(){
        Map<String,Object> map = new HashMap<>();
        map.put("msg",123456);
        return map.toString();
    }
}
