package com.mx.Computadora.Controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Computadora.Dominio.Computadora;
import com.mx.Computadora.Service.ComputadoraService;

@RestController //Configura la clase como un web services y nos permite utlilizar portocolos 
//http(solicitudes [request] y respuestas [responde])
@RequestMapping(path = "api/Compu") //especifica la ruta de mis controladores, para que cunado el cliente haga una peticion, tenga un nombre especifico de mi url
//anotarlo en este lado clase es como poner un prefijo(lada)
@CrossOrigin //permite que los dominios puedan hacer peticiones de mi clase controllador
public class ComputadoraController {

	@Autowired
	private ComputadoraService service;
	
	//Especifica la ruta de mi metodo que podra ser consumido, especificamente GetMapping,
	//me ayuda a indicar que el consumpo sera a travez de una solicitud de tipo GET, con la URL + posible recurso extra y sin ningun body
	@GetMapping(path = "listar")
	public ResponseEntity<?> listar(){
		if(service.listar().isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(service.listar());
		}
	}
	
	
	//METODO GUARDAR
	@PostMapping("guardar")
	public ResponseEntity<String> guardar(@RequestBody Computadora computadora){
		Computadora encontrado = service.buscar(computadora.getIdCompu2());
	    if(encontrado != null){
	        return ResponseEntity.status(HttpStatus.CONFLICT).body("El ID ya existe");
	    }else {
	    	service.guardar(computadora);
	    	return ResponseEntity.status(HttpStatus.CREATED).body("La Computadora se registró con éxito");
	    }
	}
	
	//METODO EDITAR
	@PutMapping("editar")
	public ResponseEntity<String> editar(@RequestBody Computadora computadora){
		Computadora encontrado = service.buscar(computadora.getIdCompu2());
		if(encontrado != null) {
			service.guardar(computadora);
		    return ResponseEntity.status(HttpStatus.CREATED).body("La Computadora se edito con exito con éxito");
		}else {

		    return ResponseEntity.status(HttpStatus.CREATED).body("El id no existe");
		}
	}
	
	//METODO DELETE
	@DeleteMapping("eliminar/{idCompu2}")
	public ResponseEntity<String> eliminar(@PathVariable int idCompu2){
		Computadora encontrado = service.buscar(idCompu2);
		if(encontrado == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se puede eliminar, porque no exixte");
		}else {
			service.eliminar(idCompu2);
			return ResponseEntity.ok("Eliminacion Exiosa");
		}
	}
	
	//METODO BUSCARPORID
	@GetMapping("buscar/{idCompu2}")
	public ResponseEntity<?> buscar(@PathVariable int idCompu2){
		Computadora encontrado = service.buscar(idCompu2);
		if(encontrado == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existe esa computadora");
		}else {
			return ResponseEntity.ok(encontrado);
		}
	}
	
	@PostMapping("/aplicarDescuento")
	public ResponseEntity<?> aplicarDescuento(@RequestParam Integer pDescuento){
		try {
			service.aplicarDescuento(pDescuento);
			return ResponseEntity.ok("Descuento del " + pDescuento + "% aplicado exitosamente");
		}catch(Exception e){
			return ResponseEntity.badRequest().body("Ocurrio un error " + e.getMessage());			
		}
	}
}
	
