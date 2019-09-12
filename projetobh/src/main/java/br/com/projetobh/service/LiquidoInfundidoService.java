package br.com.projetobh.service;

import java.util.List;

import br.com.projetobh.model.LiquidoInfundido;

public interface LiquidoInfundidoService {
	
	void salvar(LiquidoInfundido liquidosInfundidos);

	void editar(LiquidoInfundido liquidosInfundidos);

	void excluir(Long id);

	LiquidoInfundido buscarPorId(Long id);

	List<LiquidoInfundido> buscarTodos();
}
