package com.mx.ClaseAbstracta;

public class Principal {

	public static void main(String[] args) {
		//instacia abogado
		Abogado abogado = new Abogado("Martin", "Mendez", 34, 34313415, "UNAM", 7, "De lo familiar", "DIF", 3000);
		System.out.println(abogado);
		abogado.trabajar();
		abogado.cobrar(abogado.getTipo(), abogado.getHonorarios());
		
		//Medico
		Medico medico = new Medico("Mariana", "Montero", 32, 3132134, "BUAP", 5, "Medico", "Planta ", 3500);
		System.out.println(medico);
		medico.trabajar();
		medico.cobrar(medico.getEspecialidad(), medico.getCostoConsulta());
	}

}
