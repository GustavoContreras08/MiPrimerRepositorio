package com.mx.Medicamentos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Medicamentos.Dominio.Medicamento;
import com.mx.Medicamentos.Service.MedicamentoService;

@RestController
@RequestMapping(path = "api/medicamento")
@CrossOrigin
public class MedicamentoController {
	
	@Autowired
	private MedicamentoService service;
	
	@GetMapping(path = "/listar")
	public ResponseEntity<?> listar(){
		if(service.listar().isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(service.listar());
		}
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<String> guardar(@RequestBody Medicamento medicamento){
	    service.guardar(medicamento);
	    return ResponseEntity.status(HttpStatus.CREATED).body("El medicamento se registró con éxito");
	}
	
	
	@PostMapping("/aumentarStock")
	public ResponseEntity<?> aumentarStock(@RequestParam String nombre ,@RequestParam Integer aumento){
		try {
			service.aumentarStock(nombre, aumento);
			return ResponseEntity.ok("Se aumentaron  " + aumento + " al Stock del medicamento " + nombre);
		}catch(Exception e){
			return ResponseEntity.badRequest().body("Ocurrio un error " + e.getMessage());			
		}
	}
	
	@PostMapping("/descontarStock")
	public ResponseEntity<?> descontarStock(@RequestParam String nombre ,@RequestParam Integer descuento){
		try {
			service.descontarStock(nombre, descuento);
			return ResponseEntity.ok("Se descontaron  " + descuento + " al Stock del medicamento " + nombre);
		}catch(Exception e){
			return ResponseEntity.badRequest().body("Ocurrio un error " + e.getMessage());			
		}
	}
	
	@PostMapping("/eliminar")
	public ResponseEntity<?> eliminar(@RequestParam Integer idMedicamento){
		try {
			service.eliminar(idMedicamento);
			return ResponseEntity.ok("Se elimino el medicamento con ID: " + idMedicamento);
		}catch(Exception e){
			return ResponseEntity.badRequest().body("Ocurrio un error " + e.getMessage());			
		}
	}
	
	@PostMapping("/descuento")
	public ResponseEntity<?> descuento(@RequestParam Integer pDescuento){
		try {
			service.descuento(pDescuento);
			return ResponseEntity.ok("Se aplico un descuento del " + pDescuento + "% a todos los medicamentos");
		}catch(Exception e){
			return ResponseEntity.badRequest().body("Ocurrio un error " + e.getMessage());			
		}
	}
}
