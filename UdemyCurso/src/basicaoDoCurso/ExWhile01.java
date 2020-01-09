package basicaoDoCurso;

import java.util.Scanner;

/*leia uma senha ate que seja valida(considere 2002) - responda com acesso permitido e feche o programa,
caso contrario diga que a senha esta invalida
*/

public class ExWhile01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int senha = scanner.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha inválida");
			senha = scanner.nextInt();	
		}
		System.out.println("Senha válida");

	}

}
