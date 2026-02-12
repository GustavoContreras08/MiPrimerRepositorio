package com.mx.Producto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.Producto.Entity.Producto;
import com.mx.Producto.Repository.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository repo;
	
	public List<Producto> listar(){
		return repo.findAll(Sort.by(Sort.Direction.ASC, "nombre"));
	}
	
	public void guardar(Producto producto) {
		repo.save(producto);
	}
	
	public void eliminar(int idProducto) {
		repo.deleteById(idProducto);
	}
	
	public Producto buscar(int idProducto) {
		return repo.findById(idProducto).orElse(null);
	}
	
	public boolean existePorId(Integer idProducto) {
	    return repo.existsById(idProducto);
	}
	
}
