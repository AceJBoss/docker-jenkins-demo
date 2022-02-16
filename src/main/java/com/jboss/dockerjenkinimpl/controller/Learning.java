package com.jboss.dockerjenkinimpl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Learning {

    @GetMapping("/learning-jenkins")
    public String learnJenkins(){
        return "I am Learning Jenkins with Docker";
    }
}
