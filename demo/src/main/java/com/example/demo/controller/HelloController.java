package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", "홍길동");
		
		return "hello";
		/* 
		 * 템플렛에 hello.html찾음 
		 * templates/hello.html
		*/
	}
}
