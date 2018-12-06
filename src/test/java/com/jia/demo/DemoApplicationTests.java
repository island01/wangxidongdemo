package com.jia.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@MapperScan("com.mapper")
public class DemoApplicationTests {

    @Autowired
    private com.jia.demo.mapper.sqlMapper sqlMapper;

    @Test
    public void contextLoads() {
        System.err.println(sqlMapper.getCount());
    }

}
