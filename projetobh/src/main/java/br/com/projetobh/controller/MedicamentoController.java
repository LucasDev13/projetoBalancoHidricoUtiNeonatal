package br.com.projetobh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.projetobh.model.Medicamento;
import br.com.projetobh.repository.MedicamentoRepository;

@Controller
public class MedicamentoController {
	
	/**
	 * injeção de dependencia
	 */
	@Autowired
	private MedicamentoRepository medicamentoRepository;
	
	@RequestMapping(value = "/cadastrarMedicamento", method = RequestMethod.GET)
	public String form() {
		return "medicamento/formMedicamento";//pagina html
	}
	
	@RequestMapping(value = "/cadastrarMedicamento", method = RequestMethod.POST)
	public String form(Medicamento medicamento) {
		medicamentoRepository.save(medicamento);
		return "redirect:/cadastrarMedicamento";
	}
	
	@RequestMapping("/medicamentos")
	public ModelAndView listaMedicamentos() {
		ModelAndView mv = new ModelAndView("medicamento/listaMedicamento");//vai renderizar a pagina index
		Iterable<Medicamento> medicamentos = medicamentoRepository.findAll();// findAll vai retornar todos os dados do banco
		mv.addObject("medicamentos", medicamentos);
		return mv;
	}
	
	@RequestMapping("/{idMed}")
	public ModelAndView detalhesMedicamento(@PathVariable("idMed") long idMed) {
		Medicamento medicamento = medicamentoRepository.findByidMed(idMed);
		ModelAndView mv = new ModelAndView("medicamento/detalhesMedicamento");
		mv.addObject("medicamento", medicamento);
		return mv;
	}
}
