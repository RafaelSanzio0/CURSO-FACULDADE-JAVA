package com.aula64.classesAninhadas;

// ********** CLASSE LOCAL

public class Externa2 {
	
	private void methodQualquer() {
		
		class ClasseLocal{
			private String texto = "texto da classe local";
			
			private void imprimiTexto() {
				System.out.println(texto);

			}
		}
		ClasseLocal classeLocal = new ClasseLocal();
		classeLocal.imprimiTexto();
	}
	
	public static void main(String[] args) {
		Externa2 externa2 = new Externa2();
		externa2.methodQualquer();
		
	}

}
