package com.test.admin.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *@Author 、T
 *@Description 这是注释
 *@Date
 *@Param
 *@return
 **/
@SpringBootApplication
@MapperScan("com.test.admin.admin.dao")
@ComponentScan(basePackages = {"com.test.admin.admin.*"})
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}

