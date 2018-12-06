package com.jia.controller;

import com.jia.service.dongService;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class dongController {

    @Resource
    private dongService dongService;


    @RequestMapping("/getUserInfo.do")
    public User isRegister() {

        User user = dongService.getUser();

        return user;
    }

}
