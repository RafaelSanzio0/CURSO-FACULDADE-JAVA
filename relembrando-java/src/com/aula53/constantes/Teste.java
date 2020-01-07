package com.aula53.constantes;

public class Teste {
	
	public static void main(String[]args) {
		usandoConstantes();
		System.out.println();
		usandoEnum();
	}
	
	public static void usandoConstantes() {
		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;
		
		imprimiDiaSemana(segunda);
		imprimiDiaSemana(terca);
		imprimiDiaSemana(quarta);
		imprimiDiaSemana(quinta);
		imprimiDiaSemana(sexta);
		imprimiDiaSemana(sabado);
		imprimiDiaSemana(domingo);
	}
	
	public static void imprimiDiaSemana(int dia) {
		switch (dia) {
			case 1 :
				System.out.println("segunda-feira");
				break;
			case 2 :
				System.out.println("terça-feira");
				break;
			case 3 :
				System.out.println("quarta-feira");
				break;
			case 4 :
				System.out.println("quinta-feira");
				break;
			case 5 :
				System.out.println("sexta-feira");
				break;
			case 6 :
				System.out.println("sabado");
				break;
			case 7 :
				System.out.println("domingo");
				break;
		}
	}
	
	public static void usandoEnum() {
		DiaSemanaEnum segunda = DiaSemanaEnum.SEGUNDA;
		DiaSemanaEnum terca = DiaSemanaEnum.TERCA;
		DiaSemanaEnum quarta = DiaSemanaEnum.QUARTA;
		DiaSemanaEnum quinta = DiaSemanaEnum.QUINTA;
		DiaSemanaEnum sexta = DiaSemanaEnum.SEXTA;
		DiaSemanaEnum sabado = DiaSemanaEnum.SABADO;
		DiaSemanaEnum domingo = DiaSemanaEnum.DOMINGO;	
		
		imprimiDiaSemanaEnum(segunda);
		imprimiDiaSemanaEnum(terca);
		imprimiDiaSemanaEnum(quarta);
		imprimiDiaSemanaEnum(quinta);
		imprimiDiaSemanaEnum(sexta);
		imprimiDiaSemanaEnum(sabado);
		imprimiDiaSemanaEnum(domingo);

	}
	
	public static void imprimiDiaSemanaEnum(DiaSemanaEnum dia) {
		switch (dia) {
			case SEGUNDA :
				System.out.println("segunda-feira");
				break;
			case TERCA :
				System.out.println("terça-feira");
				break;
			case QUARTA :
				System.out.println("quarta-feira");
				break;
			case QUINTA :
				System.out.println("quinta-feira");
				break;
			case SEXTA :
				System.out.println("sexta-feira");
				break;
			case SABADO :
				System.out.println("sabado");
				break;
			case DOMINGO :
				System.out.println("domingo");
				break;
		}
	}
}
