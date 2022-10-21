package com.bazrdslamdev.redsocialapi.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity(name = "Publicacion")
@Table(name = "\"Publicaciones\"", schema = "public")
public class Publicacion implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//KEY = 1, 2, 3, ...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "key")
	private Long key;
	
	@ManyToOne
	@JoinColumn(
			name = "usuario_id",
			referencedColumnName = "id",
			foreignKey = @ForeignKey(
					name = "fk_publicacion_usuario",
					foreignKeyDefinition = "FOREIGN KEY (usuario_id)\r\n" + 
							"        REFERENCES public.\"Usuarios\" (id) MATCH SIMPLE\r\n" + 
							"        ON UPDATE CASCADE\r\n" + 
							"        ON DELETE CASCADE",
							value = ConstraintMode.CONSTRAINT
					)
			)
	private Usuario usuario;
	
	@Column(name = "nombrepublicacion", nullable = false, unique = true)
	private String name;
	
	@Column(name = "publicacion_date", nullable = false, columnDefinition = "date DEFAULT 'now()'")
	private LocalDate publicacion_date = ZonedDateTime.now(ZoneId.of("America/Mexico_City")).toLocalDate();
	
		@JsonIdentityInfo(
			generator = ObjectIdGenerators.PropertyGenerator.class,
			property = "id"
			)
	@JsonIdentityReference(alwaysAsId = true)
	@ManyToMany(mappedBy = "enrolled_publicaciones", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	private List<Megusta> enrolled_megustas;
	
	public Long getKey() {
		return key;
	}

	public void setKey(Long key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStart_date() {
		return publicacion_date;
	}

	public void setStart_date(LocalDate publicacion_date) {
		this.publicacion_date = publicacion_date;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Megusta> getEnrolled_megustas() {
		return enrolled_megustas;
	}

	public void setEnrolled_megustas(List<Megusta> enrolled_megustas) {
		this.enrolled_megustas = enrolled_megustas;
	}
	
	

}
