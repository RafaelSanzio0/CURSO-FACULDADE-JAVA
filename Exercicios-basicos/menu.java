
import java.util.Scanner;

public class menu {
	
	public static void main(String [] args) {
		
		System.out.println("Menu de operações\n");
		System.out.println("1- Média");
		System.out.println("2- Produto");
		System.out.println("3- Diferença do maior pelo menor");
		System.out.println("4- Sair\n");

		int valor1, valor2, op = 0, media, produto, diferença, contador = 1;
		
		while (op != 4) {
			
			Scanner entradaOp = new Scanner(System.in);
			System.out.print("Digite uma opcao do menu: ");
			op = entradaOp.nextInt();
			
			if(op == 1) {
				
				Scanner entradaValor1 = new Scanner(System.in);
				System.out.print("Digite o primeiro valor: ");
				valor1 = entradaValor1.nextInt();
				
				Scanner entradaValor2 = new Scanner(System.in);
				System.out.print("Digite o segundo valor: ");
				valor2 = entradaValor2.nextInt();
				
				media = (valor1+valor2)/2;
				System.out.println("Media dos numeros = " + media);	
			}
			
			if (op == 2) {
				
				Scanner entradaValor1 = new Scanner(System.in);
				System.out.print("Digite o primeiro valor: ");
				valor1 = entradaValor1.nextInt();
				
				Scanner entradaValor2 = new Scanner(System.in);
				System.out.print("Digite o segundo valor: ");
				valor2 = entradaValor2.nextInt();
				
				produto = valor1 * valor2;
				System.out.println("Produto dos numeros =  " + produto);
			}
			
			if (op == 3) {
				
				Scanner entradaValor1 = new Scanner(System.in);
				System.out.print("Digite o primeiro valor: ");
				valor1 = entradaValor1.nextInt();
				
				Scanner entradaValor2 = new Scanner(System.in);
				System.out.print("Digite o segundo valor: ");
				valor2 = entradaValor2.nextInt();
				
				if(valor1 > valor2) {
					diferença = valor1 - valor2;
					System.out.println("Diferença dos numeros = " + diferença);
					
				}else{
					diferença = valor2 - valor1;
					System.out.println("Diferença dos numeros = " + diferença);
				}		
				
			}
			
			if (op == 4) {
				System.out.println("Você Saiu");
				break;	
			}
		
			if(op > 4) {
				System.out.println("COMANDO INVÁLIDO O PROGRAMA IRÁ SER ENCERRADO!!!");
				break;
			}
		
			
		}
			
	}
		
}

