package br.com.conam.biblioteca.domain.repository;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.conam.biblioteca.domain.entities.ObraEntity;

@Singleton
public class ObraRepository {
	
	@Inject
	public EntityManager entityManager;

    public void save(ObraEntity obra) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(obra);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            throw ex;
        } finally {
            entityManager.close();
        }
    }

    public void update(ObraEntity obra) {

        try {
            entityManager.getTransaction().begin();
            entityManager.merge(obra);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            throw ex;
        } finally {
            entityManager.close();
        }
    }

    public void remove(Long id) {
        try {
            entityManager.getTransaction().begin();
            ObraEntity autor = entityManager.find(ObraEntity.class, id);
            if (autor != null) {
                entityManager.remove(autor);
            }
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            throw ex;
        } finally {
            entityManager.close();
        }
    }

    public ObraEntity findById(Long id) {
        try {
            return entityManager.find(ObraEntity.class, id);
        } finally {
            entityManager.close();
        }
    }

	public List<ObraEntity> findAll() {
        TypedQuery<ObraEntity> query = entityManager.createQuery("SELECT o FROM ObraEntity o", ObraEntity.class);
        return query.getResultList();
    }

    // Implement other custom query methods as needed, such as findAutorByCPF, findAutorByEmail, etc.
    public void closeEntityManagerFactory() {
        entityManager.close();
    }

}
