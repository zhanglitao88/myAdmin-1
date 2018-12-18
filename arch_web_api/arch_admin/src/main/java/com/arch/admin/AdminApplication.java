package com.arch.admin;

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
@MapperScan("com.arch.common.dao")
@ComponentScan(basePackages = {"com.arch.admin.*","com.arch.common.*"})
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}

