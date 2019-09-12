package br.com.projetobh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tabelasLiquidosBh")
public class TabInfoBalancohidricoController {
	
	//Path da anotação "/cadastrar"
	@GetMapping("/cadastrar")
	public String cadastrar() {
		//primeiro é a pasta depois e a pagina html
		return "/tabelaInformativaBh/tabelaInformativa";
	}
	
//	@GetMapping("/listar")
//	public String listar() {
//		return "/tabelaInformativaBh/lista";
//	}
}
