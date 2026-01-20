package com.mx.Empleado;

import java.util.ArrayList;
import java.util.List;

//para implementar una interface se ocupa la palabra reservada "Implements"
public class Implementacion implements IMetodos{
	
	//Declaracion de una lista para agregar un comportamiento a los metodos declarados
	List<Empleado> lista = new ArrayList<Empleado>();

	@Override //sobreEscritura de metodos, cambia el comportamiento inicial de un metodo
	public void create(int indice, Empleado empleado) {
		lista.add(empleado);
		
	}

	@Override
	public void read() {
		System.out.println(lista);
		
	}

	@Override
	public void update(int indice, Empleado empleado) {
		lista.set(indice, empleado);
		
	}

	@Override
	public void delete(int indice) {
		lista.remove(indice);
		
	}

	@Override
	public Empleado buscar(int indice) {
		return lista.get(indice);
	}
	
	//metodos personalizados
	public void contar(){
		System.out.println("Existen " + lista.size() + " Empleados registrados");
	}

}
