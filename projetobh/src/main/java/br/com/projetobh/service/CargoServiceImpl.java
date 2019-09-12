package br.com.projetobh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.projetobh.dao.CargoDao;
import br.com.projetobh.model.Cargo;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService{

	//injeção de dependencia da classe CargoDao
	@Autowired
	private CargoDao dao;
	
	@Override
	public void salvar(Cargo cargo) {
		dao.save(cargo);		
	}

	@Override
	public void editar(Cargo cargo) {
		dao.update(cargo);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Cargo buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		return dao.findAll();
	}

	@Override
	public boolean cargoTemFuncionarios(Long id) {
		//faz uma consulta pelo método buscarPorId()
		//acessa o getFuncionario() do cargo que foi localizado
		//e testa se a lista de funcionarios está vazia
		//verifica se o cargo está vinculado com algum funcionario
		if(buscarPorId(id).getFuncionario().isEmpty()) {
			return false;//retorna false se a lista está vazia
		}
		return true;//retorna true se existir funcionarios na lista
	}
	 
}
