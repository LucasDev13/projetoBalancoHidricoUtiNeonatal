package br.com.projetobh.service;

import java.util.List;

import br.com.projetobh.model.Setor;

public interface SetorService {

	void salvar(Setor setor);

	void editar(Setor setor);

	void excluir(Long id);

	Setor buscarPorId(Long id);

	List<Setor> buscarTodos();

	boolean setorTemCargos(Long id);

}
