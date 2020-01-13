package vetores;
/*A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
 */

import java.util.Locale;
import java.util.Scanner;

public class MainDesafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Estudante[] quartos = new Estudante[11];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos estudantes vão alugar os quartos?: ");
        int quartosAlugados = scanner.nextInt();

        for(int i=0; i <= quartosAlugados; i ++){
            System.out.println("Estudante# "+(i+1));

            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.next();

            System.out.print("Numero do quarto: ");
            int numeroQuarto = scanner.nextInt();

            quartos[numeroQuarto] = new Estudante(nome,email);
        }
        System.out.println("*********Quartos alugados**********");

        for(int i = 0; i < 11; i ++){
            if(quartos[i] != null){
                System.out.println("Quarto"+i+": "+quartos[i]);
            }
        }
    }
}
