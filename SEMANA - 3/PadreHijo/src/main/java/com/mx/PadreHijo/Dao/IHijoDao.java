package com.mx.PadreHijo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mx.PadreHijo.Dominio.Hijo;

@Repository
public interface IHijoDao extends JpaRepository<Hijo, Integer>{
	
	//metodo que aplique una consulta presonalizada a un abase de datos
	//buscar hijos por hobbie
	@Query("SELECT h FROM Hijo h WHERE UPPER(h.hobbie) = UPPER(:hobbie)")
	public List<Hijo> findByHobbie(@Param("hobbie") String hobbie);

}
