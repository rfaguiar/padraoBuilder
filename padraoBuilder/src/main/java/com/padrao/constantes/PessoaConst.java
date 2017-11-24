package com.padrao.constantes;

import com.padrao.model.Pessoa;

public enum PessoaConst {
	NOME {
		@Override
		public void set(Pessoa pessoa, Object o) {
			pessoa.setNome((String) o);
		}
	},
	IDADE {
		@Override
		public void set(Pessoa pessoa, Object o) {
			pessoa.setIdade((Integer) o);
		}
	};		
	public abstract void set(Pessoa pessoa, Object o);
}
