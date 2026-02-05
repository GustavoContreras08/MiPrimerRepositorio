package com.mx.ClientePedido.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ClientePedido.Dominio.Cliente;
import com.mx.ClientePedido.Service.ClienteService;

@RestController
@RequestMapping(path = "/api/cliente")
@CrossOrigin
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping("listar")
	public ResponseEntity<?> listar(){
		List<Cliente> clientes = service.listar();
		
		if (clientes.isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(clientes);
		}
	}
	
	@PostMapping("guardar")
	public ResponseEntity<String> guardar(@RequestBody Cliente cliente){

	    Cliente encontrado = service.buscar(cliente.getIdCliente());
	    if(encontrado != null){
	        return ResponseEntity.status(HttpStatus.CONFLICT).body("El ID ya existe");
	    }

	    Cliente duplicado = service.buscarPorNombreYCiudad(cliente.getNombre(),cliente.getCiudad()
	    );

	    if(duplicado != null){
	        return ResponseEntity.status(HttpStatus.CONFLICT).body("Ya existe un cliente con el mismo nombre y ciudad");
	    }

	    service.guardar(cliente);
	    return ResponseEntity.status(HttpStatus.CREATED).body("El cliente se registró con éxito");
	}

	
	@PutMapping("editar")
	public ResponseEntity<String> editar(@RequestBody Cliente cliente){

	    Cliente encontrado = service.buscar(cliente.getIdCliente());

	    if(encontrado == null){
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El ID que intentas editar no existe");
	    }

	    Cliente duplicado = service.buscarPorNombreYCiudad( cliente.getNombre(),cliente.getCiudad());

	    if(duplicado != null && duplicado.getIdCliente() != cliente.getIdCliente()){
	        return ResponseEntity.status(HttpStatus.CONFLICT).body("Ya existe otro cliente con el mismo nombre y ciudad");
	    }

	    if(encontrado.getNombre().equals(cliente.getNombre()) && encontrado.getCiudad().equals(cliente.getCiudad())){
	        
	        return ResponseEntity.status(HttpStatus.CONFLICT).body("No se puede editar porque la información es idéntica");
	    }

	    service.guardar(cliente);
	    return ResponseEntity.ok("Edición exitosa");
	}


	
	@GetMapping("buscar/{idCliente}")
	public ResponseEntity<?> buscar(@PathVariable int idCliente){
		Cliente encontrado = service.buscar(idCliente);
		if(encontrado == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existe ese registro");
		}else {
			return ResponseEntity.ok(encontrado);
		}
	}
	
	@GetMapping("eliminar/{idCliente}")
	public ResponseEntity<String> eliminar(@PathVariable int idCliente){
		Cliente encontrado = service.buscar(idCliente);
		if(encontrado == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se puede eliminar, porque no exixte");
		}else {
			service.eliminar(idCliente);
			return ResponseEntity.ok("Eliminacion Exiosa");
		}
	}
	
	@GetMapping("buscarPorNombre/{nombre}")
	public ResponseEntity<?> buscarPorNombre(@PathVariable String nombre){
		Cliente encontrado = service.buscarPorNombre(nombre);
		if(encontrado == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existe el nombre");
		}else {
			return ResponseEntity.ok(encontrado);
		}
	}

}
