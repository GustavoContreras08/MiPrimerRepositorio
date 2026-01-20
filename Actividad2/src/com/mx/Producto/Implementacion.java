package com.mx.Producto;

import java.util.ArrayList;
import java.util.List;

public class Implementacion implements IMetodos{
	
	List<Producto> lista = new ArrayList<Producto>();

	@Override
	public void create(int indice, Producto producto) {
		// TODO Auto-generated method stub
		lista.add(producto);
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println(lista);
	}

	@Override
	public void update(int indice, Producto producto) {
		// TODO Auto-generated method stub
		lista.set(indice, producto);
	}

	@Override
	public void delete(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

	@Override
	public Producto buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	
	}
	
	public void contar(){
		System.out.println("Existen " + lista.size() + " Productos registrados");
	}

}
