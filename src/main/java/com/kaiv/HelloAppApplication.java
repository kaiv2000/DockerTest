package com.kaiv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloAppApplication {

    public static void main(String[] args) {SpringApplication.run(HelloAppApplication.class, args);}

    @GetMapping("/hello")
    public String hello(){

        return "Hello from Container";
    }

    // https://www.youtube.com/watch?v=O0pTOjWlKbc&ab_channel=Bobocode

}
