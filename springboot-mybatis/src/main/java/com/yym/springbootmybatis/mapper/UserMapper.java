package com.yym.springbootmybatis.mapper;

import com.yym.springbootmybatis.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from tb_user where id = #{id}")
    User selectOneById(Integer id);

    @Select("select * from tb_user")
    List<User> selectUsers();

    @Update("update tb_user set name=#{name},password=#{password} where id = #{id}")
    int updataUser(User user);

    @Delete("delete from tb_user where id = #{id}")
    int deleteUserById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty= "id")
    @Insert("insert into tb_user(name,password) values(#{name},#{password})")
    int insertUser(User user);
}
