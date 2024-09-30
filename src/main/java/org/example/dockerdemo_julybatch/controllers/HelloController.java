package org.example.dockerdemo_julybatch.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{val}")
    public String hello(@PathVariable String val) {
        return val;
    }
}
