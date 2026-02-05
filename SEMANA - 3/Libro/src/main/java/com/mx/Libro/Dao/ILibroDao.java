package com.mx.Libro.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.Libro.Dominio.Libro;

@Repository //es un repositorio que nos indica que es un repositorio y contiene datos o metodos que nos 
//ayudaran a la configuracion de otra clase, se endende y pasa a ser administrador por el contenerdor beans de scripg y puede ser inyectado despues
public interface ILibroDao extends CrudRepository<Libro, Integer>{

}
