
package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin("*")
public class EmailController {

	@PostMapping("/email/enviar")
	public String enviar() {
		return "{\"status\": \"Email enviado com sucesso\", \"id_transacao\": \"TSGJ12653\"}";
	}

}
