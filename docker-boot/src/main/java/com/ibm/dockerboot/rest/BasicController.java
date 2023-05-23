package com.ibm.dockerboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping(value="/hello", produces = "application/json")
    public String hello() {
        return "Hello from Docker World";
    }
}
