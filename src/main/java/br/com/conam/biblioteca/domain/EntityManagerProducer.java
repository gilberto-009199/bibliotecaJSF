package br.com.conam.biblioteca.domain;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Named
public class EntityManagerProducer {

    private static final String PERSISTENCE_UNIT_NAME = "default";
    
    @Produces
    @Singleton
    public static EntityManager createEntityManager() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        
        return	entityManagerFactory.createEntityManager();
    }
}