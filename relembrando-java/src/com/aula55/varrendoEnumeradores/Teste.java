package com.aula55.varrendoEnumeradores;

import com.aula54.enumeradores.DiaSemana;

public class Teste {
	public static void main(String[]args) {
		
		DiaSemana [] diaSemanas = DiaSemana.values();
		
		for (int i = 0; i < diaSemanas.length; i++) {
			System.out.println(diaSemanas[i]);
			
		}
		
		System.out.println();
		
		for(DiaSemana diaSemana : DiaSemana.values()) {
			System.out.println(diaSemana);
		}
		
	}
		
		

}
