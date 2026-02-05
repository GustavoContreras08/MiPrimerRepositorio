package com.mx.VideoJuegos.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.VideoJuegos.Dominio.Videojuego;

@Repository
public interface IVideojuegoDao extends CrudRepository<Videojuego, Integer> {

}
