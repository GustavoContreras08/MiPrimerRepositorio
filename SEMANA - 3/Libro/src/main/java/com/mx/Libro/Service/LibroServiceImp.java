package com.mx.Libro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Libro.Dao.ILibroDao;
import com.mx.Libro.Dominio.Libro;

@Service //indica que mi clase es una clase de servicio y que esta contiene logica de negocios y configuraciones importamtes que seran inyectadas
public class LibroServiceImp implements ILibroService{
	
	@Autowired
	private ILibroDao dao;
	

	@Override
	public void guardar(Libro libro) {
		dao.save(libro);
		
	}

	@Override
	public void editar(Libro libro) {
		dao.save(libro);
		
	}

	@Override
	public void eliminar(Libro libro) {
		dao.delete(libro);
		
	}

	@Override
	public Libro buscar(Libro libro) {
		return dao.findById(libro.getIdLibro()).orElse(null);
	}

	@Override
	public List<Libro> mostrar() {
		return (List<Libro>) dao.findAll();
	}

}
