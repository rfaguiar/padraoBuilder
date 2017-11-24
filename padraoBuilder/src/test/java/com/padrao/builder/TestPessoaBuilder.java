package com.padrao.builder;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.padrao.constantes.PessoaConst;
import com.padrao.model.Pessoa;

public class TestPessoaBuilder {

	Map<PessoaConst, Object> mapa;
	PessoaBuilder builder;
	
	@Before
	public void iniciar() {
		mapa = new HashMap<>();
		builder = new PessoaBuilder();
	}

	@Test
	public void testePessoaReal() {
		//prepara
		mapa.put(PessoaConst.NOME, "Fulano");
		mapa.put(PessoaConst.IDADE, 20);
		
		//executa
		Pessoa pessoa = builder.carregar(mapa).build();
		
		//valida
		assertEquals("Fulano", pessoa.getNome());
		assertEquals(new Integer(20), pessoa.getIdade());
	}
	

}
