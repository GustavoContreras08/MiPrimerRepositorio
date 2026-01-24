package com.mx.Herencia;

public class Principal {

	public static void main(String[] args) {
		
		Hijo hijo = new Hijo("Roberto", "Rodriguez", 12, "Mexicano", "Cafe", 1.20, "Moreno");
		System.out.println(hijo);
		
		hijo.setEdad(21);
		hijo.setAltura(1.75);
		
		System.out.println("Actualizado \n" + hijo);
		
		hijo.trabajar();
		
		/*Ejercicio de practica de herencia
		 * definir una clase animal (agregar los atributos por defecto que definen un animal
		 * la clase debe tener un metodo hacer sonido();
		 * de esta clase deben heredar 2 clases gato y perro y el metodo de hacer sonido en ambas clases debe
		 * imprimir el sonido correspondiente
		 * ejemplo: una vaca imprimiria el sonido : "Muuuuu"*/

	}

}
