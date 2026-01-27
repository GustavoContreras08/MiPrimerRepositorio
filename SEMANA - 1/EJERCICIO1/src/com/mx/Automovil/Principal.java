package com.mx.Automovil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//instnaciar el objeto;
		AUTOMOVIL a1 = new AUTOMOVIL("Toyota", "Corolla", 150000, "negro");
		AUTOMOVIL a2 = new AUTOMOVIL("Audi", "Q5", 360000, "Azul");
		AUTOMOVIL a3 = new AUTOMOVIL("Mazda", "X3", 200000, "Rojo");
		AUTOMOVIL a4 = new AUTOMOVIL("Honda", "Civic", 100000, "blanco");
		AUTOMOVIL a5 = new AUTOMOVIL("SEAT", "Toledo", 230000, "gris");
		
		//objeto auxiliar
		AUTOMOVIL auAux = null;
		
		//Declarar una lista para almacenar los objetos
		
		List<AUTOMOVIL> lista = new ArrayList<AUTOMOVIL>();
		
		//agregar objetos a la lista
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		lista.add(a5);
		
		/*
		 * //mostrar lo que exixte en la lista, imprimir en consola
		 * System.out.println(lista);
		 * 
		 * //buscar un elemento especifico auAux = lista.get(1);
		 * System.out.println("Elemento encontrado: "+ auAux);
		 * 
		 * //editar un elemento auAux = lista.get(2); auAux.setcolor("Amazul");
		 * auAux.setprecio(3); System.out.println("Elemento editado: "+ auAux);
		 * 
		 * //eliminar un dato de la lista lista.remove(3);
		 * System.out.println("Lista actualizada:\n " + lista);
		 * 
		 * //contar los elementos en la lista System.out.println("Existen " +
		 * lista.size() + " Autos en la lista");
		 * 
		 * //Eliminar todo lista.clear(); //Validar si esta vacia if(lista.isEmpty()) {
		 * System.out.println("No exixten elementos en la lista"); }else {
		 * System.out.println("lista"); }
		 */
		
		/*Actividad de repaso
		 * 1.Crear un proyecto desde cero llamado actividad 1
		 * 2.Crear el paquete para las clases
		 * 3.Generar una clase para el objeto que ustedes quieran
		 * 4.Crear la clase principal e instanciar por lo menos 5 objetos y realizar todas las pruebas*/
		
		//Crear un menu interactivo que me ayudara a modificar la lista desde consola
		
		Scanner scan = null; //Se utiliza para leer la entrada de un usuario
		int menuPrincipal = 0, menuEditar = 0, indice = 0;
		//Los menus son variables que almacenaran opciones e indice va a similar de un objeto
		
		//variables locales
		String marca, subMarca,color;
		int precio;
		
		/*Uso del ciclo do-while: en java es una estructura que permite ejecutar un bloque de codigo
		 *al menos una vez y este continua su ejecucion hasta cumplir la condicion*/
		
		do {
			System.out.println("---Menu---");
			System.out.println("1.Agregar");
			System.out.println("2.Mostrar la Lista");
			System.out.println("3.Editar");
			System.out.println("4.Buscar un elemento");
			System.out.println("5.Eliminar");
			System.out.println("6.Contar");
			System.out.println("7.Salir");
			
			System.out.println("Elige una opcion dentro del menu: ");
			scan = new Scanner(System.in);
			menuPrincipal = scan.nextInt();
			
			//Metodo Switch o case: Es una Estructura de Menu
			switch(menuPrincipal) {
			case 1:
				System.out.println("1.Agregar un nuevo registro");
				System.out.println("Escriba la marca del automovil: ");
				scan = new Scanner(System.in);
				marca = scan.nextLine();
				
				System.out.println("Escribe la subMarca del Automovil: ");
				scan = new Scanner(System.in);
				subMarca = scan.nextLine();
				
				System.out.println("Escribe el precio del Automovil: ");
				scan = new Scanner(System.in);
				precio = scan.nextInt();
				
				System.out.println("Escribe el color del Automovil: ");
				scan = new Scanner(System.in);
				color = scan.nextLine();
				
				//Instanciar
				auAux = new AUTOMOVIL(marca, subMarca, precio, color);
				//Guardar en la lista
				lista.add(auAux);
				System.out.println("El registro se guardo con exito");
				
				break; //Rompe el case para iniciar uno nuevo o finalizar
				
			case 2:
				System.out.println("2.Mostrar la lista");
				System.out.println(lista);
				
				break;
				
			case 3:
				System.out.println("3.Editar");
				System.out.println("Ingresa el inidice para editar: ");
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				
				auAux = lista.get(indice);
				
				do {
					System.out.println("1.Editar Marca");
					System.out.println("2.Editar marca");
					System.out.println("3.Editar Precio");
					System.out.println("4.Editar color");
					System.out.println("5.Regresar al menu principal");
					System.out.println("Elige una opcion del menu");
					scan = new Scanner(System.in);
					menuEditar = scan.nextInt();
					
					switch(menuEditar) {
					case 1:
						System.out.println("Escribe la nueva marca");
						scan = new Scanner(System.in);
						marca = scan.nextLine();
						auAux.setMarca(marca);
						System.out.println("Se edito correctamente");
						break;
					case 2:
						System.out.println("Escribe la nueva subMarca");
						scan = new Scanner(System.in);
						subMarca = scan.nextLine();
						auAux.setsubMarca(subMarca);
						System.out.println("Se edito correctamente");
						break;
					case 3:
						System.out.println("Escribe el nuevo precio");
						scan = new Scanner(System.in);
						precio = scan.nextInt();
						auAux.setprecio(precio);
						System.out.println("Se edito correctamente");
						break;
					case 4:
						System.out.println("Escribe el nuevo color");
						scan = new Scanner(System.in);
						color = scan.nextLine();
						auAux.setcolor(color);
						break;
					case 5:
						System.out.println("Regresar al menu principal");
						break;
						default:
							System.out.println("Regresar al menu principal");
							break;
					}//Cierra el switch de editar
					
					
				}while(menuEditar !=5);//Cierra el do de editar
				break;
			case 4:
				System.out.println("4.Buscar un elemento");
				System.out.println("Indica el indice para mostra la informacion: ");
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				auAux = lista.get(indice);
				System.out.println("Esta es la informacion completa: \n" + auAux);
				break;
				
			case 5:
				System.out.println("5.Eliminar");
				System.out.println("Indique el indice que desee eliminar");
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				lista.remove(indice);
				System.out.println("Elemento eliminado\n Lista Actualizada" + lista);
				break;
				
			case 6:
				System.out.println("6.Contar");
				System.out.println("Existen " + lista.size() + " Autos registrados");
				break;
				
			case 7:
				System.out.println("Saliendo dle menu, vuelve pronto");
				break;
				default:
					System.out.println("Indice fuer de rango, intenta con uno dentro del menu");
					break;
					
			}
			
		}while(menuPrincipal !=7);
		
	}

}