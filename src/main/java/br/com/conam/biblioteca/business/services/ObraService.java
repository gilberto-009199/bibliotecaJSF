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
import br.com.conam.biblioteca.domain.entities.ObraEntity;
import br.com.conam.biblioteca.domain.repository.AutorRepository;
import br.com.conam.biblioteca.domain.repository.ObraRepository;

@Singleton
public class ObraService implements Serializable{
	
	@Inject
	public ObraRepository obraRepository;
	
	public List<ObraEntity> getAll() {
		return obraRepository.findAll();
	}

}
