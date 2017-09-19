package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.Exercicio1;;

public class Exercicio1Test {
	
	@Test
	public void retornaVogaisTest() {
		Exercicio1 colecao = new Exercicio1();
		
		colecao.retornaVogais("MATEUS");
		int tmp = 3;
		Assert.assertTrue(tmp == colecao.retornaLista());	
	}
	
	@Test
	public void retornaConsoantesTest() {
		Exercicio1 colecao = new Exercicio1();
		Assert.assertTrue(3 == colecao.retornaConsoantes("MATEUS"));
		colecao.retornaLista();
		}

}
