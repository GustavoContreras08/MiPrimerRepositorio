package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Principal.IMetodosLista;

public class ImpGenLista implements IMetodosLista{
	
	protected List<Object> lista = new ArrayList<Object>();

	@Override
	public void create(int index, Object object) {
		// TODO Auto-generated method stub
		lista.add(object);
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println(lista);
	}

	@Override
	public void update(int index, Object object) {
		// TODO Auto-generated method stub
		lista.set(index, object);
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		lista.remove(index);
	}

	@Override
	public Object search(int index) {
		// TODO Auto-generated method stub
		return lista.get(index);
	}

}
