package br.com.conam.biblioteca.domain.repository;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.conam.biblioteca.domain.entities.AutorEntity;

@Singleton
public class AutorRepository {
	
	@Inject
	public EntityManager entityManager;

	public List<AutorEntity> findAll() {
        TypedQuery<AutorEntity> query = entityManager.createQuery("SELECT a FROM AutorEntity a", AutorEntity.class);
        return query.getResultList();
    }


}
