package br.com.projetobh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.projetobh.dao.SetorDao;
import br.com.projetobh.model.Setor;

@Service
public class SetorServiceImpl implements SetorService{

	@Autowired
	private SetorDao dao;
	
	@Override
	@Transactional(readOnly = false)//valor padrao 
	public void salvar(Setor setor) {
		dao.save(setor);
	}

	@Override
	@Transactional(readOnly = false)
	public void editar(Setor setor) {
		dao.update(setor);
	}

	@Override
	@Transactional(readOnly = false)
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Setor buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Setor> buscarTodos() {
		return dao.findAll();
	}
	
//	@Override
//	@Transactional(readOnly = true)
//	public List<Setor> buscarPorNome() {
//		return dao.
//	}

	@Override
	public boolean setorTemCargos(Long id) {
		if(buscarPorId(id).getCargos().isEmpty()) {
			return false;
		}
		return true;
	}

}
