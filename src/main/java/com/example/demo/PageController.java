package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/companyIntro")
    public String companyIntro() {
        return "companyIntro";
    }

    @GetMapping("/rental")
    public String rental() {
        return "rental";
    }

    @GetMapping("/quoteRequest")
    public String quoteRequest(){
        return "quoteRequest";
    }
}
