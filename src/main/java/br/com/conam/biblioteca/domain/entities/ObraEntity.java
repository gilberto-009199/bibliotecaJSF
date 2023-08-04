package br.com.conam.biblioteca.domain.entities;

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

    private String dataPublicacao;

    private String dataExposicao;

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

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getDataExposicao() {
		return dataExposicao;
	}

	public void setDataExposicao(String dataExposicao) {
		this.dataExposicao = dataExposicao;
	}

	public List<AutorEntity> getAutores() {
		return autores;
	}

	public void setAutores(List<AutorEntity> autores) {
		this.autores = autores;
	}
    
}
