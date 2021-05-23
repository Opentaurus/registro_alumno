package com.api.registroalumno.entity;

public class RespuestaLoginEntity {
	private int Resultado;
	private String Mensaje;
	private String Token;
	private long Unix;
	private int UserId;
	public RespuestaLoginEntity()
	{
		
	}	
	public RespuestaLoginEntity(int resultado, String mensaje, String token, long unix, int userId) {
		super();
		Resultado = resultado;
		Mensaje = mensaje;
		Token = token;
		Unix = unix;
		UserId = userId;
	}
	public int getResultado() {
		return Resultado;
	}
	public void setResultado(int resultado) {
		Resultado = resultado;
	}
	public String getMensaje() {
		return Mensaje;
	}
	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
	public String getToken() {
		return Token;
	}
	public void setToken(String token) {
		Token = token;
	}
	public long getUnix() {
		return Unix;
	}
	public void setUnix(long unix) {
		Unix = unix;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
}
