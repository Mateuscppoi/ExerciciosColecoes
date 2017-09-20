package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.start.Exercicio5;

public class Exercicio5Test {
	private Exercicio5 colecoes;
	
	@Before
	public void colecaoDeNumeros() {
		colecoes = new Exercicio5();
		colecoes.adicionaNumeros(1);
		colecoes.adicionaNumeros(2);
		colecoes.adicionaNumeros(3);
		colecoes.adicionaNumeros(4);
		colecoes.adicionaNumeros(5);
		colecoes.adicionaNumeros(6);
		colecoes.adicionaNumeros(7);
		colecoes.adicionaNumeros(8);
		colecoes.adicionaNumeros(9);
		colecoes.adicionaNumeros(10);
	}
	
	@Test
	public void multiplosDeDoisTest() {
		Assert.assertTrue(5 == colecoes.multiplosDeDois());
		
	}

}
