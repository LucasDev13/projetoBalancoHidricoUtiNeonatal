package br.com.projetobh.dao;

import java.util.List;

import br.com.projetobh.model.Setor;

public interface SetorDao {
	
	void save (Setor setor);
	
	void update(Setor setor);
	
	void delete(Long id);
	
	Setor findById(Long id);
	
	List<Setor> findAll();
}
