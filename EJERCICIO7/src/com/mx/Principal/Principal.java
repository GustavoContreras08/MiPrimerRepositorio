package com.mx.Principal;

import com.mx.Polimorfismo.Automovil;
import com.mx.Polimorfismo.Deportivo;
import com.mx.Polimorfismo.PickUp;
import com.mx.Polimorfismo.Turismo;

public class Principal {

	public static void main(String[] args) {
		
		//Generar un array
		Automovil[]veh = new Automovil[4];
		
		veh[0] = new Automovil("Honda", "Civic", "Rojo", 2002);
		veh[1] = new Deportivo("Ford", "GT", "Negro", 2003, 8);
		veh[2] = new Turismo("Mercedez-Benz", "Spinter", "Blanco", 2023, 20);
		veh[3] = new PickUp("Toyota", "tahoma", "Azul", 2022, 1000);
		
		for(Automovil auto : veh) {
			System.out.println(auto.mostrarDatos());
			System.out.println(auto);
		}

	}

}
