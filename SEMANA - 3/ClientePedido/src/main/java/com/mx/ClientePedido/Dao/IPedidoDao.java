package com.mx.ClientePedido.Dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mx.ClientePedido.Dominio.Pedido;

@Repository
public interface IPedidoDao extends JpaRepository<Pedido, Integer>{
	
	@Query("SELECT p FROM Pedido p WHERE p.fecha = :fecha")
	List<Pedido> findByFecha(@Param("fecha") LocalDate fecha);
	
}
