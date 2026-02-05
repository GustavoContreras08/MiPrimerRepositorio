package com.mx.ClientePedido.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.ClientePedido.Dao.IPedidoDao;
import com.mx.ClientePedido.Dominio.Pedido;

@Service
public class PedidoService {

	@Autowired
	private IPedidoDao dao;
	
	public void guardar (Pedido pedido) {
		dao.save(pedido);
	}
	
	public List<Pedido> listar(){
		return dao.findAll(Sort.by(Sort.Direction.ASC, "idPedido"));
	}
	
	public void editar(Pedido pedido) {
		dao.save(pedido);
	}
	
	public Pedido buscar(int idPedido) {
		return dao.findById(idPedido).orElse(null);
	}
	
	public void eliminar(int idPedido) {
		dao.deleteById(idPedido);
	}
	
	public List<Pedido> listarPorFecha(LocalDate fecha){
		return dao.findByFecha(fecha);
	}
}
