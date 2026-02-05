package com.mx.VideoJuegos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.VideoJuegos.Dominio.Videojuego;
import com.mx.VideoJuegos.Service.VideojuegoServiceImp;

@RestController 
@RequestMapping(path = "api/videojuego") 
@CrossOrigin
public class VideojuegoController {
	
	@Autowired
	private VideojuegoServiceImp service;
	
		//listar -> http://localhost:8001/api/videojuego/listar
		@GetMapping(path = "listar")
		public List<Videojuego> listar(){
			return service.mostrar();
		}
		
		//guardar -> http://localhost:8001/api/videojuego/guardar
		@PostMapping(path = "guardar")
		public void guardar(@RequestBody Videojuego videojuego) {
			service.guardar(videojuego);
		}
		
		//editar -> http://localhost:8001/api/videojuego/editar
		@PutMapping(path = "editar")
		public void editar(@RequestBody Videojuego videojuego) {
			service.editar(videojuego);
		}
		
		//buscar -> http://localhost:8001/api/videojuego/buscar
		@PostMapping(path = "buscar")
		public Videojuego buscar(@RequestBody Videojuego videojuego) {
			return service.buscar(videojuego);
		}
		
		//eliminar -> http://localhost:8001/api/videojuego/eliminar
		@DeleteMapping(path = "eliminar")
		public void eliminar(@RequestBody Videojuego videojuego) {
			service.eliminar(videojuego);
		}

}
