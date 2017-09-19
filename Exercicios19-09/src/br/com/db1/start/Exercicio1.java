package br.com.db1.start;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercicio1 {
	
	private Set<String> nomes = new HashSet<>();
	
	public void retornaVogais(String nome) {
		int tmp;
		tmp = nome.indexOf("A");
		if (tmp!= -1) {
		nomes.add("A");
		}
		tmp = nome.indexOf("E");
		if (tmp!= -1) {
		nomes.add("E");
		}
		tmp = nome.indexOf("I");
		if (tmp!= -1) {
		nomes.add("I");
		}
		tmp = nome.indexOf("O");
		if (tmp!= -1) {
		nomes.add("O");
		}
		tmp = nome.indexOf("U");
		if (tmp!= -1) {
		nomes.add("U");
		}
	}
	
	public Integer retornaConsoantes(String nome) {
		Integer tmp = 0;
		nome = nome.toUpperCase();
		for (Integer x = 0; x< nome.length(); x++) {
			String letra = nome.substring(x, x+1);
			if (letra.equals("A") == false && letra.equals("E") == false && letra.equals("I") == false && letra.equals("O") == false && letra.equals("U") == false) {
				nomes.add(letra);
				tmp++;
			}
		}
		return tmp;
	}
	
	public Integer retornaLista() {
		Integer tmp = 0;
		Iterator<String> lista = nomes.iterator();
		while (lista.hasNext()) {
			System.out.println(lista.next());
			tmp++;
		}
		return tmp;
	}
}
