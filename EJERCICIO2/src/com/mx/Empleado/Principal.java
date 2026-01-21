package com.mx.Empleado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Instanciar el objeto
		Empleado emp1 = new Empleado("David","Gonzales","Jimenez",8527418754L,58,6500.13 );
		Empleado emp2 = new Empleado("Jose","Moreno","Hernandez",735818754L,25,2500.13 );
		Empleado emp3 = new Empleado("Axel", "Garcia", "Oropeza", 5478620158L, 45, 30000.50);
		Empleado emp4 = new Empleado("Jose", "Ramirez", "Diaz", 5478764654L, 38, 9500.30);
		Empleado emp5 = new Empleado("Rafael", "Medina", "Lopez", 589503414L, 30, 29000.55);
		Empleado emp6 = new Empleado("Laura", "Hernandez", "Ruiz", 9982345678L, 32, 8200.50);
		Empleado emp7 = new Empleado(" Jose", " Anaya ", " Sanchez" ,7714043645L, 23, 15000);
		
		Empleado empAux = null;
		
		Implementacion imp = new Implementacion();
		
		//Almacenar todos los objetos en la lista
		imp.create(0, emp1);
		imp.create(1, emp2);
		imp.create(2, emp3);
		imp.create(3, emp4);
		imp.create(4, emp5);
		imp.create(5, emp6);
		imp.create(6, emp7);
		
