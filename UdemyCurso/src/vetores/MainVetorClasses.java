package vetores;



/*Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos.
 */

import OO.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainVetorClasses {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        double soma = 0.0;

        for(int i = 0; i < vect.length; i ++){
            String nome = sc.next();
            double preco = sc.nextDouble();
            vect[i] = new Product(nome,preco);
            soma += vect[i].getPrice();
        }
        double media = soma/n;
        System.out.println(String.format("%.2f",media));
    }
}

