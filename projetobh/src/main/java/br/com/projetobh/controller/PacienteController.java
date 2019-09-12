package br.com.projetobh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.projetobh.model.Paciente;
import br.com.projetobh.repository.PacienteRepository;

@Controller
public class PacienteController {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	//Método GET para buscar a página html
	@RequestMapping(value = "/cadastrarPaciente", method = RequestMethod.GET)
	public String formPaciente() {
		return "paciente/formPaciente";
	}
	
	//Método POST para salvar os dados do formulario
	@RequestMapping(value = "/cadastrarPaciente", method = RequestMethod.POST)
	public String saveFormPaciente(Paciente paciente) {
		pacienteRepository.save(paciente);
		return "redirect:/cadastrarPaciente";
	}
}
