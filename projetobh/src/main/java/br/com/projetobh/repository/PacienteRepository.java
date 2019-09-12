package br.com.projetobh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.projetobh.model.Paciente;

@Repository
@Transactional
public interface PacienteRepository extends CrudRepository<Paciente, String>{
	
}
