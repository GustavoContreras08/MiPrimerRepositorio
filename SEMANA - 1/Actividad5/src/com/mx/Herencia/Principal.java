package com.mx.Herencia;

public class Principal {

    public static void main(String[] args) {

        Perro perro = new Perro("Perro", ".5", 5, "Pastor Aleman", "Raley", "Cafe");
        Gato gato = new Gato("Gato", ".2", 2, "Siames", "Mushu", "Atigrado");
        
        Animal animal = new Animal();

        // Perro
        perro.setAltura(".4");
        perro.setNombre("Rocky");
        System.out.println("Actualizado \n" + perro);
        perro.hacerSonido();

        // Gato
        gato.setEdad(3);
        gato.setNombre("Juan");
        System.out.println("Actualizado \n" + gato);
        gato.hacerSonido();
    }
}
