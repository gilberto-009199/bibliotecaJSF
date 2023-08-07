package br.com.conam.biblioteca.domain.repository;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import br.com.conam.biblioteca.domain.EntityManagerProducer;
import br.com.conam.biblioteca.domain.entities.ObraEntity;
import br.com.conam.biblioteca.domain.entities.UserEntity;

@Singleton
public class UserRepository{

	@Inject
	public EntityManager entityManager;

	public UserEntity findByUsername(String username) {
        try {
            String jpql = "SELECT u FROM UserEntity u WHERE u.username = :username";
            
            return entityManager.createQuery(jpql, UserEntity.class)
                    .setParameter("username", username)
                    .getSingleResult();
            
        } catch (NoResultException ex) {
            return null; // Usuário não encontrado
        }
    }
	
	public UserEntity findByUsernameAndPassword(String username, String password) {
        try {
            String jpql = "SELECT u FROM UserEntity u WHERE u.username = :username AND u.password = :password";
            
            return entityManager.createQuery(jpql, UserEntity.class)
                    .setParameter("username", username)
                    .setParameter("password", password)
                    .getSingleResult();
            
        } catch (NoResultException ex) {
            return null; // Usuário não encontrado
        }
    }
	@Transactional
	public UserEntity save(UserEntity userEntity) {

		 EntityManager entityManage = EntityManagerProducer.createEntityManager();
	     
		 try {
			//entityManage.getTransaction().begin();
            //userEntity.setId( ); // Gera um novo UUID para a entidade
            entityManage.persist(userEntity);
            //entityManage.getTransaction().commit();
        } catch (Exception ex) {
        	entityManage.getTransaction().rollback();
            throw ex;
        }
		return null;
	}

}
