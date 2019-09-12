package br.com.projetobh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.projetobh.dao.LiquidoEliminadoDao;
import br.com.projetobh.model.LiquidoEliminado;

@Service
@Transactional(readOnly = false)
public class LiquidoEliminadoServiceImpl implements LiquidoEliminadoService{

	@Autowired
	private LiquidoEliminadoDao dao;
	
	@Override
	public void salvar(LiquidoEliminado liquidosEliminados) {
		dao.save(liquidosEliminados);
	}

	@Override
	public void editar(LiquidoEliminado liquidosEliminados) {
		dao.update(liquidosEliminados);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public LiquidoEliminado buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<LiquidoEliminado> buscarTodos() {
		return dao.findAll();
	}

}
