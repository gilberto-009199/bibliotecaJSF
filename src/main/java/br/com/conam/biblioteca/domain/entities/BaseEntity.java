package br.com.conam.biblioteca.domain.entities;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@MappedSuperclass
public class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	public short id;

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}
	
}