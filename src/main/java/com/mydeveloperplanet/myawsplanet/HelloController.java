package com.mydeveloperplanet.myawsplanet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        String message = "Hello world v3";
        System.out.println( message);
        return message;
    }

}
