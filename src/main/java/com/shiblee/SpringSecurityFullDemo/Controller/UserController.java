package com.shiblee.SpringSecurityFullDemo.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/post")
    public String post( ){
        return "Post:postMapping";
    }

    @GetMapping("/get")
    public String get( ){
        return "get:GetMapping";

    }

    @DeleteMapping("/delete")
    public String delete( ){
        return "Delete:DeleteMapping";
    }

    @PutMapping("/put")
    public String put( ){
        return "put:putMapping";
    }


}
