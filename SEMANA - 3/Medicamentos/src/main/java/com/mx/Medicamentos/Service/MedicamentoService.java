package com.mx.Medicamentos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.Medicamentos.Dao.IMedicamentoDao;
import com.mx.Medicamentos.Dominio.Medicamento;

@Service
public class MedicamentoService {
	
	@Autowired
	private IMedicamentoDao dao;
	
	public void guardar(Medicamento medicamento) {
		dao.save(medicamento);
	}
	
	public List<Medicamento> listar(){
		return dao.findAll(Sort.by(Sort.Direction.ASC, "idMedicamento"));
	}
	
	public void aumentarStock(String nombre, Integer aumento) {
		dao.aumentarStock(nombre, aumento);
	}
	
	public void descontarStock(String nombre, Integer descuento) {
		dao.descontarStock(nombre, descuento);
	}
	
	public void eliminar(Integer idMedicamento) {
		dao.eliminar(idMedicamento);
	}
	
	public void descuento(Integer pDescuento) {
		dao.descuento(pDescuento);
	}

}
