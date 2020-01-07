/*AULA SOBRE - ENUMERADORES COMO CLASSE COM M�TODOS E CONSTRUTORES 
 * Enums extends a classe java.lang.Enum
 * podem ser comparadas com ==
 * N�o podem ser instanciadas com new
 * podem implementar interface
 * pode ser declarado separadamente ou dentro de classe
 * 
 * As enums limitam voc� ao conjunto de entradas necess�rio, enquanto, 
 * mesmo que voc� use seq��ncias constantes, ainda poder� usar outra String que n�o faz parte da sua l�gica.
Isso ajuda voc� a n�o cometer erros, a inserir algo fora do dom�nio, enquanto insere
dados e tamb�m melhora a legibilidade do programa.*/

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
 