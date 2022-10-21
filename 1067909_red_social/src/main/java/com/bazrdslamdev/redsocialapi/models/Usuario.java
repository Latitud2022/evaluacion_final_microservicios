package com.bazrdslamdev.redsocialapi.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity(name = "Usuario")
@Table(name = "\"Usuarios\"", schema = "public")
@OnDelete(action = OnDeleteAction.CASCADE)
@PrimaryKeyJoinColumn(name = "id", foreignKey = @ForeignKey(name = "fk_usuario_cuenta"))
public class Usuario extends Cuenta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "nombreusuario", nullable = false)
	private String nombreusuario;

	@Column(name = "estatususuario", nullable = false)
	private Double estatususuario;
	
	@JsonIdentityInfo(
			generator = ObjectIdGenerators.PropertyGenerator.class,
			property = "key"
			)
	@JsonIdentityReference(alwaysAsId = true)
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Publicacion> publicaciones;

	public String getNombreusuario() {
		return nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public Double getEstatususuario() {
		return estatususuario;
	}

	public void setEstatususuario(Double estatususuario) {
		this.estatususuario = estatususuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(List<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
	
	
}
