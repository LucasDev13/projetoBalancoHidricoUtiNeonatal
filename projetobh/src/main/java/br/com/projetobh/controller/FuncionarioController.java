package br.com.projetobh.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.projetobh.model.Cargo;
import br.com.projetobh.model.Funcionario;
import br.com.projetobh.model.UF;
import br.com.projetobh.service.CargoService;
import br.com.projetobh.service.FuncionarioService;
import br.com.projetobh.web.validator.FuncionarioValidator;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioService;

	@Autowired
	private CargoService cargoService;
	
	@InitBinder//vai fazer com que esse método seja o primerio método dentro da classe FuncionarioController que vai ser executado
	//dessa forma ele ativa a validaçao e o spring mvc vai ate a classe funcionarioValidator para validar os campos antes de liberar o acesso
	//das requisições ao método salvar ou ao método editar 
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(new FuncionarioValidator());
	}

	@GetMapping("/cadastrar")
	public String cadastrar(Funcionario funcionario) {
		return "/funcionario/cadastro";
	}

	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("funcionarios", funcionarioService.buscarTodos());// envia a lista de funcionarios
		return "/funcionario/lista";
	}

	@PostMapping("/salvar")
	public String salvar(@Valid Funcionario funcionario, BindingResult result, RedirectAttributes attr) {

		// se o hasErrors retornar true significa que um campo não passou no sistema de
		// validação
		if (result.hasErrors()) {
			return "/funcionario/cadastro";// ai so realiza o retorno para a pagina
		}

		funcionarioService.salvar(funcionario);
		attr.addFlashAttribute("success", "Dados do funcionario salvo com sucesso.");
		return "redirect:/funcionarios/cadastrar";
	}

	// Método que recebe a solicitação do botão de editar
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("funcionario", funcionarioService.buscarPorId(id));
		return "/funcionario/cadastro";
	}

	@PostMapping("/editar")
	public String editar(@Valid Funcionario funcionario, BindingResult result, RedirectAttributes attr) {
		
		if (result.hasErrors()) {
			return "/funcionario/cadastro";// ai so realiza o retorno para a pagina
		}
		
		funcionarioService.editar(funcionario);
		attr.addFlashAttribute("success", "Setor editado com sucesso.");
		return "redirect:/funcionarios/cadastrar";
	}

	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, RedirectAttributes attr) {
		funcionarioService.excluir(id);
		attr.addFlashAttribute("success", "Funcionario removido com sucesso.");
		return "redirect:/funcionarios/listar";
	}

	// Método responsável por buscar por nome
	@GetMapping("/buscar/nome")
	public String getPorNome(@RequestParam("nomeCompleto") String nomeCompleto, ModelMap model) {
		model.addAttribute("funcionarios", funcionarioService.buscarPorNome(nomeCompleto));
		return "/funcionario/lista";
	}

	// Método para buscar por cargo
	@GetMapping("/buscar/cargo")
	public String getPorCargo(@RequestParam("id") Long id, ModelMap model) {
		model.addAttribute("funcionarios", funcionarioService.buscarPorCargo(id));
		return "/funcionario/lista";
	}

	// Método para buscar por data de entrada e data de saida
	@GetMapping("/buscar/data")
	public String getPorDatas(@RequestParam("entrada") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate entrada,
			@RequestParam("saida") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate saida, ModelMap model) {
		model.addAttribute("funcionarios", funcionarioService.buscarPorDatas(entrada, saida));
		return "/funcionario/lista";
	}

	// vai listar todos os setores em um combo box
	@ModelAttribute("cargos")
	public List<Cargo> getCargos() {
		return cargoService.buscarTodos();
	}

	@ModelAttribute("ufs")
	public UF[] getUfs() {
		return UF.values();
	}
}
