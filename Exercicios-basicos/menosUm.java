/* Faça um programa que leia vários números encerrando quando o usuário digitar -1.
Calcule e mostre a soma e a média dos números digitados.*/

import java.util.Scanner;

public class menosUm {
    
    public static void main(String[]args){
        
        int numeros = 0, soma = 0, media = 0, ac_numeros = 0, qtdNumeros = 0;
        
        Scanner entradaNumeros = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        numeros = entradaNumeros.nextInt();
        
        while (numeros!= -1){
            
            soma += numeros;
            ac_numeros += numeros;
            qtdNumeros ++;
            media = ac_numeros/qtdNumeros;
            
            System.out.println("Digite um numero: ");
            numeros = entradaNumeros.nextInt();
            
        }
        
        System.out.println("A soma dos numeros digitados eh " + (soma));
        System.out.println("A media dos numeros digitados eh " + media);
    }
   
}
