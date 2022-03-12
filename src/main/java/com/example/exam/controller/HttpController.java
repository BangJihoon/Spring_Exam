package com.example.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HttpController {
    @PostMapping("parsing")
    public String Result(
            @RequestParam(value = "url")String url,
            @RequestParam(value = "type")String type,
            @RequestParam(value = "bundle")String bundle,
            Model model){
        System.out.println("url = " + url);
        System.out.println("url = " + type);
        System.out.println("url = " + bundle);
        model.addAttribute("share","123");
        model.addAttribute("remain","456");
        return "Home";
    }
}
