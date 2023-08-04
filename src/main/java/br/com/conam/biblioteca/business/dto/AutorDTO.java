package br.com.conam.biblioteca.business.dto;

public class AutorDTO {
	
	public AutorDTO() {}
	public AutorDTO(String nome) {
		this.nome = nome;
	}
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
