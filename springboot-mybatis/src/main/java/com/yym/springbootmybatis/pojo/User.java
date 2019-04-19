package com.yym.springbootmybatis.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

    private Integer id;
    private String name;
    private String password;
}
