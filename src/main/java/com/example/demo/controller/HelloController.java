package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("demo")
public class HelloController {

    @RequestMapping(value = "/sayHello")
    @ResponseBody
    public String sayHello() {
        return "Hello, Coder Klein";
    }  
}
