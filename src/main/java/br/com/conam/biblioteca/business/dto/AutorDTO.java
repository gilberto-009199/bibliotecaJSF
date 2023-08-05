package br.com.conam.biblioteca.business.dto;

import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class AutorDTO {
	
	private UUID id;
	private String cpf;
    private String nome;
    private String sexo;
    private String email;
    private Calendar dataNascimento;
    private String paisOrigem;
    private List<ObraDTO> obras;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public List<ObraDTO> getObras() {
		return obras;
	}

	public void setObras(List<ObraDTO> obras) {
		this.obras = obras;
	}

}
