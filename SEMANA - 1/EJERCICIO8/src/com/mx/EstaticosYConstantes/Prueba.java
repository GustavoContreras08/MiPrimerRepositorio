package com.mx.EstaticosYConstantes;

public class Prueba {

	public static void main(String[] args) {
		//Variables finales se deben instanciar y una vez instanciadas, el valor ya no deberia cambiar
		
		//instanciar principal
		Principal obj = new Principal();
		
		//Acceder a los miemros
		System.out.println(obj.frase2); //miembro de instancia
		System.out.println(Principal.frase3); //miembro otra vez de una clase
		
		

	}

}
