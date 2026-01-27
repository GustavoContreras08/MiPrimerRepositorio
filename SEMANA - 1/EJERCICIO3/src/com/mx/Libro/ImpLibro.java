package com.mx.Libro;

import java.util.HashMap;

public class ImpLibro implements IMetodosLibro{
	
	/*Declaracion del HashMap
	 * sintaxis
	 * HashMap<Clave, valor> hash = new HasMap<Clave, valor>();
	 * 
	 * HashMap -> es la libreria de java.util
	 * <> -> operador diamante
	 * Clave(KeyDateType) -> clase contenedora del dato primitivo de mi clave
	 * Valor(ValueDataType) -> el nombre de la clase
	 * nombre (Hash) -> Definido del programador
	 * new -> palabra reservada*/
	
	//Declaracion del HashMap
	HashMap<Integer, Libro> hash = new HashMap<Integer, Libro>();

	@Override
	public void create(Libro libro) {
		hash.put(libro.getIsbn(), libro);
		
	}

	@Override
	public void read() {
		System.out.println(hash);
		
	}

	@Override
	public void update(Libro libro) {
		//HasgMap no afrce como tal un metodo para editar , pero el put no permite valores duplicados
		//Se utiliza porque cuando identifica una clave identica, se remplaza los valores anteriores
		//dejando la clave igual
		hash.put(libro.getIsbn(), libro);
		
	}

	@Override
	public void delete(Libro libro) {
		hash.remove(libro.getIsbn());
		
	}

	@Override
	public Libro search(Libro libro) {
		
		return hash.get(libro.getIsbn());
	}
	
	//metodo personalizado
	public void contar() {
		System.out.println("El hash contienen " + hash.size() + " Libros registrados");
	}

}
