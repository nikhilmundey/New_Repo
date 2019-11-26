package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class GenericDao   {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void add(Object object) {
		entityManager.persist(object);
	}

	@Transactional
	public Object fetchById(Class clazz, Object pk) {
		return entityManager.find(clazz,pk);
	
	}
	
}