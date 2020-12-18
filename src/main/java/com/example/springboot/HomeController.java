package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "<h1>Bem vindo a API de Email TUP Pay</h1>";
	}

}
