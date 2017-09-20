package br.com.db1.start;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Exercicio6 {
	private Set<String> textoOriginal  = new HashSet<>();
	private Set<String> textoCopiado = new HashSet<>();
	
	private List<String> textoOriginal2 = new ArrayList<>();
	private List<String> textoCopiado2 = new ArrayList<>();
	
	public void adicionaTexto(String texto) {
		textoOriginal.add(texto);
		textoOriginal2.add(texto);
	}
	
	public Integer copiaTexto() {
		Iterator<String> lista = textoOriginal.iterator();
		while (lista.hasNext()) {
			String texto = lista.next();
			textoCopiado.add(texto);
		}
		Collections.copy(textoCopiado2, textoOriginal2);
		System.out.println(textoCopiado2);
		return textoCopiado.size();
	}
}

// sem falar que a maneira de que vc faz de separar cada teste em uma classe nova facilita a concentração tbm, vou aderir  essa pratica.