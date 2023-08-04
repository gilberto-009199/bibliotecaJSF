package br.com.conam.biblioteca.ui;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.conam.biblioteca.business.services.AutorService;
import br.com.conam.biblioteca.business.services.ObraService;
import br.com.conam.biblioteca.domain.entities.AutorEntity;
import br.com.conam.biblioteca.domain.entities.ObraEntity;

@ManagedBean
@ViewScoped
@Named
public class ObraUI implements Serializable{
	
	@Inject
    public ObraService obraService;

    public List<ObraEntity> listObra;

    public ObraEntity obra;

    public void salvar() {    }
    
    @PostConstruct
    public void init() { this.listObra = obraService.getAll(); }
    
	public List<ObraEntity> getListObra() { return listObra;	}
	public void setListObra(List<ObraEntity> listAutor) { this.listObra = listAutor;	}

	public ObraEntity getObra() {
		return obra;
	}

	public void setObra(ObraEntity obra) {
		this.obra = obra;
	}
	
}
