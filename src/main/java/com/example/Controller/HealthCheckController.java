package com.example.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HealthCheckController {

    @RequestMapping(value = "/status")
    public String status(){
        return "Hello World!";
    }
}
