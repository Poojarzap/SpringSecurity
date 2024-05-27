package com.example.securitydemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {


    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello--Hi";
    }

    @PreAuthorize("hasRole('USER')") //telling spring that users with certain roles can access this end-point
    @GetMapping("/user")
    public String userEndPoint(){
        return "UserHi";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String adminEndPoint(){
        return "AdminHi";
    }
}
