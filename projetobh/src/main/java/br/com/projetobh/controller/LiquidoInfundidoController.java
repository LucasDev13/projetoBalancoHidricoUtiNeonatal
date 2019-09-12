package br.com.projetobh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetobh.model.BalancoHidrico;
import br.com.projetobh.model.LiquidoEliminado;
import br.com.projetobh.model.LiquidoInfundido;
import br.com.projetobh.service.BalancoHidricoService;
import br.com.projetobh.service.LiquidoInfundidoService;

@Controller
@RequestMapping("/liquidosInfundidos")
public class LiquidoInfundidoController {

	@Autowired
	private LiquidoInfundidoService service;
		
	// Path da anotação "/cadastrar"
	@GetMapping("/cadastrar")
	public String cadastrar(LiquidoInfundido liquidosInfundidos) {
		// primeiro é a pasta depois e a pagina html
		return "/liquidoInfundido/cadastro";
	}

	@GetMapping("/listar")
	public String listar() {
		return "/liquidoInfundido/lista";
	}

	@PostMapping("/salvar")
	public String salvarInfundido(LiquidoInfundido liquidosInfundidos) {
		service.salvar(liquidosInfundidos);
		return "redirect:/liquidosInfundidos/cadastrar";
	}
}
