package com.shiblee.SpringSecurityFullDemo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @PostMapping("/post")
    public String post( ){
        return "Post:postMapping Admin";
    }

    @GetMapping("/get")
    public String get( ){
        return "get:GetMapping Admin";

    }

    @DeleteMapping("/delete")
    public String delete( ){
        return "Delete:DeleteMapping Admin";
    }

    @PutMapping("/put")
    public String put( ){
        return "put:putMapping Admin";
    }





}
