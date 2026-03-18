package com.test.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class DemoController {

    // GET endpoint - returns a greeting message
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Demo API!";
    }

    // GET endpoint - returns API status
    @GetMapping("/status")
    public String getStatus() {
        return "API is running";
    }
}
