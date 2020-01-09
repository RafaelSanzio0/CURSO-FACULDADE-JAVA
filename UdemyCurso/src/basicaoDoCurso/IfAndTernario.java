// operadora cobra 50 reais por ate 100 min, se passar disso deve cobrar 2 reais por cada minuto excedido

package basicaoDoCurso;

import java.util.Locale;
import java.util.Scanner;

public class IfAndTernario {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double conta = 50.00;
		int minutos = scanner.nextInt();
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2;
			System.out.println("Valor a pagar: R$"+conta);
		}else {
			System.out.println("Valor a pagar: R$"+conta);
		}
		
		double valorConta = (minutos > 100) ? conta += (minutos - 100) * 2 : conta; // uso do ternario
		System.out.println(valorConta);
	}

}
