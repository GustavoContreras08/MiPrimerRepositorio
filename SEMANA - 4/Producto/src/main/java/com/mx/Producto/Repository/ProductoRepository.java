package com.mx.Producto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Producto.Entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	
		public boolean existsByNombre(String nombre);

}
