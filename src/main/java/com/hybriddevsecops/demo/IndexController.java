package com.hybriddevsecops.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    private final String AWS_ACCESS_KEY = "ML686RDFZUWOHYHCQQTG";
    
    private final String AWS_SECRET_KEY = "65goffb7GXeE1e/dTPVrEm26LHGvr3M4LoXg5/pj";

    @GetMapping("/")
    public String sayHello(Model model) {

        model.addAttribute("title", "DevSecOps with AWS");

        return "index";
    }
}
