package com.api.registroalumno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.registroalumno.entity.AlumnoEntity;
import com.api.registroalumno.repository.AlumnoInterface;

@Service
public class AlumnoService {
	@Autowired 
	AlumnoInterface ialumno;
	public List<AlumnoEntity> get()
	{
		return ialumno.getAlumno();
	}
	
	public List<AlumnoEntity> getById(int id)
	{
		return ialumno.getAlumnoById(id);
	}
	
	public String[][] insert(AlumnoEntity alumno)
	{		
		int opcion=1;
		return ialumno.iudAlumno(opcion,alumno.getAlumno_id()
				,alumno.getNombre()
				,alumno.getApellido_paterno()
				,alumno.getApellido_materno()
				,alumno.getFecha_nacimiento()
				,alumno.getSexo()
				,alumno.getGrado_estudio_actual()
				,alumno.getEmail()
				,alumno.getTelefono()
				);
	}
}
