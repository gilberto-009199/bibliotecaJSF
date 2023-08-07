package br.com.conam.biblioteca.business.services;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.inject.Singleton;

import br.com.conam.biblioteca.domain.entities.UserEntity;
import br.com.conam.biblioteca.domain.repository.UserRepository;

@Singleton
public class LoginService implements Serializable{

	@Inject
	public UserRepository userRepository;
	
	public UserEntity create(String user, String password) {
		
		//UserEntity entity = userRepository.findByUsername(user);
		
		//if(entity != null) return null;
		
		
		UserEntity entity = userRepository.save(new UserEntity(user, password));
		
		return entity;
	}

	public UserEntity validate(String user, String password) {

		try {

			return  userRepository.findByUsernameAndPassword(user, password);

		} catch (Exception ex) {
			System.out.println("Login error -->" + ex.getMessage());
			return null;
		}

	}
}
