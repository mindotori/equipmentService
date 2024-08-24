package com.example.demo.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyController {

    @GetMapping("/companyIntro")
    public String companyIntro() {
        return "companyInfo/companyIntro"; // companyInfo 폴더 안의 companyIntro.html
    }

    @GetMapping("/companyLocation")
    public String companyLocation() {
        return "companyInfo/companyLocation"; // companyInfo 폴더 안의 companyLocation.html
    }
}
