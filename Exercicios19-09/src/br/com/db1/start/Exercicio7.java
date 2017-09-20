package br.com.db1.start;

import java.util.ArrayList;
import java.util.List;

public class Exercicio7 {
	private List<String> texto1  = new ArrayList<>();
	private List<String> texto2 = new ArrayList<>();
	
	public void adicionaTexto1(String texto) {
		texto1.add(texto);
	}
	
	public void adicionaTexto2(String texto) {
		texto2.add(texto);
	}
	
	public Boolean comparaList() {
			if (texto1.equals(texto2)) {
				return true;
			}
		return false;
	}
}
