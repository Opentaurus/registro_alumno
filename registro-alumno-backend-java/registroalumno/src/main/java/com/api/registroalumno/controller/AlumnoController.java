package com.api.registroalumno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.registroalumno.entity.AlumnoEntity;
import com.api.registroalumno.entity.RespuestaEntity;
import com.api.registroalumno.service.AlumnoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/registroalumno/alumno")
public class AlumnoController {
	@Autowired
	AlumnoService alumnoService;	
	
	@GetMapping
	public List<AlumnoEntity> alumno()
	{
		List<AlumnoEntity> listaAlumnos= alumnoService.get();						
		return listaAlumnos;
	}	 
	
	@PostMapping(produces= {MediaType.APPLICATION_JSON_VALUE})
	public RespuestaEntity alumno(@RequestBody AlumnoEntity alumno)
	{		
		String[][] res= alumnoService.insert(alumno);
		RespuestaEntity respuesta=new RespuestaEntity(Integer.valueOf(res[0][0]),res[0][1].toString());
		return respuesta;	
	}
}
