package com.mx.Producto;

public interface IMetodos {
	
	public void create(int indice, Producto producto);
	
	public void read();
	
	public void update(int indice, Producto producto);
	
	public void delete(int indice);
	
	public Producto buscar(int indice);
	
}