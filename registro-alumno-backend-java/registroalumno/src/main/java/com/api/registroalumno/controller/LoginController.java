package com.api.registroalumno.controller;

import org.springframework.http.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.registroalumno.entity.RespuestaLoginEntity;
import com.api.registroalumno.entity.UsuarioEntity;
import com.api.registroalumno.security.JsonWebToken;
import com.api.registroalumno.service.UsuarioService;

@RestController
@CrossOrigin(origins = "*")

@RequestMapping("/registroalumno/login")
public class LoginController {
	@Autowired
	UsuarioService usuarioService;
	@GetMapping(produces= {MediaType.APPLICATION_JSON_VALUE})
	public RespuestaLoginEntity login()
	{						
		RespuestaLoginEntity respuesta=new RespuestaLoginEntity(0,"","",0,0);
		return respuesta;	
	}
	
	@PostMapping(produces= {MediaType.APPLICATION_JSON_VALUE})
	public RespuestaLoginEntity login(@RequestBody UsuarioEntity usuario)
	{						
		String[][] lista= usuarioService.valida(usuario);
		String Token="";		
		if (Integer.valueOf(lista[0][0])==1)
			{		
			JsonWebToken jwt = new JsonWebToken(Long.parseLong(lista[0][2]));
			Token=jwt.getToken(Integer.valueOf(lista[0][3]),usuario.getUsuario());			 	 
			}
		RespuestaLoginEntity respuesta=new RespuestaLoginEntity(
					Integer.valueOf(lista[0][0])
					,lista[0][1].toString()
					,Token
					,Long.parseLong(lista[0][2])
					,Integer.valueOf(lista[0][3])
				);
	return respuesta;		
	}		
}
