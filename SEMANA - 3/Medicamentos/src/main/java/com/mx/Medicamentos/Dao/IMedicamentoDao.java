package com.mx.Medicamentos.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mx.Medicamentos.Dominio.Medicamento;

@Repository
public interface IMedicamentoDao extends JpaRepository<Medicamento, Integer>{
	
	@Procedure(procedureName = "AUMENTAR_STOCK")
	public void aumentarStock(@Param("NOM") String nombre, @Param("A_STOCK") Integer aumento);
	
	@Procedure(procedureName = "DESCUENTO_STOCK")
	public void descontarStock(@Param("NOM") String nombre, @Param("D_STOCK") Integer descuento);
	
	@Procedure(procedureName = "ELIMINAR")
	public void eliminar(@Param("ID_BORRAR") Integer idMedicamento);
	
	@Procedure(procedureName = "DESCUENTO")
	public void descuento(@Param("P_DESCUENTO") Integer pDescuento);

}