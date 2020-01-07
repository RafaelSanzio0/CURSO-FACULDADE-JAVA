package com.aula59.importStatic;

import static java.lang.Math.sqrt; //importamos passando o static
// assim nao é preciso setar a classe Math para usar os metodos

public class Teste {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		System.out.println(sqrt(a));

	}

}
