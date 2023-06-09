package com.gxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 2.用controller定义bean
@Controller
@RequestMapping("/user")
public class UserController {
    // 定义当前操作的访问路径
    @RequestMapping("/save")
    // 定义当前操作的返回值类型
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'module': 'springmvc save'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user delete ...");
        return "{'module': 'springmvc delete'}";
    }
}
