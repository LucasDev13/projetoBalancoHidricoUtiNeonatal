package br.com.projetobh.dao;

import java.util.List;

import br.com.projetobh.model.BalancoHidrico;

public interface BalancoHidricoDao {

	void save(BalancoHidrico balancoHidrico);

	void update(BalancoHidrico balancoHidrico);

	void delete(Long id);

	BalancoHidrico findById(Long id);

	List<BalancoHidrico> findAll();
}
