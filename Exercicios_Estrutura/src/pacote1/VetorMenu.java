package pacote1;

import java.util.Arrays;
import java.util.Scanner;

public class VetorMenu {

    static int[] numeros;

    public static void main(String[] args) {

        numeros = new int[5];
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);

        while (true) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\n----------------------------------------------");
            System.out.println(" RELEMBRANDO VETORES");
            System.out.println("----------------------------------------------");
            System.out.println("0 - sair.");
            System.out.println("1 - imprimir o vetor.");
            System.out.println("2 - inserir um elemento (maior que zero e a posicao no vetor tem que estar livre (=0)).");
            System.out.println("3 - excluir um elemento.");
            System.out.println("4 - trocar dois elementos de lugar entre si.");
            System.out.println("5 - localizar o maior e o menor elementos do vetor");
            System.out.println("6 - ordenar os elementos do vetor em ordem crescente");
            System.out.println("7 - ordenar os elementos do vetor em ordem decrescente");
            System.out.println("8 - ordenar os elementos do vetor em um segundo vetor (o metodo cria o novo vetor, copia os dados e retorna o vetor ordenado)");
            System.out.println("---------------------");
            System.out.print("Qual a sua opcao -> ");
            int op = scn.nextInt();

            if (op == 0) {
                break;

            } else if (op == 1) {
                imprimir();
                scn.nextLine();

            } else if (op == 2) {
                System.out.println("Digite a posição em que deseja inserir o novo valor");
                int index = scn.nextInt();
                System.out.println("Digite o valor");
                int valor = scn.nextInt();
                System.out.println(adicionar(index, valor));
                scn.nextLine();

            } else if (op == 3) {
                System.out.print("Indice do elemento a ser removido: ");
                int idx = scn.nextInt();
                int val = excluir(idx);
                if (val == 0) {
                    System.out.println("Nao ha´ elemento na posicao " + idx);
                } else if (val == -1) {
                    System.out.println("ERRO: o indice esta´ fora dos limites do vetor.");
                } else {
                    System.out.println("Valor excluido da posicao " + idx + ": " + val);
                }

            } else if (op == 5) {
                System.out.println((Arrays.toString(maiorMenor())));
                scn.nextLine();

            } else if (op == 6) {
                ordemCrescente(numeros);
                

            } else if (op == 7) {
                ordemDecrescente(numeros);
            }
            System.out.println("\n\nPressione ENTER para prosseguir.");
            scn2.nextLine();

        }
        System.out.println("-------------------------------------------------");
        System.out.println("\n\nObrigado e até a proxima vez.");

    }

    static void imprimir() {
        System.out.print("\n[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("}");
    }

    static String adicionar(int index, int valor) {
        if (valor < 0) {
            return "valor do elemento precisa ser maior que 0";
        }
        if (index < 0 || index > numeros.length - 1) {
            return "index fora dos padroes do array";
        }
        if (numeros[index] > 0) {
            return "posição ocupada";
        }
        numeros[index] = valor;
        return "valor inserido";

    }

    static int excluir(int index) {
        if (index < 0 || index > numeros.length - 1) {
            return -1;
        }
        int numero = numeros[index];
        numeros[index] = 0;
        return numero;
    }

    static int trocar(int index, int index2) {
        if (index < 0 || index > numeros.length - 1) {
            return -1;
        }
        if (index2 < 0 || index2 > numeros.length - 1) {
            return -1;
        }
        int numero = numeros[index];
        int numero2 = numeros[index2];
        return 0;
    }

    static Object[] maiorMenor() {
        int maior = -999999;
        int menor = 999999;
        Object[] object = new Object[2];
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];

            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            object[0] = maior;
            object[1] = menor;

        }
        return object;
    }

    static void ordemCrescente(int[] vetor) {
        int temp = 0;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        System.out.print("\n[");
        for (int k = 0; k < vetor.length; k++) {
            System.out.print(vetor[k] + " ");
        }
        System.out.println("]");

    }

    static void ordemDecrescente(int[] vetor) {
        int temp = 0;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        System.out.print("\n[");
        for (int k = 0; k < vetor.length; k++) {
            System.out.print(vetor[k] + " ");
        }
        System.out.println("]");

    }

}
