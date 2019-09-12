package br.com.projetobh.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.projetobh.model.Setor;
import br.com.projetobh.service.SetorService;

@Controller
@RequestMapping("/setores")
public class SetorController {

	// injeção de dependencia
	@Autowired
	private SetorService service;

	// Abre a página de cadastrar
	// pode ocorrer um erro se o método cadastrar não tiver um objeto no contesto da
	// aplicação - sendo passado por parâmetro
	@GetMapping("/cadastrar")
	public String cadastrar(Setor setor) {
		return "/setor/cadastro";
	}

	// Abre a página de listar
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("setores", service.buscarTodos());
		return "/setor/lista";
	}

	@PostMapping("/salvar")
	public String salvar(@Valid Setor setor, BindingResult result, RedirectAttributes attr) {

		// se o hasErrors retornar true significa que um campo não passou no sistema de
		// validação
		if (result.hasErrors()) {
			return "/setor/cadastro";// ai so realiza o retorno para a pagina
		}

		service.salvar(setor);
		attr.addFlashAttribute("success", "Setor salvo com sucesso.");
		return "redirect:/setores/cadastrar";
	}

	// Método que recebe a solicitação do botão de editar
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("setor", service.buscarPorId(id));
		return "/setor/cadastro";
	}

	@PostMapping("/editar")
	public String editar(@Valid Setor setor, BindingResult result, RedirectAttributes attr) {
		
		if (result.hasErrors()) {
			return "/setor/cadastro";// ai so realiza o retorno para a pagina
		}
		
		service.editar(setor);
		attr.addFlashAttribute("success", "Setor editado com sucesso.");
		return "redirect:/setores/cadastrar";
	}

	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {

		if (service.setorTemCargos(id)) {
			model.addAttribute("fail", "Setor não removido. possui cargo(s) vinculado(s).");
		} else {
			service.excluir(id);
			model.addAttribute("success", "Setor excluído com sucesso.");
		}

		// outro tipo de redirect
		// chama o método listar passando o um modelMap que ira para o método
		// listar que vai buscar a lista de setores cadastrados
		return listar(model);
	}
}
