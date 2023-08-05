package br.com.conam.biblioteca.business.dto;

import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class ObraDTO {

	private UUID id;
	private String nome;
    private String descricao;
    private Calendar dataPublicacao;
    private Calendar dataExposicao;
	private List<AutorDTO> autores;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

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

	public List<AutorDTO> getAutores() {
		return autores;
	}

	public void setAutores(List<AutorDTO> autores) {
		this.autores = autores;
	}
}
