package br.com.projetobh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.projetobh.dao.LiquidoInfundidoDao;
import br.com.projetobh.model.LiquidoInfundido;

@Service
@Transactional(readOnly = false)
public class LiquidoInfundidoServiceImpl implements LiquidoInfundidoService{
	
	@Autowired
	private LiquidoInfundidoDao dao;

	@Override
	public void salvar(LiquidoInfundido liquidosInfundidos) {
		dao.save(liquidosInfundidos);
	}

	@Override
	public void editar(LiquidoInfundido liquidosInfundidos) {
		dao.update(liquidosInfundidos);		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public LiquidoInfundido buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<LiquidoInfundido> buscarTodos() {
		return dao.findAll();
	}

}
