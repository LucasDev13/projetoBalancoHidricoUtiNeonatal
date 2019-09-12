package br.com.projetobh.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.projetobh.model.LiquidoInfundido;
import br.com.projetobh.service.LiquidoInfundidoService;

@Component
public class StringToLiquidoInfundidoConversor implements Converter<String, LiquidoInfundido>{

	@Autowired
	private LiquidoInfundidoService service;
	
	@Override
	public LiquidoInfundido convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}