//		//Mostrar
//		imp.read();
//		
//		//buscar
//		empAux = imp.buscar(1);
//		System.out.println("Elemento encontrado: " + empAux);
//		
//		//editar
//		empAux = imp.buscar(1);
//		empAux.setNombre("Julian");
//		empAux.setSueldo(85);
//		imp.update(1, emp2);
//		System.out.println("Elemento editado " + empAux);
//		
//		//eliminar
//		imp.delete(2);
//		imp.read();
//		
//		//contar
//		imp.contar();
		
		//Declarar variables
		Scanner scan = new Scanner(System.in);
		int menuP = 0, menuE = 0, indice = 0;
		
		String nombre, apellidoP, apellidoM;
		Long telefono;
		int edad;
		double sueldo;
		
		do {
			System.out.println("-----Menu-----");
			System.out.println("1.CREATE");
			System.out.println("2.READ");
			System.out.println("3.UPDATE");
			System.out.println("4.DELETE");
			System.out.println("5.SEARCH");
			System.out.println("6.COUNT");
			System.out.println("7.EXIT");
			System.out.println("ELIGE UNA OPCION VALIDA EN EL MENU");
			
			//Declaracion del bloque TRY-CATCH para evitar que el programa se detenga si el usuario introduce valores no numericos
			
			try {
				menuP = scan.nextInt();
				scan.nextLine();
				
				//Inicia el bloque switch
				switch(menuP) {
				case 1:
					System.out.println("<<<<CREATE>>>>");
					System.out.println("Ingrese los siguientes datos para registrar al empleado");
					
					System.out.println("Nombre: ");
					nombre = scan.nextLine();
					
					System.out.println("Apellido Paterno: ");
					apellidoP = scan.nextLine();
					
					System.out.println("Apellido Materni: ");
					apellidoM = scan.nextLine();
					
					System.out.println("Numero de Telefono: ");
					telefono = scan.nextLong();
					scan.nextLine();
					
					System.out.println("Edad: ");
					edad = scan.nextInt();
					scan.nextLine();
					
					System.out.println("Sueldo: ");
					sueldo = scan.nextDouble();
					scan.nextLine();
					
					empAux = new Empleado(nombre, apellidoP, apellidoM, telefono, edad, sueldo);
					
					imp.create(indice, empAux);
					
					System.out.println("Se registro con EXITO");
					
					break;
					
				case 2:
					System.out.println("<<<<R E A D>>>>");
					imp.read();
					break;
				case 3:
					System.out.println("<<<<A C T U A L I Z A R>>>>");
					imprimirDatos(imp);
					if(imp.lista.size() > 0) {
						System.out.println("Indique el indice que desea editar: ");
						indice = scan.nextInt();
						scan.nextLine();
						empAux = imp.buscar(indice);
						
						if(indice >= 0 && indice < imp.lista.size()) {
							do {
								System.out.println("--MENU EDITAR--");
								System.out.println("1.Nombre");
								System.out.println("2.Apellido Paterno");
								System.out.println("3.Apellido Materno");
								System.out.println("4.Numero de Telefono");
								System.out.println("5.Edad");
								System.out.println("6.Sueldo");
								System.out.println("7.Regresar al menu principal");
								System.out.println("Elige una opcion valida");
								
								menuE = scan.nextInt();
								scan.nextLine();
								
								switch(menuE) {
								case 1:
									System.out.println("Ingresa el nuevo nombre: ");
									nombre = scan.nextLine();
									empAux.setNombre(nombre);
									break;
								
								case 2:
									System.out.println("Ingresa el nuevo Apellido Paterno: ");
									apellidoP = scan.nextLine();
									empAux.setApellidoP(apellidoP);
									break;
									
								case 3:
									System.out.println("Ingrese el nuevo Apellido Materno: ");
									apellidoM = scan.nextLine();
									empAux.setApellidoM(apellidoM);
									break;
								
								case 4:
									System.out.println("Ingresa el nuevo Telefono: ");
									telefono = scan.nextLong();
									empAux.setTelefono(telefono);
									break;
									
								case 5:
									System.out.println("Ingrese la nueva edad: ");
									edad = scan.nextInt();
									empAux.setEdad(edad);
									break;
									
								case 6:
									System.out.println("Ingrese el nuevo sueldo: ");
									sueldo = scan.nextDouble();
									empAux.setSueldo(sueldo);
									break;
									
								case 7:
									System.out.println("Regresar al menu principal");
									break;
									default:
										System.out.println("Indice fuera de rango, intente con uno valido");
										break;
									
								}
								
							}while(menuE != 7); 
						}else {
							System.out.println("El indice no esta dentro de la lista");
						}
						
					}
					break;
					
				case 4:
					System.out.println("<<<<D E L E T E>>>>");
					imprimirDatos(imp);
					if(imp.lista.size() > 0) {
						System.out.println("Indique el indice que desee eliminar");
						indice = scan.nextInt();
						if(indice >= 0 && indice < imp.lista.size()) {
							imp.delete(indice);
							System.out.println("Eliminacion Exitosa");
						}else {
							System.out.println("El indice que intenta eliminar no existe");
						}
					}
					break;
				case 5:
					System.out.println("<<<<S E A R C H>>>>");
					imprimirDatos(imp);
					if(imp.lista.size() > 0) {
						System.out.println("Indique el indice que busca");
						indice = scan.nextInt();
						if(indice >= 0 && indice < imp.lista.size()) {
							empAux = imp.buscar(indice);
							System.out.println("Informacion completa del empleado: " + empAux);
						}else {
							System.out.println("El indice que intenta buscar no exixte");
						}
					}
					break;
					
				case 6:
					System.out.println("<<<<C O U N T>>>>");
					imp.contar();
					break;
					
				case 7:
					
					System.out.println("Saliendo del menu, Hasta Luego");
					break;
					default:
						System.out.println("Indice fuera de rango, intenta con uno dentrod el menu");
						break;
				}
				
			}catch(InputMismatchException e) {
				System.out.println("Entrada Invalida, por favor ingresa un valor numerico");
				scan.nextLine();
			}catch(Exception e) {
				System.out.println("Error Inesperado");
			}
						
		}while(menuP !=7);
		
	}//Cierra main

	private static void imprimirDatos(Implementacion imp) {
		System.out.println("Empleados Registrados");
		if(imp.lista.size() > 0) {
			for(int i = 0; i < imp.lista.size(); i++) {
				System.out.println("El empleado [" + i + "] de nombre " + imp.lista.get(i).getNombre());
				}
			}else {
				System.out.println("No hay empelados registrados");
			
		}
		
	}

}//Cierra Clase
