package com.mellowp.bookstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RouteController {

    @GetMapping("/main")
    public String main(){
        return "Spring Boot Run Success~";
    }

}
