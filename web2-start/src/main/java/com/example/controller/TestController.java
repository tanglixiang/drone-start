package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: tang
 * @Description: 测试接口
 * @Date: 2022/5/18 21:34
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
