package com.mx.Cliente.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Cliente.Entity.Cliente;
import com.mx.Cliente.Service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "/C")
@CrossOrigin

public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> listar(){
		if(service.listar().isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(service.listar());
		}
	}
	
	@PostMapping
	public ResponseEntity<?> guardar(@RequestBody Cliente cliente){
		boolean existeTelefono = service.existeTelefono(cliente.getTelefono());
		if(existeTelefono) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("El telefono ya existe");
		}
		boolean existeCliente = service.existeCliente(cliente.getNombre(), cliente.getEmail());
		if(existeCliente) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Ese cliente ya existe");
		}else {
			service.guardar(cliente);
			return ResponseEntity.status(HttpStatus.CREATED).body("Se registro con exito");
		}
	}
	
	@PutMapping
	public ResponseEntity<?> editar(@RequestBody Cliente cliente){
		if (!service.existePorId(cliente.getIdCliente())) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND)
	                .body("No se encontró el cliente con ID: " + cliente.getIdCliente());
	    }
		
		service.guardar(cliente);
		return ResponseEntity.status(HttpStatus.CREATED).body("Se edito con exito");
	}
	
	@DeleteMapping("/{idCliente}")
	public ResponseEntity<?> eliminar(@PathVariable Integer idCliente) {
	    boolean existe = service.existePorId(idCliente);
	    if (!existe) {
	        return ResponseEntity.notFound().build();
	    }

	    service.eliminar(idCliente);
	    return ResponseEntity.ok("Cliente eliminado correctamente");
	}
	
	
	@GetMapping("/tienda/{idTienda}")
	public ResponseEntity<List<Cliente>> listarPorTienda(@PathVariable Integer idTienda) {
	    List<Cliente> clientes = service.listarPorTienda(idTienda);

	    if (clientes.isEmpty()) {
	        return ResponseEntity.noContent().build();
	    } else {
	        return ResponseEntity.ok(clientes);
	    }
	}
	
	@GetMapping("/{idCliente}")
	public ResponseEntity<Cliente> buscar(@PathVariable Integer idCliente) {
	    Cliente cliente = service.buscar(idCliente);

	    if (cliente != null) {
	        return ResponseEntity.ok(cliente);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

	
}
