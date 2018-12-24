package com.example.dockerdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by haoguowei. Time 2018/12/24 13:44 Desc
 */
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello() {
        return "docker! 你好.";
    }

}
