package com.padrao.builder;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.padrao.constantes.CarroConst;
import com.padrao.model.Carro;

public class TestCarroBuilder {

	Map<CarroConst, Object> mapa;
	CarroBuilder builder;
	
	@Before
	public void iniciar() {
		mapa = new HashMap<>();
		builder = new CarroBuilder();
	}

	@Test
	public void testeCarroReal() {
		//prepara
		mapa.put(CarroConst.ANO, 2010);
		mapa.put(CarroConst.COR, "Vermelho");
		
		//executa
		Carro carro = builder.carregar(mapa).build();
		
		//valida
		assertEquals("Vermelho", carro.getCor());
		assertEquals(new Integer(2010), carro.getAno());
	}
	

}
