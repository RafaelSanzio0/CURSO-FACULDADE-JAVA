package com.aula54.enumeradores;

public class Teste {
	
	public static void main(String[]args) {
		
		DiaSemana diaSemana = DiaSemana.DOMINGO; // aqui estamos instanciando
		// o diasemana com o enum domingo
		
		System.out.println("Dia: "+diaSemana+" valor no banco: "+diaSemana.getValor());
		
	}

}
