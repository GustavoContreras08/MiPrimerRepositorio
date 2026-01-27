package com.mx.EstaticosYConstantes;

public class Principal {
	
	//Mienbre estatico o atributos que se asociam a una clase en lugar de una instancia
	//
	
	//Miembro estatico:  variable que se asocia a la clase
	public static String frase1 = "Miembro estatico";
	
	//Constante o variable final: no cambia despues de la inicializacion
	public final String frase2 = "Variable final constante";

	//Constante estatica:variable final asociada
	public static final String frase3 = "Variable final estatica";
	
	public static void main(String[] args) {
		
		//acceso a miembros estaticos directamente desde mi clase
		System.out.println(frase1);
		System.out.println(frase3);
		
		
		
		//ejemplo con un metodo que calcula el area de un circulo
		float radio = 5;
		double area = calcularArea(radio);
		System.out.println("El area del circulo con radio: " + radio + " es de: " + area);
	}
	
	public static double calcularArea(float radio) {
		return Math.PI * (radio * radio);
	}
	
}
