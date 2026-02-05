package com.mx.Libro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Libro.Dominio.Libro;
import com.mx.Libro.Service.LibroServiceImp;

@RestController //es una anotacion que indica que mi clase es una clase controlador que manejara peticiones HTTP y retornara respuestas
@RequestMapping(path = "api/libro") //indica la ruta de mi clase controlador y que tofod mis metodos de esta clase se llevara dicha ruta
@CrossOrigin //configura el cors para que los cominios puedan acceder a mi clase de controlador y de los metodos, (esta funcion es solo para pruebas, nunca para produccion)
public class LibroController {
	
	//Inyectar la logica de negocios
	@Autowired
	private LibroServiceImp service;
	
	//listar -> http://localhost:8000/api/libro/listar
	@GetMapping(path = "listar")
	public List<Libro> listar(){
		return service.mostrar();
	}
	
	//guardar -> http://localhost:8000/api/libro/guardar
	@PostMapping(path = "guardar")
	public void guardar(@RequestBody Libro libro) {
		service.guardar(libro);
	}
	
	//editar -> http://localhost:8000/api/libro/editar
	@PutMapping(path = "editar")
	public void editar(@RequestBody Libro libro) {
		service.editar(libro);
	}
	
	//buscar -> http://localhost:8000/api/libro/buscar
	@PostMapping(path = "buscar")
	public Libro buscar(@RequestBody Libro libro) {
		return service.buscar(libro);
	}
	
	//eliminar -> http://localhost:8000/api/libro/eliminar
	@DeleteMapping(path = "eliminar")
	public void eliminar(@RequestBody Libro libro) {
		service.eliminar(libro);
	}
}
