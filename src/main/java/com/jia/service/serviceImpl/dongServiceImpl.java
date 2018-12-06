package com.jia.service.serviceImpl;

import com.jia.demo.mapper.sqlMapper;
import com.jia.service.dongService;
import org.apache.catalina.User;

import javax.annotation.Resource;

public class dongServiceImpl implements dongService {

    @Resource
    private sqlMapper sqlMapper;

    public User getUser(){
        return sqlMapper.getUser();
    }
}
