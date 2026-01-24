package com.mx.Diccionario;

public class Palabras {
	private int id;
	private String esp;
	private String ing;
	
	public Palabras(){
		
	}

	public Palabras(int id, String esp, String ing) {
		super();
		this.id = id;
		this.esp = esp;
		this.ing = ing;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEsp() {
		return esp;
	}

	public void setEsp(String esp) {
		this.esp = esp;
	}

	public String getIng() {
		return ing;
	}

	public void setIng(String ing) {
		this.ing = ing;
	}

	@Override
	public String toString() {
		return "Palabras [id=" + id + ", esp=" + esp + ", ing=" + ing + "]\n";
	}
	
}
