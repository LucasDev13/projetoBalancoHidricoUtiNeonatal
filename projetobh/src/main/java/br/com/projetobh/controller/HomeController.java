package br.com.projetobh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //anotação que transforma a classe em Bean do tipo controller
public class HomeController {
	
	/**
	 * A barra / vai referenciar o que temos depois da nossa 
	 * aplicação, depois de localhost:8080, voce tem a barra / que é a raiz do projeto que serve como contesto
	 * o @GetMapping vai acessar a raiz do projeto que representa a index da aplicação e vai mandar abrir a pagina home.html
	 * @return
	 */
	@GetMapping("/")
	public String home() {
		return "/home";
	}
}
