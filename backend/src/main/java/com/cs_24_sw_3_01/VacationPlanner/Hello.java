package com.cs_24_sw_3_01.VacationPlanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
