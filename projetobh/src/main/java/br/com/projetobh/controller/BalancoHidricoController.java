package br.com.projetobh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.projetobh.model.BalancoHidrico;
import br.com.projetobh.service.BalancoHidricoService;

@Controller
@RequestMapping("/balancos")
public class BalancoHidricoController {
	
	@Autowired
	private BalancoHidricoService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(BalancoHidrico balancoHidrico) {
		return "/liquidoInfundido/cadastro";
	}
	
	//Método listar
	
	
	//Método salvar
	@PostMapping("/salvar")
	public String salvar(BalancoHidrico balancoHidrico, RedirectAttributes attr) {
		service.salvar(balancoHidrico);
		attr.addFlashAttribute("success", "Balanco Hidrico salvo com sucesso.");
		return "redirect:/balancos/cadastrar";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	//injeção de dependencia
//	@Autowired
//	private BalancoHidricoService service;
//	
//
//
//	public BalancoHidricoController(BalancoHidricoService service) {
//		this.service = service;
//	}
//
//	// Path da anotação "/cadastrarInfundido"
//	@GetMapping("/cadastrar")
//	public String cadastrarInfundido() {
//		// primeiro é a pasta depois e a pagina html
//		return "/liquidoInfundido/cadastro";
//	}
//	
//	// Path da anotação "/cadastrarEliminado"
//	@GetMapping("/cadastrarEliminado")
//	public String cadastrarEliminado(BalancoHidrico balancoHidrico) {
//		// primeiro é a pasta depois e a pagina html
//		return "/liquidoEliminado/cadastro";
//	}
//	
//	@GetMapping("/listar")
//	public String listar(ModelMap model) {
//		model.addAttribute("balancos", service.buscarTodos());
//		return "/tabelaInformativaBh/tabelaInformativa";
//	}
//	
////	@PostMapping("/salvar")
////	public String salvarInfundido(BalancoHidrico balancoHidrico) {
////		service.salvar(balancoHidrico);
////		return "redirect:/balancos/cadastrar";
////	}
//	
//	@PostMapping("/salvarEliminado")
//	public String salvarEliminado(BalancoHidrico balancoHidrico) {
//		service.salvar(balancoHidrico);
//		return "redirect:/balancos/cadastrarEliminado";
//	}
//
//	public BalancoHidricoService getService() {
//		return service;
//	}
//
//	public void setService(BalancoHidricoService service) {
//		this.service = service;
//	}
	
	
}
