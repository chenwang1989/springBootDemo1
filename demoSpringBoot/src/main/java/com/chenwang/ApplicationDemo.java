package com.chenwang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 创建人为 wang
 * 创建日期 2017/7/23
 * 包名 com.chenwang
 */
@Controller
@EnableAutoConfiguration
public class ApplicationDemo {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        return "hello 您好！";
    }

    public static void main(String[] args){
        SpringApplication.run(ApplicationDemo.class, args);
    }
}
