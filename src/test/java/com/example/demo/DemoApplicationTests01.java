package com.example.demo;

import com.example.demo.entities.Department;
import com.example.demo.entities.Employee;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoApplicationTests01 {

    @Test
    public void testLombok() {
        Department department = new Department(1, "hi");
        log.warn(department.toString());
        department.setDepartmentName("hello");
        department.setId(1);
        log.info(department.toString());
    }

    @Test
    public void testIndexOf() {
        String str = "http://rtspxxxxx.mp4";
        int rtspIndex = str.indexOf("rtsp");
        String i = String.valueOf(rtspIndex);
        String ii = str.substring(rtspIndex, str.length());
        String iii = str.substring(rtspIndex);

        log.info(ii);
        log.info(iii);
        log.info(str.endsWith(".mp4") + "");

    }

    @Test
    public void testJson() {
        Department d = new Department(1, "PC");
        Map<String, Object> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        try {
            JSONObject o = new JSONObject(map);
            log.info(o.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseJson() {
        try {
            File f = new File("C:\\Users\\Administrator\\IdeaProjects\\demo\\src\\main\\resources\\public\\demo.json");
            String demoJson = FileUtils.readFileToString(f);
            JSONObject o = new JSONObject(demoJson);
            JSONArray hobbies = o.getJSONArray("hobbies");
            hobbies.length();
            String string = hobbies.getString(1);
            String male = o.getString("sex");
            String name = o.getString("name");
            String is_studengt = o.getBoolean("is_student") + "";
            int age = o.getInt("age");
            log.info(demoJson);
            log.info(string);
            log.info(male);
            log.info(name);
            log.info(is_studengt);
            log.info(String.valueOf(age));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testJSONArray() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("a");
        list.add("b");
        list.add("c");
        JSONArray array = new JSONArray(list);
        for(int i = 0 ,length = array.length();i<length;i++ ){
            Object o = array.get(i);
            log.info(o.toString());
        }
        int anInt = array.getInt(0);
        int anInt1 = array.getInt(1);
        int anInt2 = array.getInt(2);
        String anInt3 = array.getString(3);
        log.info(String.valueOf(anInt));
        log.info(String.valueOf(anInt1));
        log.info(String.valueOf(anInt2));
        log.info(anInt3);
    }


}
