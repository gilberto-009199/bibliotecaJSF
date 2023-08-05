package br.com.conam.biblioteca.ui;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.context.PrimeRequestContext;

import br.com.conam.biblioteca.business.services.AutorService;
import br.com.conam.biblioteca.domain.entities.AutorEntity;

@ManagedBean
@ViewScoped
@Named
public class AutorUI implements Serializable{

	@Inject
    public AutorService autorService;

    public List<AutorEntity> listAutor;

    private AutorEntity autor;

    public void create() {}
    public void update() {}
    public void remove() {}

    @PostConstruct
    public void init() { this.listAutor = autorService.getAll(); }
    
	public List<AutorEntity> getListAutor() { return listAutor;	}
	public void setListAutor(List<AutorEntity> listAutor) { this.listAutor = listAutor;	}

	public AutorEntity getAutor() {		return autor;	}
	public void setAutor(AutorEntity autor) {	this.autor = autor;	}

}
