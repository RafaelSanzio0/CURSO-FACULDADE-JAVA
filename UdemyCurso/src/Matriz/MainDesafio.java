package Matriz;

import java.util.Scanner;

/*
Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.
 */

public class MainDesafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("linhas: ");
        int linhas = sc.nextInt();
        System.out.println("colunas: ");
        int colunas = sc.nextInt();

        int[][] mat = new int[linhas][colunas];

        for (int i = 0; i < mat.length; i++) { //linha
            for (int j = 0; j < mat[i].length; j++) { // coluna
                mat[i][j] = sc.nextInt();
            }
        }

        int valorEscolhido = sc.nextInt();

        for (int i = 0; i < mat.length; i++) { //linha
            for (int j = 0; j < mat[i].length; j++) { // coluna
                if (valorEscolhido == mat[i][j]) {
                    System.out.println("Position: " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }
    }
}