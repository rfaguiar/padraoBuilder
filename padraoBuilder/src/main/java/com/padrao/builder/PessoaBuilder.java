package com.padrao.builder;

import java.util.Map;

import com.padrao.model.Pessoa;

public class PessoaBuilder {

	private Pessoa pessoa = new Pessoa();

	public PessoaBuilder carregar(Map<String, Object> mapa) {
		for (Map.Entry<String, Object> par : mapa.entrySet()) {
			switch (par.getKey()) {
				case Pessoa.NOME: pessoa.setNome((String) par.getValue());
					break;
				case Pessoa.IDADE: pessoa.setIdade((Integer) par.getValue());
					break;	
			}
		}		
		return this;
	}

	public Pessoa build() {
		return pessoa;
	}

}
