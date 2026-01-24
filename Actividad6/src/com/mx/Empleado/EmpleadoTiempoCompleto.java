package com.mx.Empleado;

public class EmpleadoTiempoCompleto extends Empleado{
	
	private String tip;

	
	public EmpleadoTiempoCompleto(String nombre, int edad, double salario, String tip) {
		super(nombre, edad, salario);
		this.tip = tip;
	}
	


	public String getTip() {
		return tip;
	}



	public void setTip(String tip) {
		this.tip = tip;
	}

	

	@Override
	public String toString() {
		return "EmpleadoTiempoCompleto [getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getSalario()="
				+ getSalario() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", tip=" + tip + "]";
	}

	public void calcularBono(String name, int edad, double salario, String tipo) {
		//System.out.println("Calculo de bono: ");
		
			
			double newCal = salario+(salario * .2);
			System.out.println("Nombre: " + name + " Edad: " + edad + " Salario: " + salario + " Calculo con bono: " + newCal);
				
	}

}
