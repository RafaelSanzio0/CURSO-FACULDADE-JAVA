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
        Scanner scanner = new Scanner(System.in);
        Pilha1 pilha1 = new Pilha1();
        Pilha2 pilha2 = new Pilha2();
        Pilha3 pilha3 = new Pilha3();

        for (int i = 0; i < 10; i++) {
            pilha1.push(random.nextInt(101));
        }
        System.out.println("Pilha1: " + pilha1);
        System.out.println("Pilha2: " + pilha2);
        System.out.println("Pilha3: " + pilha3);

        while (true) {
            System.out.println("0 - Para Sair");
            System.out.println("1 - Para movimentar");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;

            } else if (escolha == 1) {
                int escolhaPilhaPop = scanner.nextInt();
                System.out.println("1- PILHA1");
                System.out.println("2- PILHA2");
                System.out.println("3- PILHA3");

                System.out.println("Qual pilha que irá sofrer o POP?");

                if (escolhaPilhaPop == 1) {
                    pilha1.pop();
                }
                if (escolhaPilhaPop == 2) {
                    pilha2.pop();
                }
                if (escolhaPilhaPop == 3) {
                    pilha3.pop();
                }

                System.out.println("Agora qual pilha irá receber o PUSH?");
                int escolhaPilhaPush = scanner.nextInt();

                if (escolhaPilhaPop == 1) {
                    if (escolhaPilhaPush == 2) {
                        pilha2.push(pilha1.getElemento());

                    }

                }
//                if (escolhaPilhaPush == 2) {
//                    pilha2.push();
//                }
//                if (escolhaPilhaPush == 3) {
//                    pilha3.push();
//                }

            }

            System.out.println("\n\nPressione ENTER para prosseguir.");
            scanner.nextLine();

        }

    }

}
