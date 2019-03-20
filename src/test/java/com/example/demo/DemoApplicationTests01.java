package com.example.demo;

import com.example.demo.entities.Department;
import com.example.demo.entities.Employee;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoApplicationTests01 {

		@Test
		public void testLombok(){
			Department department = new Department(1,"hi");
			log.warn(department.toString());
			department.setDepartmentName("hello");
			department.setId(1);
			log.info(department.toString());
		}




}
