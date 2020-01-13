package vetores;

//Fazer um programa para ler um número inteiro N e a altura de N
//        pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
//        altura média dessas pessoas.

import java.util.Locale;
import java.util.Scanner;

public class MainVetor {
    public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            double[] vect = new double[n];
            for (int i = 0; i < n; i++) {
                vect[i] = sc.nextDouble();
            }
            double sum = 0.0;
            for (int i = 0; i < n; i++) {
                sum += vect[i];
            }
            double avg = sum / n;
            System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
            sc.close();
        }
    }


/* public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o tamanho do vetor: ");
        int qtdPessoas = scanner.nextInt();
        double [] alturaPessoas = new double[qtdPessoas];
        double somaAltura = 0;
        double mediaAltura = 0;

        for (int i = 0; i < alturaPessoas.length; i ++){
            double altura;
            System.out.println("Digite a altura da pessoa: " + i);
            altura = scanner.nextInt();
            somaAltura += altura;
            mediaAltura = somaAltura/qtdPessoas;
        }
        System.out.println(mediaAltura);
    }
    */

