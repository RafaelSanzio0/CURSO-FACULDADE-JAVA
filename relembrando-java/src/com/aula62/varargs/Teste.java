package com.aula62.varargs;

public class Teste {
	
	public static void main(String[] args) {
		int [] vetor = {1,2,3,4,3};   // com vetor
		System.out.println(soma(vetor));
		System.out.println(soma(1,23,5,1,2,3,4,5,3,2,2)); // sem vetor, usando varargs
	}
	
	private static int soma(int a, int b) {  //padrao aqui so podemos usar 2 parametros
		return a+b;
	}
	
	private static int soma(int a, int b, int c) {  //agr podemos usar de 2 a 3 parametros
		return a+b+c;
	}
	
	private static int soma(int [] vetor) {  //aqui recebmos N elementos,porem é preciso instanciar sempre um vetor
		int total = 0;
		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}
		return total;
	}
	
	private static int soma(int a, int b,Integer... vetor) { // aqui temos o varargs, com ele
		//podemos passar N elementos sem a nescessidade de declarar um array
		// aceita somente classes e podemos setar os tipos antes  como no exemplo
		int total = 0;
		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}
		return total;
	}
	
}
