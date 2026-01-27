package com.mx.Diccionario;

public interface IMetodos {
	
	public void create(Palabras palabras);
	public void read();
	public void update(Palabras palabras);
	public void delete(Palabras palabras);
	public Palabras search(Palabras palabras);
	
}