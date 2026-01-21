package Principal;

import Entidades.Fruta;
import Implementacion.ImpFruta;

public class PrincipalLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruta f1 = new Fruta("Manzana", "Rojo", 3, 24, "Verano");
		Fruta f2 = new Fruta("Piña", "Amarillo", 1, 50, "Verano");
		Fruta f3 = new Fruta("kiwi", "verde",2 , 45, "otoño");
		Fruta f4 = new Fruta("Melon", " Naranja", 3, 75 , "Verano");
		Fruta f5 = new Fruta ("Fresa", "Rojo", 1,60,"Verano");
		Fruta f6 = new Fruta("Sandia ", " Roja ",2,42,"Verano" );
		
		//auxiliar
		Fruta auxF = null;
				
		//Implementacion
		ImpFruta impF = new ImpFruta();
				
		//Agregar
		impF.create(f1.getNombre(), f1);
		impF.create(f2.getNombre(), f2);
		impF.create(f3.getNombre(), f3);
		impF.create(f4.getNombre(), f4);
		
		impF.read();

	}

}
