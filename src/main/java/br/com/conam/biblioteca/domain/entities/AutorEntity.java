package br.com.conam.biblioteca.domain.entities;


import java.util.Calendar;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class AutorEntity extends BaseEntity{

	@Column(nullable = false)
    private String cpf;
	
	@Column(nullable = false)
    private String nome;

    private String sexo;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private Calendar dataNascimento;

    @Column(nullable = false)
    private String paisOrigem;
    
    @ManyToMany(mappedBy = "autores")
    private List<ObraEntity> obras;

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

	public List<ObraEntity> getObras() {
		return obras;
	}

	public void setObras(List<ObraEntity> obras) {
		this.obras = obras;
	}

}
