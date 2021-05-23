package com.api.registroalumno.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class AlumnoEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int alumno_id;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private Date fecha_nacimiento;
	private String sexo;
	private String grado_estudio_actual;
	private String email;
	private Long telefono;
	
	public AlumnoEntity()
	{
		
	}	
	public AlumnoEntity(int alumno_id, String nombre, String apellido_paterno, String apellido_materno,
			Date fecha_nacimiento, String sexo, String grado_estudio_actual, String email, Long telefono) {
		super();
		this.alumno_id = alumno_id;
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
		this.grado_estudio_actual = grado_estudio_actual;
		this.email = email;
		this.telefono = telefono;
	}
	
	public int getAlumno_id() {
		return alumno_id;
	}
	public void setAlumno_id(int alumno_id) {
		this.alumno_id = alumno_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	public String getApellido_materno() {
		return apellido_materno;
	}
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getGrado_estudio_actual() {
		return grado_estudio_actual;
	}
	public void setGrado_estudio_actual(String grado_estudio_actual) {
		this.grado_estudio_actual = grado_estudio_actual;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	
}
