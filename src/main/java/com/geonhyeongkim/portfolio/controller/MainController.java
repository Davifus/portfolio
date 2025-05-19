package com.geonhyeongkim.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Geonhyeong Kim");
		return "home";
	}

}
