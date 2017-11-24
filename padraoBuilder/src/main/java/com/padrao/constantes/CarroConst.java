package com.padrao.constantes;

import com.padrao.model.Carro;

public enum CarroConst {
	ANO {
		@Override
		public void set(Carro carro, Object o) {
			carro.setAno((Integer) o);
		}
	},
		COR {
		@Override
		public void set(Carro carro, Object o) {
			carro.setCor((String) o);
		}
	};		
	public abstract void set(Carro carro, Object o);
}
