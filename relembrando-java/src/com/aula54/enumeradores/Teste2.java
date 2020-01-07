package com.aula54.enumeradores;

public class Teste2 {
	public static void main(String[]args) {
		//aqui estamos pegando o valor do enum domingo
		DiaSemana dias = (Enum.valueOf(DiaSemana.class, "DOMINGO"));
		System.out.println(dias);
	}

}
