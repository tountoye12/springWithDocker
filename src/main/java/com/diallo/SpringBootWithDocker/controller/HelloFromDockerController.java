package com.diallo.SpringBootWithDocker.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloFromDockerController {


    @GetMapping("")
    public String hello() {
        return "Hello from Docker!";
    }

}
