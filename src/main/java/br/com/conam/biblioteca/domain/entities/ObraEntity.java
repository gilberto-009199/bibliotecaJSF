package br.com.conam.biblioteca.domain.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
public class ObraEntity extends BaseEntity{

    @Column(nullable = false)
    private String nome;

    @Column(length = 240, nullable = false)
    private String descricao;

    private Calendar dataPublicacao;

    private Calendar dataExposicao;

    @ManyToMany
    private List<AutorEntity> autores;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Calendar dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public Calendar getDataExposicao() {
		return dataExposicao;
	}

	public void setDataExposicao(Calendar dataExposicao) {
		this.dataExposicao = dataExposicao;
	}

	public List<AutorEntity> getAutores() {
		return autores;
	}

	public void setAutores(List<AutorEntity> autores) {
		this.autores = autores;
	}
    
}
