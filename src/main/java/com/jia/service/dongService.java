package com.jia.service;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public interface dongService {
    /**
     * 获取全部用户
     * @return
     */
   public User getUser();
}
