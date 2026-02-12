package com.mx.Producto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Producto.Entity.Producto;
import com.mx.Producto.Service.ProductoService;

@RestController
@RequestMapping(path = "/producto")
@CrossOrigin
public class ProductoController {
	
	@Autowired
	private ProductoService service;
	
	@GetMapping
	public ResponseEntity<List<Producto>> listar(){
		if(service.listar().isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(service.listar());
		}
	}
	
	@PostMapping
	public ResponseEntity<?> guardar(@RequestBody Producto producto){
			service.guardar(producto);
			return ResponseEntity.status(HttpStatus.CREATED).body("Se registro con exito");
		}
	
	
	@PutMapping
	public ResponseEntity<?> editar(@RequestBody Producto producto){
		if (!service.existePorId(producto.getIdProducto())) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el cliente con ID: " + producto.getIdProducto());
	    }
		
		service.guardar(producto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Se edito con exito");
	}
	
	
	@DeleteMapping("/{idProducto}")
	public ResponseEntity<?> eliminar(@PathVariable Integer idProducto) {
	    boolean existe = service.existePorId(idProducto);
	    if (!existe) {
	        return ResponseEntity.notFound().build();
	    }

	    service.eliminar(idProducto);
	    return ResponseEntity.ok("Producto eliminado correctamente");
	}
	
	
	@GetMapping("/{idProducto}")
	public ResponseEntity<Producto> buscar(@PathVariable Integer idProducto) {
	    Producto producto = service.buscar(idProducto);

	    if (producto != null) {
	        return ResponseEntity.ok(producto);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

}
