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
import br.com.conam.biblioteca.domain.entities.ObraEntity;

@Singleton
public class ObraRepository {
	
	@Inject
	public EntityManager entityManager;

	public List<ObraEntity> findAll() {
        TypedQuery<ObraEntity> query = entityManager.createQuery("SELECT o FROM ObraEntity o", ObraEntity.class);
        return query.getResultList();
    }


}
