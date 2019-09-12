package br.com.projetobh.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.projetobh.model.PrescricaoReceituario;

public interface PrescricaoReceituarioRepository extends CrudRepository<PrescricaoReceituario, String>{
	PrescricaoReceituario findByidPrescricao(long idPrescricao);
}
