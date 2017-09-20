package br.com.db1.start;

import java.util.Comparator;

public class CarrosComparatorMarca implements Comparator<Carros>{

	@Override
	public int compare(Carros carros, Carros outroCarro) {
		return carros.getMarca().compareTo(outroCarro.getMarca());
	}



}