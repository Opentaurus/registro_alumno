package com.api.registroalumno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.registroalumno.entity.UsuarioEntity;

@Repository
public interface UsuarioInterface extends JpaRepository<UsuarioEntity,Long> {
	@Query(value="call usp_v_usuario(:P_OPTION"
			+ ",:P_USUARIO_ID"
			+ ",:P_USUARIO"
			+ ",:P_PASSWORD"			
			+ ")",nativeQuery=true)
	
	String[][]  vUsuario(
			 @Param("P_OPTION") int option,
			 @Param("P_USUARIO_ID") int alumno_id,
			 @Param("P_USUARIO") String nombre,  
			 @Param("P_PASSWORD") String apellidoPaterno
			);
}
