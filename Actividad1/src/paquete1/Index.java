package paquete1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		
				Persona a1 = new Persona("Gustavo", "Contreras", 23, "Mexico");
				Persona a2 = new Persona("Pablo", "Garcia", 26, "EEUU");
				Persona a3 = new Persona("Francisco", "Hernandez", 25, "Canada");
				Persona a4 = new Persona("Pedro", "Sanchez", 21, "Rusia");
				Persona a5 = new Persona("Litzy", "Moreno", 20, "Brasil");
				
				Persona auAux = null;
				
				List<Persona> lista = new ArrayList<Persona>();

				lista.add(a1);
				lista.add(a2);
				lista.add(a3);
				lista.add(a4);
				lista.add(a5);

				/*
				 * System.out.println(lista);
				 * 
				 * auAux = lista.get(1); System.out.println("Elemento encontrado: "+ auAux);
				 * 
				 * auAux = lista.get(2); auAux.setPais("Honduras"); auAux.setEdad(30);
				 * System.out.println("Elemento editado: "+ auAux);
				 * 
				 * lista.remove(3); System.out.println("Lista actualizada:\n " + lista);
				 * 
				 * System.out.println("Existen " + lista.size() + " Personas en la lista");
				 * 
				 * lista.clear();
				 * 
				 * if(lista.isEmpty()) { System.out.println("No exixten Personas en la lista");
				 * }else { System.out.println(lista); }
				 */
				//Crear un menu interactivo que me ayudara a modificar la lista desde consola
				
				Scanner scan = null; //Se utiliza para leer la entrada de un usuario
				int menuPrincipal = 0, menuEditar = 0, indice = 0;
				//Los menus son variables que almacenaran opciones e indice va a similar de un objeto
				
				//variables locales
				String Nombre, Apellido, Pais;
				int Edad;
				
				boolean existe = false;
				
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
					System.out.println("8.Eliminar todo");
					System.out.println("9.Buscar por atributo");
					
					System.out.println("Elige una opcion dentro del menu: ");
					scan = new Scanner(System.in);
					menuPrincipal = scan.nextInt();
					
					//Metodo Switch o case: Es una Estructura de Menu
					switch(menuPrincipal) {
					case 1:
						System.out.println("1.Agregar un nuevo registro");
						System.out.println("Escribe el nombre: ");
						scan = new Scanner(System.in);
						Nombre = scan.nextLine();
						
						System.out.println("Escribe el Apellido: ");
						scan = new Scanner(System.in);
						Apellido = scan.nextLine();
						
						System.out.println("Escribe la Edad: ");
						scan = new Scanner(System.in);
						Edad = scan.nextInt();
						
						System.out.println("Escribe el Pais de Origen: ");
						scan = new Scanner(System.in);
						Pais = scan.nextLine();
						
						//Instanciar
						auAux = new Persona(Nombre, Apellido, Edad, Pais);
						//Guardar en la lista
						for (Persona p : lista) {
						    if (p.getNombre().equalsIgnoreCase(Nombre) &&
						        p.getApellido().equalsIgnoreCase(Apellido) &&
						        p.getPais().equalsIgnoreCase(Pais)) {
						        existe = true;
						        break;
						    }
						}
						
						if (existe) {
						    System.out.println("La persona ya existe, no se puede duplicar.");
						} else {
						    lista.add(new Persona(Nombre, Apellido, Edad, Pais));
						    System.out.println("Registro guardado con éxito");
						}

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
							System.out.println("1.Editar Nombre");
							System.out.println("2.Editar Apellido");
							System.out.println("3.Editar Edad");
							System.out.println("4.Editar Pais");
							System.out.println("5.Regresar al menu principal");
							System.out.println("Elige una opcion del menu");
							scan = new Scanner(System.in);
							menuEditar = scan.nextInt();
							
							switch(menuEditar) {
							case 1:
								System.out.println("Escribe el nuevo Nombre: ");
								scan = new Scanner(System.in);
								Nombre = scan.nextLine();
								auAux.setNombre(Nombre);
								System.out.println("Se edito correctamente");
								break;
							case 2:
								System.out.println("Escribe el nuevo Apellido: ");
								scan = new Scanner(System.in);
								Apellido = scan.nextLine();
								auAux.setApellido(Apellido);
								System.out.println("Se edito correctamente");
								break;
							case 3:
								System.out.println("Escribe la nueva Edad: ");
								scan = new Scanner(System.in);
								Edad = scan.nextInt();
								auAux.setEdad(Edad);
								System.out.println("Se edito correctamente");
								break;
							case 4:
								System.out.println("Escribe el nuevo Pais: ");
								scan = new Scanner(System.in);
								Pais = scan.nextLine();
								auAux.setPais(Pais);
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
						int a = lista.size();
						
						if(a>indice || a<indice) {
							System.out.println("No se puede eliminar");
						}else {
							lista.remove(indice);
							System.out.println("Elemento eliminado\n Lista Actualizada" + lista);
						}
						
						break;
						
					case 6:
						System.out.println("6.Contar");
						System.out.println("Existen " + lista.size() + " Autos registrados");
						break;
						
					case 7:
						System.out.println("Saliendo del menu, vuelve pronto");
						break;
						
					case 8:
						lista.clear();
						System.out.println("Todos los elementos fueron eliminados");
						break;
						
					case 9:
					    System.out.println("9. Buscar por atributo");
					    System.out.println("Buscar por:");
					    System.out.println("1. Nombre");
					    System.out.println("2. Apellido");
					    System.out.println("3. Pais");

					    scan = new Scanner(System.in);
					    int opcionBuscar = scan.nextInt();
					    scan.nextLine(); // limpiar buffer

					    boolean encontrado = false;

					    switch (opcionBuscar) {
					        case 1:
					            System.out.println("Ingrese el Nombre:");
					            String nombreBuscar = scan.nextLine();

					            for (Persona p : lista) {
					                if (p.getNombre().equalsIgnoreCase(nombreBuscar)) {
					                    System.out.println(p);
					                    encontrado = true;
					                }
					            }
					            break;

					        case 2:
					            System.out.println("Ingrese el Apellido:");
					            String apellidoBuscar = scan.nextLine();

					            for (Persona p : lista) {
					                if (p.getApellido().equalsIgnoreCase(apellidoBuscar)) {
					                    System.out.println(p);
					                    encontrado = true;
					                }
					            }
					            break;

					        case 3:
					            System.out.println("Ingrese el Pais:");
					            String paisBuscar = scan.nextLine();

					            for (Persona p : lista) {
					                if (p.getPais().equalsIgnoreCase(paisBuscar)) {
					                    System.out.println(p);
					                    encontrado = true;
					                }
					            }
					            break;

					        default:
					            System.out.println("Opción inválida");
					            break;
					    }

					    if (!encontrado) {
					        System.out.println("No se encontraron coincidencias");
					    }

					    break;
						
					default:
						System.out.println("Indice fuera de rango, intenta con uno dentro del menu");
						break;
					}
					
				}while(menuPrincipal !=7);

	}

}
