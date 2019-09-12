package br.com.projetobh.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * Esse classe vai funcionar como uma classe generica 
 * DaoGeneric - É uma classe que fornece vários métodos comuns á varias classes
 * @author Harmfull
 *
 * @param <T> representa a entida
 * @param <PK> representa o tipo de chave primaria
 */
public abstract class AbstractDao<T, PK extends Serializable> {
	
	@SuppressWarnings("unchecked")
	private final Class<T> entityClass =
			(Class<T>) ( (ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	
	@PersistenceContext
	private EntityManager entityManager;
	
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	
	public void save(T entity) {
		entityManager.persist(entity);
	}
	
	public void update(T entity) {
		entityManager.merge(entity);
	}
	
	public void delete(PK id) {
		entityManager.remove(entityManager.getReference(entityClass, id));
	}
	
	public T findById(PK id) {
		return entityManager.find(entityClass, id);
	}
	
	public List<T> findAll(){
		return entityManager
				.createQuery("from " + entityClass.getSimpleName(), entityClass)
				.getResultList();
	}
	
	/**
	 * É protected porque ela vai ser usado a partir de heranca, no máximo até as classes 
	 * que herdan ela, mais nenhuma
	 * @param jpql
	 * @param params
	 * @return
	 */
	protected List<T> createQuery(String jpql, Object... params){
		TypedQuery<T> query = entityManager.createQuery(jpql, entityClass);
		for (int i = 0; i < params.length; i++) {
			query.setParameter(i+1, params[i]);
		}
		return query.getResultList();
	}
}
