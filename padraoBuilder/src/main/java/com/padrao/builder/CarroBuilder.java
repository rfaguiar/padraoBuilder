package com.padrao.builder;

import java.util.Map;

import com.padrao.constantes.CarroConst;
import com.padrao.model.Carro;

public class CarroBuilder {
	
	private Carro carro = new Carro();

	public CarroBuilder carregar(Map<CarroConst, Object> mapa) {
		for (Map.Entry<CarroConst, Object> par : mapa.entrySet()) {
			par.getKey().set(carro, par.getValue());
		}		
		return this;
	}

	public Carro build() {
		return carro;
	}

}
