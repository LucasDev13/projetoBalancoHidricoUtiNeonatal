package br.com.projetobh.service;

import java.util.List;

import br.com.projetobh.model.LiquidoEliminado;

public interface LiquidoEliminadoService {
	
	void salvar(LiquidoEliminado liquidosEliminados);

	void editar(LiquidoEliminado liquidosEliminados);

	void excluir(Long id);

	LiquidoEliminado buscarPorId(Long id);

	List<LiquidoEliminado> buscarTodos();
}
