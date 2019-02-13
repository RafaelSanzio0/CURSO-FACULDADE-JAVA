/* Faça um programa que receba dois números e apresenta a soma destes números.
Pergunte ao usuário se ele deseja (S/N) somar outros pares de números.*/


import java.util.Scanner;

public class doisNumeros {
    
    public static void main(String[] args) {
    
        int numero1, numero2;
        char resposta;
        Scanner entrada = new Scanner(System.in);
        
        do {
            
        System.out.println("Digite 2 números: ");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
        
        System.out.println("Soma = " + (numero1+numero2));
        
        System.out.print("Deseja somar outros números (S/N)? ");
        resposta = entrada.next().charAt(0);
        
        } while (resposta != 'n' && resposta != 'N');
        
    }
    
}