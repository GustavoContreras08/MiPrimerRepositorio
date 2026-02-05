package com.mx.Computadora.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.Computadora.Dao.IComputadoraDao;
import com.mx.Computadora.Dominio.Computadora;

@Service //Es una anotacion que indica que esta clase es una clase de configuracion que me puede ayudar a configurar otras clases,
//es un tipo de bean y por lo tantoi pasa ser gestionada por el contenedor de beans de spring para despues ser inyectada
public class ComputadoraService {

	@Autowired //indica la inyeccion de otra clase para la configuracion de esta clase
	private IComputadoraDao dao;
	
	public void guardar(Computadora computadora) {
		dao.save(computadora);
	}
	
	public List<Computadora> listar(){
		return dao.findAll(Sort.by(Sort.Direction.ASC, "idCompu2"));
	}
	
	public Computadora buscar(int idCompu2) {
		return dao.findById(idCompu2).orElse(null);
	}
	
	public void eliminar(int idCompu2) {
		dao.deleteById(idCompu2);
	}
	
	public void editar(Computadora computadora) {
		dao.save(computadora);
	}
	
	//metodo que consultara el procedimiento almacenado
	public void aplicarDescuento(Integer pDescuento) {
		if(pDescuento < 0 || pDescuento > 100) {
			throw new IllegalArgumentException("El descuento debe estar entre el 0 y 100");
		}
		dao.aplicarDescuento(pDescuento);
	}
	
}
