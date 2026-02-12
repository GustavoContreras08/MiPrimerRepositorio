package com.mx.Cliente.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Cliente.Entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	//metodos personalizados
	
	//validar que el cliente no se duplique
	public boolean existsByNombreAndEmailAllIgnoreCase(String nombre, String email);
	public boolean existsByTelefono(Long telefono);
	
	public List<Cliente> findByTiendaId(int tiendaId);
	
	

}
