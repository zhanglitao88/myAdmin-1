package com.test.admin.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ShiYulong
 * @Title: LoginController
 * @ProjectName web_admin_mybatis
 * @Description: TODO
 * @date 2018/11/27 8:49
 */
@Controller
public class LoginController {
    @RequestMapping("/")
    public String loginPage(Model model){
        model.addAttribute("123",123);
        return "login";
    }
    @RequestMapping("/index")
    public String indexPage(Model model){
        return "index";
    }
    @RequestMapping("/test")
    public String testPage(Model model){
        model.addAttribute("testValue","test1");
        return "test";
    }
}
