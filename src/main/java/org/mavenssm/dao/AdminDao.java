package org.mavenssm.dao;


import org.apache.ibatis.annotations.Param;
import org.mavenssm.entity.Admin;

//mybatis整合spring只写Dao接口，不写实现，mybatis自己去实现
public interface AdminDao {
    //mybatis传递多个参数参数必须采用@Pram注解，一个则不需要
    Admin queryAdmin(@Param("username")String username, @Param("password")String password);
}

