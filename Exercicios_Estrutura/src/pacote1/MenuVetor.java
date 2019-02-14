package pacote1;

import java.util.Scanner;
import javax.swing.SpringLayout;

class MenuVetor {

    static int[] numeros;

    /**
     * @param args the command line arguments
     */
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
            int opc = scn.nextInt();
            if (opc == 0) {
                break;
            } else if (opc == 1) {
                imprimir();
                scn.nextLine();
            } else if (opc == 2) {
                //= precisa pedir os dados: posicao no vetor (indice) e valor do elemento.
                System.out.print("Indice do novo elemento: ");
                int idx = scn.nextInt();
                System.out.print("Valor do novo elemento: ");
                int val = scn.nextInt();
                System.out.println(incluir(idx, val));
            } else if (opc == 3) {
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
            } else if (opc == 4) {
                System.out.println("Digite a posição do elemento1");
                int elemento1 = scn.nextInt();
                System.out.println("Digite a posição do elemento2");
                int elemento2 = scn.nextInt();
                trocaElementos(elemento1, elemento2);
            } else if (opc == 5) {
                MaiorAndMenor();
            } else if (opc == 6) {
            } else if (opc == 7) {
            } else if (opc == 8) {
            }
            System.out.println("\n\nPressione ENTER para prosseguir.");
            scn2.nextLine();
        }
        System.out.println("-------------------------------------------------");
        System.out.println("\n\nObrigado e ate´ a proxima vez.");
    }

    /**
     * Metodo para imprimir o vetor.
     */
    static void imprimir() {
        System.out.print("\n[ ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("]");
    }

    /**
     * Metodo para incluir um elemento no vetor. A posicao tem que estar vaga
     * (valor do elemento igual a zero). O novo elemento tem que ser maior que
     * zero.
     *
     * @param indice - indice do elemento que sera´ incluido.
     * @param valor - valor do elemento a ser incluido.
     * @return
     */
    static String incluir(int indice, int valor) {
        // verifica se o valor e´ maior que zero
        if (valor < 0) {
            return "ERRO: o valor tem que ser maior que zero.";
        }
        // verifica se o indice e´ valido
        if (indice < 0 || indice > numeros.length - 1) {
            return "ERRO: o indice esta´ fora dos limites do vetor.";
        }
        // verifica se a posicao ja´ esta´ ocupada.
        if (numeros[indice] > 0) {
            return "ERRO: posicao ocupada.";
        }
        // passou por todas as verificacoes: inserir
        numeros[indice] = valor;
        return "Inclusao bem sucedida.";
    }

    /**
     * Excluir um elemento do vetor. Atribui zero `a posicao e retorna o
     * elemento (valor).
     *
     * @param indice - indice do elemento que sera´ excluido.
     * @return - valor do elemento excluido. Se retornar zero e´ porque a
     * posicao estava vazia; se retornar -1 e´ porque o indice e´ invalido.
     */
    static int excluir(int indice) {
        // verifica se o indice e´ valido
        if (indice < 0 || indice > numeros.length - 1) {
            return -1;
        }
        int numero = numeros[indice];
        numeros[indice] = 0;
        return numero;
    }

    static void trocaElementos(int indice1, int indice2) {
        for (int i = 0; i < numeros.length - 1; i++) {

            int elemento1 = numeros[indice2];
            int elemento2 = numeros[indice1];
            int troca = elemento1;

        }

    }

    static String MaiorAndMenor() {

        for (int i = 0; i < numeros.length - 1; i++) {

            int maior = numeros[i];
            int menor = numeros[i];

            if (maior > numeros[i]) {
                System.out.println("o maior numero do array é " + maior);
            }
            if (menor < numeros[i]) {
                System.out.println("o menor numero do array é " + menor);

            }

        }
        return "elementos encontrados";

    }

}
