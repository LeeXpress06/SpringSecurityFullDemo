package com.shiblee.SpringSecurityFullDemo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/management")
public class managementController {


    @PostMapping("/post")
    public String post( ){
        return "Post:postMapping management ";
    }

    @GetMapping("/get")
    public String get( ){
        return "get:GetMapping management";

    }

    @DeleteMapping("/delete")
    public String delete( ){
        return "Delete:DeleteMapping management";
    }

    @PutMapping("/put")
    public String put( ){
        return "put:putMapping management";
    }









}
