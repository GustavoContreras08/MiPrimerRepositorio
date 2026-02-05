package com.mx.PadreHijo.Dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Hijo {

    @Id
    private int idHijo;
    private String nombre;
    private String apellido;
    private int edad;
    private String hobbie;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PadreId")
    private Padre padre;

    public Hijo() {
    }

    public Hijo(int idHijo, String nombre, String apellido, int edad, String hobbie, Padre padre) {
        this.idHijo = idHijo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.hobbie = hobbie;
        this.padre = padre;
    }

    public int getIdHijo() {
        return idHijo;
    }

    public void setIdHijo(int idHijo) {
        this.idHijo = idHijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public Padre getPadre() {
        return padre;
    }

    public void setPadre(Padre padre) {
        this.padre = padre;
    }

    @Override
    public String toString() {
        return "Hijo [idHijo=" + idHijo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
                + ", hobbie=" + hobbie + "]";
    }
}
