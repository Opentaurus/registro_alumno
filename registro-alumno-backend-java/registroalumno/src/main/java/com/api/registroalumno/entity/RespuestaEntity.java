package com.api.registroalumno.entity;

public class RespuestaEntity {
	private int Resultado;
	private String Mensaje;
	
	public RespuestaEntity()
	{
		
	}
	public RespuestaEntity(int resultado, String mensaje) {
		super();
		Resultado = resultado;
		Mensaje = mensaje;
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
}
