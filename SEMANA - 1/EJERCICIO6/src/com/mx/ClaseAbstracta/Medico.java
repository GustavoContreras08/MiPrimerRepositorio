package com.mx.ClaseAbstracta;

public class Medico extends Profesionista{
	
	private String especialidad;
	private String consultorio;
	private double costoConsulta;
	
	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Trabajo de 12am - 4pm");
	}
		public Medico() {
		
	}
		public Medico(String nombre, String apellio, int edad, int cedula, String universidad, int experiencia,
				String especialidad, String consultorio, double costoConsulta) {
			super(nombre, apellio, edad, cedula, universidad, experiencia);
			this.especialidad = especialidad;
			this.consultorio = consultorio;
			this.costoConsulta = costoConsulta;
		}
		public String getEspecialidad() {
			return especialidad;
		}
		public void setEspecialidad(String especialidad) {
			this.especialidad = especialidad;
		}
		public String getConsultorio() {
			return consultorio;
		}
		public void setConsultorio(String consultorio) {
			this.consultorio = consultorio;
		}
		public double getCostoConsulta() {
			return costoConsulta;
		}
		public void setCostoConsulta(double costoConsulta) {
			this.costoConsulta = costoConsulta;
		}
		@Override
		public String toString() {
			return "Medico [nombre=" + nombre + ", apellio=" + apellio + ", edad=" + edad + ", cedula=" + cedula
					+ ", universidad=" + universidad + ", experiencia=" + experiencia + ", especialidad=" + especialidad
					+ ", consultorio=" + consultorio + ", costoConsulta=" + costoConsulta + "]\n";
		}

}
