package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EmailController {

	@RequestMapping("/email/enviar")
	@PostMapping
	public String enviar() {
		return "{\"status\": \"Email enviado com sucesso\", \"id_transacao\": \"TSGJ12653\"}";
	}

}
