package com.api.registroalumno.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.registroalumno.entity.AlumnoEntity;


@Repository
public interface AlumnoInterface extends JpaRepository<AlumnoEntity,Long> {
	@Query(value="call usp_get_alumno(0)",nativeQuery=true)
	List<AlumnoEntity> getAlumno();
	
	@Query(value="call usp_get_alumno(:P_ALUMNO_ID)",nativeQuery=true)
	List<AlumnoEntity>getAlumnoById(@Param("P_ALUMNO_ID") int id);
	
	@Query(value="call usp_iud_alumno(:P_OPTION"
			+ ",:P_ALUMNO_ID"
			+ ",:P_NOMBRE"
			+ ",:P_APELLIDO_PATERNO"
			+ ",:P_APELLIDO_MATERNO"
			+ ",:P_FECHA_NACIMIENTO"
			+ ",:P_SEXO"
			+ ",:P_GRADO_ESTUDIO_ACTUAL"
			+ ",:P_EMAIL"
			+ ",:P_TELEFONO"			
			+ ")",nativeQuery=true)
	
	String[][] iudAlumno(
			 @Param("P_OPTION") int option,
			 @Param("P_ALUMNO_ID") int alumno_id,
			 @Param("P_NOMBRE") String nombre,  
			 @Param("P_APELLIDO_PATERNO") String apellidoPaterno,
			 @Param("P_APELLIDO_MATERNO") String apellidoMaterno,
			 @Param("P_FECHA_NACIMIENTO") Date fechaNacimiento,
			 @Param("P_SEXO") String sexo, 
			 @Param("P_GRADO_ESTUDIO_ACTUAL") String gradoEstudioActual, 
			 @Param("P_EMAIL") String email,
			 @Param("P_TELEFONO") long telefono
			);
}
