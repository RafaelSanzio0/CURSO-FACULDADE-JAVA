package com.aula64.classesAninhadas;

// ********* CLASSE EXTERNA E INTERNA

public class Externa {
	private String texto = "frase externa";
	
	public class Interna{
		private String texto = "frase interna";
		
		public void imprimiTexto() {
			System.out.println(texto);
			System.out.println(Externa.this.texto);
		}
	}
	
	public static void main(String[] args) {
		Externa externa = new Externa();
		Interna interna = externa.new Interna(); // instanciando uma classe aninhada
		
		interna.imprimiTexto();
		
		
		
	}

}
