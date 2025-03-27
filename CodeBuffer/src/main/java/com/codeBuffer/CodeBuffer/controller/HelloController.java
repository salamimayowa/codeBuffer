package com.codeBuffer.CodeBuffer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// this is a controller class for
@RestController
public class HelloController {
    // this is a method for hello world to get request for the method
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String helloWorld() {
//        return "Welcome to my Spring boot ";
//    }
    // it is better to use this
@GetMapping("/")
    public String helloWorld() {
        return "Welcome to my Spring boot ";
    }
}