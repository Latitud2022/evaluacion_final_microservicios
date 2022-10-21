package com.bazrdslamdev.redsocialapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name = "Cuenta")
@Table(name = "\"Cuentas\"", schema = "public")
@Inheritance(strategy = InheritanceType.JOINED)
public class Cuenta {
	
	@Id
	@Column(name = "id", length = 10)
	private String id;
	
	@Column(name = "nombrecuenta", nullable = true)
	private String name;
	
	//sexo: F, M, ...
	@Column(name = "genero", nullable = true, length = 1)
	private String genero;
	
	@Column(name = "email", nullable = true)
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
