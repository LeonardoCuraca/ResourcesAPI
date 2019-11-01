package com.resource.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="negocio")
public class Negocio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer neg_id;
	private String neg_nombre;
	private String neg_detalles;
	private String neg_direccion;
	private String neg_email;
	private String neg_codigo_postal;
	private String neg_password;
	private String neg_telefono;
	private Long neg_usuario;
	
	public Negocio() {
		
	}
	
	public Negocio(Integer neg_id, String neg_nombre, String neg_detalles, String neg_direccion, String neg_email,
			String neg_codigo_postal, String neg_password, String neg_telefono, Long neg_usuario) {
		super();
		this.neg_id = neg_id;
		this.neg_nombre = neg_nombre;
		this.neg_detalles = neg_detalles;
		this.neg_direccion = neg_direccion;
		this.neg_email = neg_email;
		this.neg_codigo_postal = neg_codigo_postal;
		this.neg_password = neg_password;
		this.neg_telefono = neg_telefono;
		this.neg_usuario = neg_usuario;
	}

	public Integer getNeg_id() {
		return neg_id;
	}

	public void setNeg_id(Integer neg_id) {
		this.neg_id = neg_id;
	}

	public String getNeg_nombre() {
		return neg_nombre;
	}

	public void setNeg_nombre(String neg_nombre) {
		this.neg_nombre = neg_nombre;
	}

	public String getNeg_detalles() {
		return neg_detalles;
	}

	public void setNeg_detalles(String neg_detalles) {
		this.neg_detalles = neg_detalles;
	}

	public String getNeg_direccion() {
		return neg_direccion;
	}

	public void setNeg_direccion(String neg_direccion) {
		this.neg_direccion = neg_direccion;
	}

	public String getNeg_email() {
		return neg_email;
	}

	public void setNeg_email(String neg_email) {
		this.neg_email = neg_email;
	}

	public String getNeg_codigo_postal() {
		return neg_codigo_postal;
	}

	public void setNeg_codigo_postal(String neg_codigo_postal) {
		this.neg_codigo_postal = neg_codigo_postal;
	}

	public String getNeg_password() {
		return neg_password;
	}

	public void setNeg_password(String neg_password) {
		this.neg_password = neg_password;
	}

	public String getNeg_telefono() {
		return neg_telefono;
	}

	public void setNeg_telefono(String neg_telefono) {
		this.neg_telefono = neg_telefono;
	}

	public Long getNeg_usuario() {
		return neg_usuario;
	}

	public void setNeg_usuario(Long neg_usuario) {
		this.neg_usuario = neg_usuario;
	}

	@Override
	public String toString() {
		return "Negocio [neg_id=" + neg_id + ", neg_nombre=" + neg_nombre + ", neg_detalles=" + neg_detalles
				+ ", neg_direccion=" + neg_direccion + ", neg_email=" + neg_email + ", neg_codigo_postal="
				+ neg_codigo_postal + ", neg_password=" + neg_password + ", neg_telefono=" + neg_telefono
				+ ", neg_usuario=" + neg_usuario + "]";
	}

	
}
