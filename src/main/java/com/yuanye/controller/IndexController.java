package com.yuanye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chunyu on 2017/11/28.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("")
    public String index(){
        System.out.println("hello");
        return "login";
    }
}
