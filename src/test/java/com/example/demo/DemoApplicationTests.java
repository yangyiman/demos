package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	//记录器
	Logger logger = LoggerFactory.getLogger(getClass());

	//由底到高:trace<dubug<info<warn<error
	//默认是info
	@Test
	public void contextLoads() {
		logger.trace("trace"); //跟踪信息
		logger.debug("debug");  //输出调试信息
		logger.info("info");  //定制信息
		logger.warn("warn");  //
		logger.error("error");
		//包装
		Integer a = Integer.valueOf(1);
		//拆箱
		int b =  a.intValue();
		logger.info(a.getClass().getName());
	}

}
