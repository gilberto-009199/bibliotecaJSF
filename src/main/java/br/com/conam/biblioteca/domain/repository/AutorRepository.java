package br.com.conam.biblioteca.domain.repository;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.conam.biblioteca.domain.entities.AutorEntity;

@Singleton
public class AutorRepository {
	
	@Inject
	public EntityManager entityManager;

    public void save(AutorEntity autor) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(autor);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            throw ex;
        } finally {
            entityManager.close();
        }
    }

    public void update(AutorEntity autor) {

        try {
            entityManager.getTransaction().begin();
            entityManager.merge(autor);
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
            AutorEntity autor = entityManager.find(AutorEntity.class, id);
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

    public AutorEntity findById(Long id) {
        try {
            return entityManager.find(AutorEntity.class, id);
        } finally {
            entityManager.close();
        }
    }

	public List<AutorEntity> findAll() {
        TypedQuery<AutorEntity> query = entityManager.createQuery("SELECT a FROM AutorEntity a", AutorEntity.class);
        return query.getResultList();
    }

    // Implement other custom query methods as needed, such as findAutorByCPF, findAutorByEmail, etc.
    public void closeEntityManagerFactory() {
        entityManager.close();
    }
}
