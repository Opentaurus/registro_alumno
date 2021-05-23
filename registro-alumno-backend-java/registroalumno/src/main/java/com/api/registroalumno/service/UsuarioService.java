package com.api.registroalumno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.registroalumno.entity.UsuarioEntity;
import com.api.registroalumno.repository.UsuarioInterface;

@Service
public class UsuarioService {
	@Autowired 
	UsuarioInterface iusuario;
	public String[][] valida(UsuarioEntity usuario)
	{		
		int opcion=5;		
		return iusuario.vUsuario(opcion,usuario.getUsuario_id()
				,usuario.getUsuario()	
				,usuario.getPassword());
	}
}
