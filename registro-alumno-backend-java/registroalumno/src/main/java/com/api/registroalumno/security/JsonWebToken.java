package com.api.registroalumno.security;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JsonWebToken {
	private String Token;
    private String Clave;    
    private long Milisegundos;
    
	public JsonWebToken(long miliSegundos)
	{				
		this.Clave = "PabloCapitulo83Verso6";	
		this.Milisegundos=miliSegundos;
	}
	
	public String getToken(int usuarioId,String usuario)
	{
		this.Token=crearToken(usuarioId, usuario);
		return this.Token;
	}
	
	private String crearToken(int usuarioId,String usuario)
	{
		String Token = "";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN");	
		Token = Jwts
				.builder()
				.setId(usuarioId+usuario)
				.setSubject(usuario)
				.claim("authorities",grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(this.Milisegundos))				
				.signWith(SignatureAlgorithm.HS512,this.Clave.getBytes()).compact();	
		return Token;				
	}
}
