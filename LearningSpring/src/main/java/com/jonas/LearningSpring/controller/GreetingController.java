package com.jonas.LearningSpring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Greeting controller
 */
@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "Master") String name) {
        return "Hello " + name + "!!!";
    }
}
