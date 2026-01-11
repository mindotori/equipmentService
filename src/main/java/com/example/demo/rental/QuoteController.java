package com.example.demo.rental;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteController {

	@GetMapping("/quote-request")
	public String showQuotePage(Model model) {
		List<Map<String, String>> cases = List.of(
			Map.of("image", "/images/case1.jpeg", "name", "킴스클럽 야탑점"),
			Map.of("image", "/images/case2.jpeg", "name", "킴스클럽 강남점"),
			Map.of("image", "/images/case3.jpeg", "name", "킴스클럽 강남점"),
			Map.of("image", "/images/case4.jpeg", "name", "트레이더스 부천점"),
			Map.of("image", "/images/case5.jpeg", "name", "트레이더스 김포점"),
			Map.of("image", "/images/case6.jpeg", "name", "트레이더스 동탄점"),
			Map.of("image", "/images/case7.jpeg", "name", "롯데마트 수원점"),
			Map.of("image", "/images/case8.jpeg", "name", "롯데마트 광교점"),
			Map.of("image", "/images/case9.jpeg", "name", "롯데마트 광교점"),
			Map.of("image", "/images/case10.jpeg", "name", "트레이더스 군포점"),
			Map.of("image", "/images/case11.jpeg", "name", "트레이더스 안산점"),
			Map.of("image", "/images/case12.jpeg", "name", "트레이더스 수원점"),
			Map.of("image", "/images/case13.jpeg", "name", "트레이더스 구성점"),
			Map.of("image", "/images/case14.jpeg", "name", "트레이더스 송림점")
		);
		model.addAttribute("cases", cases);

		return "quoteRequest";
	}
}
