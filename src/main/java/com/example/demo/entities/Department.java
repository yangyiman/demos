package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Department {

	private Integer id;
	private String departmentName;

}
