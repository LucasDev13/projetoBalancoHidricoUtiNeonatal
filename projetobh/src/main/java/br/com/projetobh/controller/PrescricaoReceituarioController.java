package br.com.projetobh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.projetobh.model.Medicamento;
import br.com.projetobh.model.PrescricaoReceituario;
import br.com.projetobh.repository.MedicamentoRepository;
import br.com.projetobh.repository.PrescricaoReceituarioRepository;

@Controller
public class PrescricaoReceituarioController {
	
	//injeção de dependencia
	@Autowired
	private PrescricaoReceituarioRepository prr;
	
	@Autowired
	private MedicamentoRepository medicamentoRepository;
	
	@RequestMapping(value = "/cadastrarReceituario", method = RequestMethod.GET)
	public String form() {
		return "receituario/formReceituario";//pagina html
	}
	
	@RequestMapping(value = "/cadastrarReceituario", method = RequestMethod.POST)
	public String form(PrescricaoReceituario prescricaoReceituario) {
		prr.save(prescricaoReceituario);
		return "redirect:/cadastrarReceituario";
	}
	
	
	@RequestMapping(value = "/{idPrescricao}", method = RequestMethod.POST)
	public String formPrescricao(@PathVariable("idPrescricao") long idPrescricao, Medicamento medicamento) {
		PrescricaoReceituario pr = prr.findByidPrescricao(idPrescricao);
		medicamento.setPrescricaoReceituario(pr);
		medicamentoRepository.save(medicamento);
		return "redirect:/{idPrescricao}";
	}
}
