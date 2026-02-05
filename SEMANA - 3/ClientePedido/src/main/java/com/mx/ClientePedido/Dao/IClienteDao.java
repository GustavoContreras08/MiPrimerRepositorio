package com.mx.ClientePedido.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.ClientePedido.Dominio.Cliente;

@Repository
public interface IClienteDao extends JpaRepository<Cliente, Integer>{
	
	public Cliente findByNombreAllIgnoringCase(String nombre);
	
	Cliente findByNombreAndCiudad(String nombre, String ciudad);


}
