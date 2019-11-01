package com.resource.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	private Integer usu_id;
	private String usu_nombre;
	private String usu_apellido;
	private String usu_email;
	private String usu_detalle;
	private String usu_password;
	private String usu_sexo;
	
	public Usuario() {
		
	}
	
	public Usuario(Integer usu_id, String usu_nombre, String usu_apellido, String usu_email, String usu_detalle,
			String usu_password, String usu_sexo) {
		super();
		this.usu_id = usu_id;
		this.usu_nombre = usu_nombre;
		this.usu_apellido = usu_apellido;
		this.usu_email = usu_email;
		this.usu_detalle = usu_detalle;
		this.usu_password = usu_password;
		this.usu_sexo = usu_sexo;
	}

	public Integer getUsu_id() {
		return usu_id;
	}

	public void setUsu_id(Integer usu_id) {
		this.usu_id = usu_id;
	}

	public String getUsu_nombre() {
		return usu_nombre;
	}

	public void setUsu_nombre(String usu_nombre) {
		this.usu_nombre = usu_nombre;
	}

	public String getUsu_apellido() {
		return usu_apellido;
	}

	public void setUsu_apellido(String usu_apellido) {
		this.usu_apellido = usu_apellido;
	}

	public String getUsu_email() {
		return usu_email;
	}

	public void setUsu_email(String usu_email) {
		this.usu_email = usu_email;
	}

	public String getUsu_detalle() {
		return usu_detalle;
	}

	public void setUsu_detalle(String usu_detalle) {
		this.usu_detalle = usu_detalle;
	}

	public String getUsu_password() {
		return usu_password;
	}

	public void setUsu_password(String usu_password) {
		this.usu_password = usu_password;
	}

	public String getUsu_sexo() {
		return usu_sexo;
	}

	public void setUsu_sexo(String usu_sexo) {
		this.usu_sexo = usu_sexo;
	}

	@Override
	public String toString() {
		return "Usuario [usu_id=" + usu_id + ", usu_nombre=" + usu_nombre + ", usu_apellido=" + usu_apellido
				+ ", usu_email=" + usu_email + ", usu_detalle=" + usu_detalle + ", usu_password=" + usu_password
				+ ", usu_sexo=" + usu_sexo + "]";
	}
	
	

}
