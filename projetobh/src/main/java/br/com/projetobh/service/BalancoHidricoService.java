package br.com.projetobh.service;

import java.util.List;

import br.com.projetobh.model.BalancoHidrico;

public interface BalancoHidricoService {
	
	void salvar(BalancoHidrico balancoHidrico);

	void editar(BalancoHidrico balancoHidrico);

	void excluir(Long id);

	BalancoHidrico buscarPorId(Long id);

	List<BalancoHidrico> buscarTodos();

	//boolean setorTemCargos(Long id);
}
