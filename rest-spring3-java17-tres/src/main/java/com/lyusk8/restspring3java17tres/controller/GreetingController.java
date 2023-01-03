package com.lyusk8.restspring3java17tres.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lyusk8.restspring3java17tres.model.Greeting;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();
    private final String template = "Ola %s";

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(defaultValue = "Mundo")String nome){
        return new Greeting(counter.incrementAndGet(), String.format(template, nome));
    }
    
}
