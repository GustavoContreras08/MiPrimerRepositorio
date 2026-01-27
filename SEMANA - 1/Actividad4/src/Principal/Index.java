package Principal;

import Entidades.Archivo;
import Entidades.Electrodomestico;
import Implementacion.ImpArchivo;
import Implementacion.ImpElectrodomestico;

public class Index {

	public static void main(String[] args) {
		Archivo f1 = new Archivo(1,"CV", "c:user/escritorio/archivosImportantes", 233, "archivosImportantes");
		Archivo f2 = new Archivo(2,"Solicitud", "c:user/documentos/nueva carpeta", 234, "nueva carpeta");
		Archivo f3 = new Archivo(3,"Calificaciones", "c:user/documentos/Boletas", 23, "Boletas");
		
		Electrodomestico e1 = new Electrodomestico(1, "Plancha", "Mabe", 234, 244.34);
		Electrodomestico e2 = new Electrodomestico(2, "Pantalla", "Sony", 132, 3144.34);
		Electrodomestico e3 = new Electrodomestico(3, "Lavadora", "Samsung", 123, 10000.34);
		
		Archivo auxA = null;
		
		Electrodomestico auxE = null;
		
		ImpArchivo impA = new ImpArchivo();
		ImpElectrodomestico impE = new ImpElectrodomestico();
		
		impA.create(f1.getNombre(), f1);
		impA.create(f2.getNombre(), f2);
		impA.create(f3.getNombre(), f3);
		
		impE.create(e1.getNombre(), e1);
		impE.create(e2.getNombre(), e2);
		impE.create(e3.getNombre(), e3);
		
		System.out.println("\n\n----------Archivos--------");
		//Archivos
		impA.read();
		
		auxA = (Archivo) impA.search(1);
		System.out.println("Encontrado: " + auxA);
				
		impA.delete(2);
		impA.read();
				
		impA.contar();		
		
		//Electrodomesticos
		
		System.out.println("\n\n----------Electrodomesticos--------");
		impE.read();
		
		auxE = (Electrodomestico) impE.search(1);
		System.out.println("Encontrado: " + auxE);
				
		impE.delete(2);
		impE.read();
				
		impE.contar();	
				
	}

}
