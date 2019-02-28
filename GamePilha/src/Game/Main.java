/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Pilha1 pilha1 = new Pilha1();            
        Pilha2 pilha2 = new Pilha2();
        Pilha3 pilha3 = new Pilha3();

        for (int i = 0; i < 10; i++) {
            pilha1.push(random.nextInt(101));
        }
        System.out.println("Pilha1: " + pilha1);
        System.out.println("Pilha2: " + pilha2);
        System.out.println("Pilha3: " + pilha3);
        
        while(true){
            System.out.println("0 - Para Sair");
            System.out.println("1 - Para movimentar");
        }
        

    }

}
