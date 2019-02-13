
import java.util.Scanner;

public class conversao {
	
	public static void main (String [] args) {
		
		double compra, convDolar, convEuro, convLibra;
		int tipo;
		
		System.out.println("Conversão de moedas\n");
		System.out.println("1- Dólar americano");
		System.out.println("2- Euro");
		System.out.println("3- Libra esterlina\n");
		
		Scanner entradaCompra = new Scanner(System.in);
		System.out.print("Digite o preco da compra: ");
		compra = entradaCompra.nextDouble();
		
		Scanner entradaTipo = new Scanner(System.in);
		System.out.print("Digite o tipo de moeda: ");
		tipo = entradaTipo.nextInt();
		
		switch (tipo) {
		
		case 1:
			convDolar = compra/3.91;
			System.out.printf("Valor da compra em Dolar eh %.2f" , convDolar);
			break;
		
		case 2:
			convEuro = compra/4.47;
			System.out.printf("Valor da compra em Euro eh %.2f" , convEuro);
			break;

		case 3:
			convLibra = compra/4.99;
			System.out.printf("Valor da compra em Libra eh %.2f" , convLibra);
			break;

		}
			
	}

}