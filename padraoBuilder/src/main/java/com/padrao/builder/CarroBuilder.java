package com.padrao.builder;

import java.util.Map;

import com.padrao.model.Carro;

public class CarroBuilder {
	
	private Carro carro = new Carro();

	public CarroBuilder carregar(Map<String, Object> mapa) {
		for (Map.Entry<String, Object> par : mapa.entrySet()) {
			switch (par.getKey()) {
				case Carro.ANO: carro.setAno((Integer) par.getValue());
					break;
				case Carro.COR: carro.setCor((String) par.getValue());
					break;	
			}
		}		
		return this;
	}

	public Carro build() {
		return carro;
	}

}
