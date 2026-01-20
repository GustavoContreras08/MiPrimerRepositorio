package com.mx.Producto;

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
		
		imp.read();
		
		//buscar
		pdAux = imp.buscar(1);
		System.out.println("Productos encontrados: " + pdAux);
		
		//editar
		pdAux = imp.buscar(1);
		pdAux.setNombre("Topochico");
		pdAux.setPrecio(85);
		imp.update(1, pd2);
		System.out.println("Producto editado " + pdAux);
		
		//eliminar
		imp.delete(2);
		imp.read();
		
		//contar
		imp.contar();
		
	}

}
