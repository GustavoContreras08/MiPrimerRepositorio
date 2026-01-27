package com.mx.Diccionario;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		Palabras p1 = new Palabras(0, "Perro", "Dog");
		Palabras p2 = new Palabras(1, "Gato", "Cat");
		Palabras p3 = new Palabras(2, "Hola", "Hello");
		Palabras p4 = new Palabras(3, "Por Favor", "Please");
		
		Palabras auxP = null;
		
		ImplemDic imp = new ImplemDic();
		
		//Guardar elementos en el hash
		imp.create(p1);
		imp.create(p2);
		imp.create(p3);
		imp.create(p4);
		
		Scanner scan = new Scanner(System.in);
		int ciclo = 0, menuB = 0, indice = 4;
		
		String Esp, Ing;
		
		do {
			System.out.println("---MENU---\n"
					+ "1.Agregar Nuevas Palabras\n"
					+ "2.Buscar Traducciones\n"
					+ "3.Mostrar Todo\n"
					+ "4.Salir");
			try {
				menuB = scan.nextInt();
				scan.nextLine();
				
				switch(menuB) {
				
				case 1:
					
					try {
					System.out.println("---AGREGAR---\n"
							+ "Ingresa palabra en Español: ");
					Esp = scan.nextLine();
					System.out.println("Ingresa palabra en Ingles: ");
					Ing = scan.nextLine();
					
					auxP = new Palabras(indice++, Esp, Ing);
					imp.create(auxP);
					System.out.println("Agregada con Exito");
					}catch(Exception e){
						System.out.println("Error Intentalo de nuevo");
						
					}
					break;
					
					
				case 2:
					int opc = 0;
					boolean encontrado = false;
					
					System.out.println("---BUSCAR---\n"
							+ "1.Español \n"
							+ "2.Ingles \n"
							+ "Ingresa una opcion: ");
					opc = scan.nextInt();
					scan.nextLine();
					
					switch(opc){
					case 1:
					    System.out.println("Ingrese palabra a buscar: ");
					    String palabraBuscar = scan.nextLine();
					    encontrado = false;

					    for (Palabras p : imp.hash.values()) {
					        if (p.getEsp().equalsIgnoreCase(palabraBuscar)) {
					            System.out.println("Traducción al inglés: " + p.getIng());
					            encontrado = true;
					            break;
					        }
					    }

					    if (!encontrado) {
					        System.out.println("Palabra no encontrada");
					    }
					    break;

					case 2:
						 System.out.println("Ingrese palabra a buscar: ");
						    String palabraBuscar2 = scan.nextLine();
						    encontrado = false;

						    for (Palabras p : imp.hash.values()) {
						        if (p.getIng().equalsIgnoreCase(palabraBuscar2)) {
						            System.out.println("Traducción al Español: " + p.getEsp());
						            encontrado = true;
						            break;
						        }
						    }

						    if (!encontrado) {
						        System.out.println("Palabra no encontrada");
						    }
						
						break;
						
						default:
							System.out.println("Ingresa una opcion del menu valida: ");
							break;
					
					}
					
					break;
				case 3:
					imp.read();
					
					break;
				case 4:
					ciclo = 4;
					
					break;
					
					default:
						System.out.println("Ingresa una opcion del menu valida: ");
						break;
				
				}
				
				
			}catch(Exception e){
				System.out.println("Ingresa una opcion del menu valida: ");
			}
			
		}while(ciclo != 4);
		
		System.out.println("Adios");

	}

}
