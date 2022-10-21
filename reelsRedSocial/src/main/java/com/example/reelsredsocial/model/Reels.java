package com.example.reelsredsocial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reels {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nombre;
	
	@Column
	private String nombrecuenta;
	
	@Column
	private String rutavideo;
	
	@Column
	private String postcomentario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getnombrecuenta() {
		return nombrecuenta;
	}

	public void setnombrecuenta(String nombrecuenta) {
		this.nombrecuenta = nombrecuenta;
	}

	public String getRutavideo() {
		return rutavideo;
	}

	public void setRutavideo(String rutavideo) {
		this.rutavideo = rutavideo;
	}

	public String getPostcomentario() {
		return postcomentario;
	}

	public void setPostcomentario(String postcomentario) {
		this.postcomentario = postcomentario;
	}
}
