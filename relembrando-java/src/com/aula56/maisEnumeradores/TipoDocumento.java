package com.aula56.maisEnumeradores;

public enum TipoDocumento {
	
	CPF {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cpf(true);
		}
	}, CNPJ {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cnpj(true);
		}
	};
	
	
	public abstract String geraNumeroTeste();
	

}

