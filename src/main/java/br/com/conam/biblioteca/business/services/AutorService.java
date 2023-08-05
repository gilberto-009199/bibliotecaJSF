package br.com.conam.biblioteca.business.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import br.com.conam.biblioteca.domain.entities.AutorEntity;
import br.com.conam.biblioteca.domain.repository.AutorRepository;

@Singleton
public class AutorService implements Serializable{
	
	@Inject
	public AutorRepository autorRepository;
	
	public void create() {}
    public void update() {}
    public void remove() {}

	public List<AutorEntity> getAll() {
		return autorRepository.findAll();
	}

}
