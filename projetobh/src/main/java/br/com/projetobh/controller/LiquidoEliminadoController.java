package br.com.projetobh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetobh.model.LiquidoEliminado;
import br.com.projetobh.service.LiquidoEliminadoService;

@Controller
@RequestMapping("/liquidosEliminados")
public class LiquidoEliminadoController {
	
	@Autowired
	private LiquidoEliminadoService service;
	
	//Path da anotação "/cadastrar"
	@GetMapping("/cadastrar")
	public String cadastrar(LiquidoEliminado liquidosEliminados) {
		//primeiro é a pasta depois e a pagina html
		return "/liquidoEliminado/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/liquidoEliminado/lista";
	}
	
	@PostMapping("/salvar")
	public String salvarEliminado(LiquidoEliminado liquidosEliminados) {
		service.salvar(liquidosEliminados);
		return "redirect:/liquidosEliminados/cadastrar";
	}
}
