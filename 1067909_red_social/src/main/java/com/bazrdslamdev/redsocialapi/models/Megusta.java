package com.bazrdslamdev.redsocialapi.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity(name = "Megusta")
@Table(name = "\"Seguidores\"", schema = "public")
@OnDelete(action = OnDeleteAction.CASCADE)
@PrimaryKeyJoinColumn(name = "id", foreignKey = @ForeignKey(name = "fk_megusta_cuenta"))
public class Megusta extends Cuenta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "nombreseguidorcuenta", columnDefinition = "boolean DEFAULT 'false'")
	private Boolean nombreseguidorcuenta = false;
	
	//State = 1:Inscrito, 2:Retirado, 3:Graduado, etc
	@Column(name = "estatusseguidor", columnDefinition = "integer DEFAULT '1'")
	private Integer estatusseguidor = 1;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
			name = "\"Megusta\"",
			joinColumns = @JoinColumn(
					name = "seguidor_id",
					referencedColumnName = "id",
					foreignKey = @ForeignKey(
							name = "fk_megusta_publicacion",
							foreignKeyDefinition = "FOREIGN KEY (seguidor_id)\r\n" + 
									"        REFERENCES public.\"Seguidores\" (id) MATCH SIMPLE\r\n" + 
									"        ON UPDATE CASCADE\r\n" + 
									"        ON DELETE CASCADE",
									value = ConstraintMode.CONSTRAINT
							)
					),
			inverseJoinColumns = @JoinColumn(
					name = "publicacion_key",
					referencedColumnName = "key",
					foreignKey = @ForeignKey(
							name = "fk_publicacion_megusta",
							foreignKeyDefinition = "FOREIGN KEY (publicacion_key)\r\n" + 
									"        REFERENCES public.\"Publicaciones\" (key) MATCH SIMPLE\r\n" + 
									"        ON UPDATE CASCADE\r\n" + 
									"        ON DELETE CASCADE",
									value = ConstraintMode.CONSTRAINT
							)
					),
			uniqueConstraints = @UniqueConstraint(name = "composite_key", columnNames = {"seguidor_id", "publicacion_key"})
			)
	private List<Publicacion> enrolled_publicaciones;

	public Boolean getSocialship() {
		return nombreseguidorcuenta;
	}

	public void setSocialship(Boolean nombreseguidorcuenta) {
		this.nombreseguidorcuenta = nombreseguidorcuenta;
	}

	public Integer getState() {
		return estatusseguidor;
	}

	public void setState(Integer estatusseguidor) {
		this.estatusseguidor = estatusseguidor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Publicacion> getEnrolled_publicaciones() {
		return enrolled_publicaciones;
	}

	public void setEnrolled_publicaciones(List<Publicacion> enrolled_publicaciones) {
		this.enrolled_publicaciones = enrolled_publicaciones;
	}
	
	

}
