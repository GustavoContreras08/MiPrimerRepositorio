package com.mx.Producto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		Producto pd1 = new Producto("Fanta","Coca Cola",12312,58,25.00);
		Producto pd2 = new Producto("Libreta","Scribe",21323,32,12.50);
		Producto pd3 = new Producto("Lavadora","Samsung",23425,12,12000.00);
		Producto pd4 = new Producto("Pantalla","LG",34534,21,8000.99);
		Producto pd5 = new Producto("PS5","Sony",23523,34,10000.50);
		
		Producto pdAux = null;
		
		Implementacion imp = new Implementacion();
		
		imp.create(0, pd1);
		imp.create(1, pd2);
		imp.create(2, pd3);
		imp.create(3, pd4);
		imp.create(4, pd5);
		
//		imp.read();
//		
//		//buscar
//		pdAux = imp.buscar(1);
//		System.out.println("Productos encontrados: " + pdAux);
//		
//		//editar
//		pdAux = imp.buscar(1);
//		pdAux.setNombre("Topochico");
//		pdAux.setPrecio(85);
//		imp.update(1, pd2);
//		System.out.println("Producto editado " + pdAux);
//		
//		//eliminar
//		imp.delete(2);
//		imp.read();
//		
//		//contar
//		imp.contar();
		
		Scanner scan = new Scanner(System.in);
		int menuP = 0, menuE = 0, indice = 0;
		
		String Nombre, Marca;
		int Codigo, Stock;
		double Precio;
		
		boolean existe = false;
		
		do {
			System.out.println("-----Menu-----");
			System.out.println("1.CREATE");
			System.out.println("2.READ");
			System.out.println("3.UPDATE");
			System.out.println("4.DELETE");
			System.out.println("5.SEARCH");
			System.out.println("6.COUNT");
			System.out.println("7.CLEAR");
			System.out.println("8.EXIT");
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
					Nombre = scan.nextLine();
					
					System.out.println("Marca: ");
					Marca = scan.nextLine();
					
					System.out.println("Codigo: ");
					Codigo = scan.nextInt();
					
					System.out.println("Stock: ");
					Stock = scan.nextInt();
					scan.nextLine();
					
					System.out.println("Precio: ");
					Precio = scan.nextDouble();
					scan.nextLine();
					
					pdAux = new Producto(Nombre, Marca, Codigo, Stock, Precio);
					
					imp.create(indice, pdAux);
					
					for (Producto p : imp.lista) {
					    if (p.getNombre().equalsIgnoreCase(Nombre) &&
					        p.getMarca().equalsIgnoreCase(Marca)) {
					        existe = true;
					    }
					}
					
					if (existe) {
					    System.out.println("El producto ya existe, no se puede duplicar.");
					} else {
						imp.lista.add(new Producto(Nombre, Marca, Codigo, Stock, Precio));
					    System.out.println("Registro guardado con éxito");
					}
					
					break;
					
				case 2:
					System.out.println("<<<<R E A D>>>>");
					if(imp.lista.size() == 0) {
						System.out.println("Lista vacia, No hay datos para mostrar");
					}else {
						imp.read();
					}
					
					break;
				case 3:
					System.out.println("<<<<A C T U A L I Z A R>>>>");
					imprimirDatos(imp);
					if(imp.lista.size() > 0) {
						System.out.println("Indique el indice que desea editar: ");
						indice = scan.nextInt();
						scan.nextLine();
						pdAux = imp.buscar(indice);
						
						if(indice >= 0 && indice < imp.lista.size()) {
							do {
								System.out.println("--MENU EDITAR--");
								System.out.println("1.Nombre");
								System.out.println("2.Marca");
								System.out.println("3.Codigo");
								System.out.println("4.Stock");
								System.out.println("5.Precio");
								System.out.println("6.Regresar al menu principal");
								System.out.println("Elige una opcion valida");
								
								menuE = scan.nextInt();
								scan.nextLine();
								
								switch(menuE) {
								case 1:
									System.out.println("Ingresa el nuevo nombre: ");
									Nombre = scan.nextLine();
									pdAux.setNombre(Nombre);
									break;
								
								case 2:
									System.out.println("Ingresa la nueva marca: ");
									Marca = scan.nextLine();
									pdAux.setMarca(Marca);
									break;
									
								case 3:
									System.out.println("Ingrese el nuevo Codigo: ");
									Codigo = scan.nextInt();
									pdAux.setCodigo(Codigo);
									break;
								
								case 4:
									System.out.println("Ingresa el nuevo Stock: ");
									Stock = scan.nextInt();
									pdAux.setStok(Stock);
									break;
									
								case 5:
									System.out.println("Ingrese el nuevo precio: ");
									Precio = scan.nextInt();
									pdAux.setPrecio(Precio);
									break;
									
								case 6:
									System.out.println("Regresar al menu principal");
									break;
									default:
										System.out.println("Indice fuera de rango, intente con uno valido");
										break;
									
								}
								
							}while(menuE != 6); 
						}else {
							System.out.println("El indice no esta dentro de la lista");
						}
						
					}
					break;
					
				case 4:
					System.out.println("<<<<D E L E T E>>>>");
					System.out.println("Eliminar por: ");
				    System.out.println("1. Nombre");
				    System.out.println("2. Marca");

				    scan = new Scanner(System.in);
				    int opcionBuscar2 = scan.nextInt();
				    scan.nextLine(); // limpiar buffer

				    boolean encontrado2 = false;

				    switch (opcionBuscar2) {
				        case 1:
				            System.out.println("Ingrese el Nombre:");
				            String nombreBuscar = scan.nextLine();

				            for (Producto p : imp.lista) {
				                if (p.getNombre().equalsIgnoreCase(nombreBuscar)) {
				                    imp.lista.remove(p);
				                    System.out.println("Eliminado");
				                    encontrado2 = true;
				                }
				            }
				            break;

				        case 2:
				            System.out.println("Ingrese la marca:");
				            String marcaBuscar = scan.nextLine();

				            for (Producto p : imp.lista) {
				                if (p.getMarca().equalsIgnoreCase(marcaBuscar)) {
				                	imp.lista.remove(p);
				                	System.out.println("Eliminado");
				                    encontrado2 = true;
				                }
				            }
				            break;

				        default:
				            System.out.println("Opción inválida");
				        break;
				    }

				    if (!encontrado2) {
				        System.out.println("No se encontraron coincidencias");
				    }
					
					//
//					imprimirDatos(imp);
//					if(imp.lista.size() > 0) {
//						System.out.println("Indique el indice que desee eliminar");
//						indice = scan.nextInt();
//						if(indice >= 0 && indice < imp.lista.size()) {
//							imp.delete(indice);
//							System.out.println("Eliminacion Exitosa");
//						}else {
//							System.out.println("El indice que intenta eliminar no existe");
//						}
//					}
					break;
				case 5:
					System.out.println("<<<<S E A R C H>>>>");
					
					    System.out.println("Buscar por: ");
					    System.out.println("1. Nombre");
					    System.out.println("2. Marca");

					    scan = new Scanner(System.in);
					    int opcionBuscar = scan.nextInt();
					    scan.nextLine(); // limpiar buffer

					    boolean encontrado = false;

					    switch (opcionBuscar) {
					        case 1:
					            System.out.println("Ingrese el Nombre:");
					            String nombreBuscar = scan.nextLine();

					            for (Producto p : imp.lista) {
					                if (p.getNombre().equalsIgnoreCase(nombreBuscar)) {
					                    System.out.println(p);
					                    encontrado = true;
					                }
					            }
					            break;

					        case 2:
					            System.out.println("Ingrese la marca:");
					            String marcaBuscar = scan.nextLine();

					            for (Producto p : imp.lista) {
					                if (p.getMarca().equalsIgnoreCase(marcaBuscar)) {
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
					
				case 6:
					System.out.println("<<<<C O U N T>>>>");
					if(imp.lista.size() == 0) {
						System.out.println("La lista de productos esta Vacia");
					}else {
						imp.contar();
					}
					
					break;
					
				case 7:
					System.out.println("<<<<C L E A R>>>>");
					if(imp.lista.size() == 0) {
						System.out.println("Error Lista vacia");
						
					}else {
						imp.limpiar();
						System.out.println("Lista Borrada");
					}
					break;
					
				case 8:
					System.out.println("Saliendo del menu, Hasta Luego");
					break;
				default:
					System.out.println("Indice fuera de rango, intenta con uno dentro del menu");

				break;	
				}
				
			}catch(InputMismatchException e) {
				System.out.println("Entrada Invalida, por favor ingresa un valor numerico");
				scan.nextLine();
			}catch(Exception e) {
				System.out.println("");
			}
						
		}while(menuP !=8);
		
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

}
