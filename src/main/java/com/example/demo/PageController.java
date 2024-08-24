package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/quoteRequest")
    public String quoteRequest() {
        return "quoteRequest"; // templates 폴더에 위치한 quoteRequest.html
    }
}
