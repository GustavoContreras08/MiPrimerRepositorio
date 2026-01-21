package com.mx.Animales;

import java.util.HashMap;

public class ImpAnimal implements IMetodosAnimal{
	
	HashMap<Integer, Animal> hash = new HashMap<Integer, Animal>();

	@Override
	public void create(Animal animal) {
		// TODO Auto-generated method stub
		hash.put(animal.getIsbn(), animal);
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println(hash);
	}

	@Override
	public void update(Animal animal) {
		// TODO Auto-generated method stub
		hash.put(animal.getIsbn(), animal);
	}

	@Override
	public void delete(Animal animal) {
		// TODO Auto-generated method stub
		hash.remove(animal.getIsbn());
	}

	@Override
	public Animal search(Animal animal) {
		// TODO Auto-generated method stub
		return hash.get(animal.getIsbn());
		
	}
	
	public void contar() {
		System.out.println("El hash contienen " + hash.size() + " Libros registrados");
	}

}
