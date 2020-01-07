package com.aula56.maisEnumeradores;

public class Teste {
	public static void main(String[]args) {
		
		for(TipoDocumento doc: TipoDocumento.values()) {
			System.out.println(doc+" - "+doc.geraNumeroTeste());
		}

	}

}
