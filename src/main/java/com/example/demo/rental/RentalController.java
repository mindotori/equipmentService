package com.example.demo.rental;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RentalController {

    @GetMapping("/rental")
    public String rental() {
        return "rental/rental"; // rental 폴더 안의 rental.html 파일
    }
    @GetMapping("/rentalDetails1")
    public String rentalDetails1() {
        return "rental/rentalDetails1";  // rentalDetails1.html로 이동
    }

    @GetMapping("/rentalDetails2")
    public String rentalDetails2() {
        return "rental/rentalDetails2";  // rentalDetails2.html로 이동
    }

    @GetMapping("/rentalDetails3")
    public String rentalDetails3() {
        return "rental/rentalDetails3";  // rentalDetails3.html로 이동
    }
}
