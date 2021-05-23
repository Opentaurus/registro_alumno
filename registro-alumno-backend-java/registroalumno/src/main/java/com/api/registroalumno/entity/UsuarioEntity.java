package com.api.registroalumno.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsuarioEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int usuario_id;
	private String usuario;
	private String password;
	
	public UsuarioEntity() 
	{
		
	}
	public UsuarioEntity(int usuario_id, String usuario, String password) {
		super();
		this.usuario_id = usuario_id;
		this.usuario = usuario;
		this.password = password;
	}
	
	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	

}
