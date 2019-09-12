package br.com.projetobh.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.projetobh.model.Cargo;
import br.com.projetobh.model.Setor;
import br.com.projetobh.service.CargoService;
import br.com.projetobh.service.SetorService;

@Controller
@RequestMapping("/cargos")
public class CargoController {
	
	//injeção de dependecia
	@Autowired
	private CargoService cargoService;
	
	@Autowired
	private SetorService setorService;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Cargo cargo) {
		return "/cargo/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("cargos", cargoService.buscarTodos());
		return "/cargo/lista";
	}
	
	//@Valid vai informar ao spring mvc que estamos realizando a validação via BeanValidation para o objeto cargo que vem do formulario
	//BindingResult é do spring e ele esta ali para verificar se ouve algum problema nas validações 
	@PostMapping("/salvar")
	public String salvar(@Valid Cargo cargo, BindingResult result, RedirectAttributes attr) {
		
		//se o hasErrors retornar true significa que um campo não passou no sistema de validação 
		if(result.hasErrors()) {
			return "/cargo/cadastro";//ai so realiza o retorno para a pagina 
		}
		
		cargoService.salvar(cargo);
		attr.addFlashAttribute("success", "Cargo salvo com sucesso.");
		return "redirect:/cargos/cadastrar";
		//return cadastrar(cargo);		
	}
	
	//Método que recebe a solicitação do botão de editar 
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("cargo", cargoService.buscarPorId(id));
		return "/cargo/cadastro";//esse retorno e para abrir a ppagina de cadastro
	}
	
	@PostMapping("/editar")
	public String editar(@Valid Cargo cargo, BindingResult result, RedirectAttributes attr) {
		
		if(result.hasErrors()) {
			return "/cargo/cadastro";
		}
		
		cargoService.editar(cargo);//será passado o cargo por parametro para enviar para a dao poder editar
		attr.addFlashAttribute("success", "Cargo editado com sucesso.");//vai enviar a mensagem para a página 
		return "redirect:/cargos/cadastrar";//vai fazer uma nova solicitação para a página de cadastro ser aberta novamente com o formulario limpo
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, RedirectAttributes attr) {
		
		if(cargoService.cargoTemFuncionarios(id)) {
			attr.addFlashAttribute("fail", "Setor não removido. possui cargo(s) vinculado(s).");
		}else {
			cargoService.excluir(id);
			attr.addFlashAttribute("success", "Setor excluído com sucesso.");
		}
		return "redirect:/cargos/listar";
	}
	
	//vai listar todos os setores em um combo box
	@ModelAttribute("setores")
	public List<Setor> listaDeSetor(){
		return setorService.buscarTodos();
	}
}
