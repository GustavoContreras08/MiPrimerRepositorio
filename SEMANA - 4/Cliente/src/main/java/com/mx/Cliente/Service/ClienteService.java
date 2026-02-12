package com.mx.Cliente.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.Cliente.Entity.Cliente;
import com.mx.Cliente.Repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public List<Cliente> listar(){
		return repo.findAll(Sort.by(Sort.Direction.ASC, "nombre"));
	}
	
	public void guardar(Cliente cliente) {
		repo.save(cliente);
	}
	
	public void eliminar(int idCliente) {
		repo.deleteById(idCliente);
	}
	
	public Cliente buscar(int idCliente) {
		return repo.findById(idCliente).orElse(null);
	}
	
	public boolean existeCliente(String nombre, String email) {
		return repo.existsByNombreAndEmailAllIgnoreCase(nombre, email);
	}
	
	public boolean existeTelefono(Long telefono) {
		return repo.existsByTelefono(telefono);
	}
	
	public List<Cliente> listarPorTienda(int idTienda){
		return repo.findByTiendaId(idTienda);
	}
	
	public boolean existePorId(Integer idCliente) {
	    return repo.existsById(idCliente);
	}
	
	
	
}
