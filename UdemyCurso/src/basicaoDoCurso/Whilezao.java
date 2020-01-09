package basicaoDoCurso;

import java.util.Locale;
import java.util.Scanner;

//ler um prorama ate que o 0 seja lido, ao final mostrar a soma dos numeros lidos

public class Whilezao {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int op = scanner.nextInt();
		int acumulador_op = 0;
		
		while(op != 0) {
			acumulador_op += op;
			op = scanner.nextInt();
		}
		
		System.out.println("valor total das op "+acumulador_op);
	}
}
