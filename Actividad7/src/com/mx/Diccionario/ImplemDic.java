package com.mx.Diccionario;

import java.util.HashMap;

public class ImplemDic implements IMetodos{
	
	HashMap<Integer, Palabras> hash = new HashMap<Integer, Palabras>();
	

	@Override
	public void create(Palabras palabras) {
		hash.put(palabras.getId(), palabras);
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println(hash);
	}

	@Override
	public void update(Palabras palabras) {
		hash.put(palabras.getId(), palabras);
		
	}

	@Override
	public void delete(Palabras palabras) {
		hash.remove(palabras.getId());
		
	}

	@Override
	public Palabras search(Palabras palabras) {
		// TODO Auto-generated method stub
		return hash.get(palabras.getId());
	}

}
