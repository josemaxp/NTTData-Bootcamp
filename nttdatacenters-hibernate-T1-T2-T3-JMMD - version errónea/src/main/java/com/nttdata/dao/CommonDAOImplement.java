package com.nttdata.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.persistence.AbstractEntity;

@Repository
public abstract class CommonDAOImplement<T extends AbstractEntity> implements CommonDAO<T> {
	/** Tipo de clase */
	private Class<T> entityClass;

	/** Manejador de entidades */
	@Autowired
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public CommonDAOImplement() {
		setEntityClass(
				(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
	}

	@Override
	@Transactional
	public void insert(T paramT) {
		// Obtención de sesión.
		Session currentSession = entityManager.unwrap(Session.class);

		// Insercción.
		currentSession.save(paramT);

		// Cierre de sesión.
		currentSession.close();

	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<T> searchAll() {
		// Obtención de sesión.
		Session currentSession = entityManager.unwrap(Session.class);

		// Búsqueda de todos los registros.
		List<T> list = currentSession.createQuery("FROM " + this.entityClass.getName()).list();

		// Cierre de sesión.
		currentSession.close();

		return list;
	}

	@Override
	@Transactional
	public T searchById(Long id) {
		// Obtención de sesión.
		Session currentSession = entityManager.unwrap(Session.class);

		// Búsqueda por PK.
		T result = currentSession.find(entityClass, id);

		// Cierre de sesión.
		currentSession.close();

		return result;
	}

	@Override
	@Transactional
	public void delete(T paramT) {
		// Obtención de sesión.
		Session currentSession = entityManager.unwrap(Session.class);

		// Insercción.
		currentSession.delete(paramT);

		// Cierre de sesión.
		currentSession.close();

	}

	@Override
	@Transactional
	public void update(T paramT) {
		// Obtención de sesión.
		Session currentSession = entityManager.unwrap(Session.class);

		// Insercción.
		currentSession.saveOrUpdate(paramT);

		// Cierre de sesión.
		currentSession.close();

	}

	/**
	 * @param entityClass the entityClass to set
	 */
	public void setEntityClass(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

}
