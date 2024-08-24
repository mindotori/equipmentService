package com.example.demo.rental;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RentalController {

    @GetMapping("/rental")
    public String rental() {
        return "rental/rental"; // rental 폴더 안의 rental.html 파일
    }
}
