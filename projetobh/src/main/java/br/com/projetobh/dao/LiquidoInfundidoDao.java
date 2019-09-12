package br.com.projetobh.dao;

import java.util.List;

import br.com.projetobh.model.LiquidoInfundido;

public interface LiquidoInfundidoDao {
	
	void save(LiquidoInfundido LiquidosInfundidos);

	void update(LiquidoInfundido LiquidosInfundidos);

	void delete(Long id);

	LiquidoInfundido findById(Long id);

	List<LiquidoInfundido> findAll();
}
