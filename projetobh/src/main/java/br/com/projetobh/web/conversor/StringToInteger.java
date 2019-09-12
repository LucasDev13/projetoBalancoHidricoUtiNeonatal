package br.com.projetobh.web.conversor;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToInteger implements Converter<String, Integer>{

	@Override
	public Integer convert(String text) {
		
		//vai remover os espaços que voce tem ao final de uma string, assim e garantido que não terá espaços em 
		//branco na hora da conversão
		text = text.trim();
		if (text.matches("[0-9]+")) {
			return Integer.valueOf(text);
		}
		//se retornar null, vai cair na validação de numero e vai indicar que
		//o valor é nulo exibir a mensagem  
		return null;
	}

}
