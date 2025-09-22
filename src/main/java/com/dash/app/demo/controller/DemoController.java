package com.dash.app.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/sample")
    public String sample(){
        return "Hello World!";
    }

    @GetMapping("/sample/{name}")
    public String sampleName(@PathVariable String name){
        return "Hi " + name + ", Welcome!";
    }

}
