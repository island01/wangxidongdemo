package com.jia.demo.mapper;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface sqlMapper {

    @Select("select count(1) from basis_member")
    Integer getCount();

    @Select("select * from user")
    User getUser();
}
