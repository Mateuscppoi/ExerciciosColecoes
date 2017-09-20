package br.com.db1.start;

import java.util.Comparator;

public class CarrosComparator implements Comparator<Carros>{

	@Override
	public int compare(Carros carros, Carros outroCarro) {
		return carros.getPlaca().compareTo(outroCarro.getPlaca());
	}



}

