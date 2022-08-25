package br.com.ifblackthencode.exercicio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // a anotação mostra para o spring boot que esta classe atende URLs
public class ExercicioController {
	
	@GetMapping("/teste")// na url /teste, ele retorna o resultado da execução deste método 
	public String digaOla() {
		return "Primeiro projeto SpringBoot.";
	}
}
