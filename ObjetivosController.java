package br.org.generation.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {

	@GetMapping
	public String objetivos() {
		return "Meu objetivo essa semana é me dedicar a aprender tudo o que for proposto. <br> Utilizando principalmente a mentalidade de persistência."; 
	}
}
