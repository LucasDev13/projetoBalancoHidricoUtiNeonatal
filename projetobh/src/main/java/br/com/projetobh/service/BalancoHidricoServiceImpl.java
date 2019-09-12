package br.com.projetobh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.projetobh.dao.BalancoHidricoDao;
import br.com.projetobh.model.BalancoHidrico;

@Service
@Transactional(readOnly = false)
public class BalancoHidricoServiceImpl implements BalancoHidricoService{

	@Autowired
	private BalancoHidricoDao dao;//permite acesso ao dao de BalancoHidrico
	
	@Override
	public void salvar(BalancoHidrico balancoHidrico) {
		dao.save(balancoHidrico);		
	}

	@Override
	public void editar(BalancoHidrico balancoHidrico) {
		dao.update(balancoHidrico);		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Override
	@Transactional(readOnly = true)
	public BalancoHidrico buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<BalancoHidrico> buscarTodos() {
		return dao.findAll();
	}

}
