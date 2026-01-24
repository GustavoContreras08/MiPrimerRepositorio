package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Principal.IMetodosAct4;

public class ImpGenericaAct4 implements IMetodosAct4{
	
	protected List<Object> lista = new ArrayList<Object>();
	//protected lista<Object, Object> hash = new lista<Object, Object>();

	@Override
	public void create(Object key, Object value) {
		// TODO Auto-generated method stub
		lista.add(value);
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println(lista);
	}

	@Override
	public void update(Object key, Object value) {
		// TODO Auto-generated method stub
		lista.size();
		
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
