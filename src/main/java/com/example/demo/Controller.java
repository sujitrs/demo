package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
    @ResponseBody
@GetMapping("/hello")
    public String process(){
    return "hello";
    }
    
}
