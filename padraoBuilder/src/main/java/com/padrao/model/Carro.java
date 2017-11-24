package com.padrao.model;

public class Carro {

	public static final String ANO = "CARRO_ANO";
	public static final String COR = "CARRO_COR";
	
	private String cor;
	private Integer ano;
	
	public Carro() {
		this.cor = "";
		this.ano = 0;
	}
	
	public Carro(String cor, Integer ano) {
		super();
		this.cor = cor;
		this.ano = ano;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", ano=" + ano + "]";
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	
}
