package br.com.conam.biblioteca.domain.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	public short id;

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}
	
	private String username;
	private String password;
	
	public UserEntity() {}
	public UserEntity(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
