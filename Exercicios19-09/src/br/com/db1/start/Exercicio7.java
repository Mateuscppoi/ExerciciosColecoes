package br.com.db1.start;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercicio7 {
	private Set<String> textoOriginal  = new HashSet<>();
	private Set<String> textoCopiado = new HashSet<>();
	
	public void adicionaTexto(String texto) {
		textoOriginal.add(texto);
	}
	
	public Integer Compara() {
		Iterator<String> lista = textoOriginal.iterator();
		while (lista.hasNext()) {
			String texto = lista.next();
			textoCopiado.add(texto);
		}
		System.out.println(textoCopiado);
		return textoCopiado.size();
	}

}
