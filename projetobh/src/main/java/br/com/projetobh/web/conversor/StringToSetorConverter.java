package br.com.projetobh.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.projetobh.model.Setor;
import br.com.projetobh.service.SetorService;

@Component
public class StringToSetorConverter implements Converter<String, Setor>{
	
	//Converte de uma String para um objeto Setor
	
	@Autowired
	private SetorService service;

	@Override
	public Setor convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		//O id está armazenado na variavel text
		//converte a String text(que tem o id) para um long
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}
	
	
}
