package br.com.projetobh.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.projetobh.model.Medicamento;

public interface MedicamentoRepository extends CrudRepository<Medicamento, String>{
	Medicamento findByidMed(long idMed);
}
