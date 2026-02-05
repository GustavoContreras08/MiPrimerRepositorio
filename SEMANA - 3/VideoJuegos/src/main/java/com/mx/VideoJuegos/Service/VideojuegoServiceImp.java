package com.mx.VideoJuegos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.VideoJuegos.Dao.IVideojuegoDao;
import com.mx.VideoJuegos.Dominio.Videojuego;

@Service
public class VideojuegoServiceImp implements IVideojuegoService {
	
	@Autowired
	private IVideojuegoDao dao;

	@Override
	public void guardar(Videojuego videojuego) {
		// TODO Auto-generated method stub
		dao.save(videojuego);
	}

	@Override
	public void editar(Videojuego videojuego) {
		// TODO Auto-generated method stub
		dao.save(videojuego);
	}

	@Override
	public void eliminar(Videojuego videojuego) {
		// TODO Auto-generated method stub
		dao.delete(videojuego);
	}

	@Override
	public Videojuego buscar(Videojuego videojuego) {
		// TODO Auto-generated method stub
		return dao.findById(videojuego.getIdVJ()).orElse(null);
	}

	@Override
	public List<Videojuego> mostrar() {
		// TODO Auto-generated method stub
		return (List<Videojuego>) dao.findAll();
	}
	
}
