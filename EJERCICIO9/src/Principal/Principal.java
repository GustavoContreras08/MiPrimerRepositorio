package Principal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Entidad.Alumno;

public class Principal {

	public static void main(String[] args) {
		// Definir lista
		List<Alumno> lista = new ArrayList<Alumno>();
		
		lista.add(new Alumno(134134, "David", "Dominguez", "Diaz", 18, "Lic. Medicina", "BUAP"));
		lista.add(new Alumno(432344, "Angel", "Contreras", "Garcia", 19, "Lic. Arquitectura", "UPT"));
		lista.add(new Alumno(211112021, "Eduardo ", "Anaya", "Sanchez", 23, "ing.Mecatronica","UAT"));
		lista.add(new Alumno(5841554, "Sebastian", "Ramirez", "Flores", 26, "Ing. Sistemas", "UNAM"));
		lista.add(new Alumno(5889867, "Mario", "Gonzalez", "Gomez", 24, "ing. Sistemas", "UNAM"));
		lista.add(new Alumno(4524525, "Ana", "Gonzalez", "Sanchez", 22, "ing. Sistemas", "UTT"));
		
		/*Las operaciones landa disminuyen el codigo
		 * 
		 * sintaxis de exprecion landa (conocidas como funciones de fecha)
		 * 
		 * (argl) -> (cuerpo) (tipo1, tipo2, arg2) -> (cuerpo)*/
		
		//funcion lamda para imprimir lod nombres de los alumnos
		
		lista.forEach(
				//Exprecion lamda)
				(alumno) -> {
					System.out.println("Nombre del alumno: " + alumno.getNombre());
				});
		
		//imprimir el detalle de los alumnos
		System.out.println("\n-----Detalle de Alumnos-----");
		//mostrar el detalle de los alumnos usando un filtro, solo muestra los alumnos de la UNAM
		lista.stream().filter(arg -> arg.getUniversidad().equalsIgnoreCase("unam")).forEach(alumno
				-> System.out.println("Nombre: " + alumno.getNombre() + " " + alumno.getaPaterno()
				+ " Estudia la carrera de: " + alumno.getCarrera() + " En la universidad: " + alumno.getUniversidad()));
		
		//funciones lambda con interface funciones
		ISaludo mensaje = (saludo, despedida) -> saludo + " y " + despedida;
		System.out.println(mensaje.saludar("\nHola con expresiones lambda", "Hasta Luego"));
		
		//1. FILTRO EDAD MAYOR A 22
		System.out.println("\n-----Filtro edad > 22-----");
		lista.stream().filter(arg -> arg.getEdad() > 22).forEach(alumno
				-> System.out.println("Nombre: " + alumno.getNombre() + " Edad: " + alumno.getEdad()));
		
		//2. FILTRAR por nombre empieza por la ltra a
		System.out.println("\n-----Nombre Empieza con A-----");
		lista.stream().filter(arg -> arg.getNombre().toLowerCase().startsWith("a")).forEach(alumno
		-> System.out.println("Nombre: " + alumno.getNombre()));
				
		//3.ordenar de la a a la Z
		System.out.println("\n-----Ordenados de la A - Z-----");
		lista.stream().sorted(Comparator.comparing(Alumno::getNombre, String.CASE_INSENSITIVE_ORDER)).forEach(alumno 
		-> System.out.println(alumno.getNombre()));
		
		
		// 4. Contar a los alumnos de Medicina
		System.out.println("\n-----Contar alumnos de Medicina-----");
		long total = lista.stream().filter(arg -> arg.getCarrera().equalsIgnoreCase("lic. medicina")).count();
		System.out.println("El número total de alumnos de la carrera de Medicina es: " + total);
		
		//5.Cambiar a mayusculas
		System.out.println("\n-----Nombres en mayúsculas-----");
		lista.stream().map(alumno -> alumno.getNombre().toUpperCase()).forEach(System.out::println);
		
		//6.Promedio edades
		System.out.println("\n-----Promedio de edades-----");
		double promedio = lista.stream().mapToInt(Alumno::getEdad).average().orElse(0);                 
		System.out.println("El promedio de edades es: " + promedio);

	}

}
