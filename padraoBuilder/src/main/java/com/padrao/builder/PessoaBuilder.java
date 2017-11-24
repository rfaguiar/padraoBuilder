package com.padrao.builder;

import java.util.Map;

import com.padrao.constantes.PessoaConst;
import com.padrao.model.Pessoa;

public class PessoaBuilder {

	private Pessoa pessoa = new Pessoa();

	public PessoaBuilder carregar(Map<PessoaConst, Object> mapa) {
		for (Map.Entry<PessoaConst, Object> par : mapa.entrySet()) {
			par.getKey().set(pessoa, par.getValue());
		}		
		return this;
	}

	public Pessoa build() {
		return pessoa;
	}

}
