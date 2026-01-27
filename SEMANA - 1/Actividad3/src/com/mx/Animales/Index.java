package com.mx.Animales;

public class Index {

	public static void main(String[] args) {
		Animal l1 = new Animal(001, "Panda", "Oso",234, 70);
		Animal l2 = new Animal(002, "Grisly", "Oso",1233, 50);
		Animal l3 = new Animal(003, "Pastor Aleman", "Perro",234123, 15);
		Animal l4 = new Animal(004, "Labrador", "Perro",1321324, 15);
		Animal l5 = new Animal(005, "emperador", "Gato",2342342, 10);
		
		Animal auxan = null;
		
		ImpAnimal imp = new ImpAnimal();
		
		//Guardar elementos en el hash
		imp.create(l1);
		imp.create(l2);
		imp.create(l3);
		imp.create(l4);
		imp.create(l5);
		
		//mostrar los que exixte en el hash
		imp.read();
		
		//buscar
		auxan = new Animal(001);
		auxan  = imp.search(auxan);
		System.out.println("Libro encontrado: " + auxan);
		
		//Editar
		auxan = new Animal(002);
		auxan = imp.search(auxan);
		auxan.setEspecie("Mamifero");
		imp.update(auxan);
		System.out.println("Libro actualizado " + auxan);
		
		//Eliminar
		auxan = new Animal(003);
		imp.delete(auxan);
		System.out.println("Lista Actualizada\n");
		imp.read();
		
		//contar
		imp.contar();

	}

}
