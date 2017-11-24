package com.padrao.builder;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.padrao.model.Carro;

public class TestPessoaBuilder {

	Map<String, Object> mapa;
	CarroBuilder builder;
	
	@Before
	public void iniciar() {
		mapa = new HashMap<>();
		builder = new CarroBuilder();
	}

	@Test
	public void testePessoaReal() {
		//prepara
		mapa.put(Carro.ANO, 2010);
		mapa.put(Carro.COR, "Vermelho");
		
		//executa
		Carro carro = builder.carregar(mapa).build();
		
		//valida
		assertEquals("Vermelho", carro.getCor());
		assertEquals(new Integer(2010), carro.getAno());
	}
	
	@Test
	public void testeValorErrado() {
		//prepara
		mapa.put("qualquercoisa", "blabla");
		mapa.put("outracoisa", 20);
		
		//executa
		Carro carro = builder.carregar(mapa).build();

		//valida
		assertEquals("", carro.getCor());
		assertEquals(new Integer(0), carro.getAno());
	}

}
