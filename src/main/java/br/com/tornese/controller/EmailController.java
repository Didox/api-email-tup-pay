package br.com.tornese.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class EmailController {
	@PostMapping("/")
	public String enviar() {
		return "{\"status\": \"Email enviado com sucesso\", \"id_transacao\": \"TSGJ12653\"}";
	}
}
