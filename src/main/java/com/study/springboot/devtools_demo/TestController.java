package com.study.springboot.devtools_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "test")
    public String test(){
        return "a test message";//change the content here, not restart server, wait the content to be changed
    }
}
