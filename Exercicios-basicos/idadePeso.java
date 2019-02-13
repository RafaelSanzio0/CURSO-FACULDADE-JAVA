import java.util.Scanner;

public class idadePeso {
	
	public static void main(String [] args) {
		
		int idade, media = 0, total_idade = 0, peso90 = 0;
		double peso;
		
		for(int i=1; i < 6; i++ ) {
			
			System.out.println("Candidato " + i);
			Scanner entradaIdade = new Scanner(System.in);
			System.out.print("Digite a sua idade: ");
			idade = entradaIdade.nextInt();
						
			Scanner entradaPeso = new Scanner(System.in);
			System.out.print("Digite o seu peso: ");
			peso = entradaPeso.nextDouble();
			
			total_idade += idade;
			media = total_idade/5;
			
			if (peso > 90) {
				peso90 += 1;

			}
	
		}
		
		System.out.println("Média total das 5 pessoas eh " + media);
		System.out.println("Quantidade de pessoas com peso maior que 90kg eh " + peso90);
	}
	
}
