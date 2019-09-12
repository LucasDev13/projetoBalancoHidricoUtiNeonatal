package br.com.projetobh.dao;

import java.util.List;

import br.com.projetobh.model.LiquidoEliminado;

public interface LiquidoEliminadoDao {
	
	void save(LiquidoEliminado liquidosEliminados);

	void update(LiquidoEliminado liquidosEliminados);

	void delete(Long id);

	LiquidoEliminado findById(Long id);

	List<LiquidoEliminado> findAll();
}
