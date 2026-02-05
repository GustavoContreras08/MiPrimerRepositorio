package com.mx.VideoJuegos.Service;

import java.util.List;

import com.mx.VideoJuegos.Dominio.Videojuego;

public interface IVideojuegoService {

	public void guardar(Videojuego videojuego); 
	public void editar(Videojuego videojuego);
	public void eliminar(Videojuego videojuego);
	public Videojuego buscar(Videojuego videojuego);
	public List<Videojuego> mostrar();
}
