/*AULA SOBRE - ENUMERADORES COMO CLASSE COM MÉTODOS E CONSTRUTORES 
 * Enums extends a classe java.lang.Enum
 * podem ser comparadas com ==
 * Não podem ser instanciadas com new
 * podem implementar interface
 * pode ser declarado separadamente ou dentro de classe
 * 
 * As enums limitam você ao conjunto de entradas necessário, enquanto, 
 * mesmo que você use seqüências constantes, ainda poderá usar outra String que não faz parte da sua lógica.
Isso ajuda você a não cometer erros, a inserir algo fora do domínio, enquanto insere
dados e também melhora a legibilidade do programa.*/

package com.aula54.enumeradores;

public enum DiaSemana {
	//enum com valores
	SEGUNDA(1), TERCA(2) , QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int valor;
	
	DiaSemana(int valor){ // construtor para adicionar os valores nos enum ACIMA^^
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	

}
 