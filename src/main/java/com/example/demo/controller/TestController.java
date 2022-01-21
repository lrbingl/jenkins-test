package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:com.example.demo.controller
 * @description:测试jenkins部署
 * @author:Mr.bing
 * @create:2022-01-21-16-04
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/ip", method = RequestMethod.GET)
    public String ip() {
       return "jenkins success ";
    }
}
