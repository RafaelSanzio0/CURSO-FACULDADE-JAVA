
import java.util.Arrays;
import java.util.Scanner;

public class main {

    //* nao criei a opção 8 pois os metodos de ordenação ja cria outro vetor com os mesmos dados e retorna o vetor ordenado
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor que voce deseja utilizar (maior que 0) -> ");
        int tam = scn.nextInt();
        

        TadVetor tv = new TadVetor(tam);

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
                tv.imprimir();
                scn.nextLine();

            } else if (op == 2) {
                System.out.println("Digite a posição em que deseja inserir o novo valor");
                int index = scn.nextInt();
                System.out.println("Digite o valor");
                int valor = scn.nextInt();
                System.out.println(tv.adicionar(index, valor));
                scn.nextLine();

            } else if (op == 3) {
                System.out.print("Indice do elemento a ser removido: ");
                int idx = scn.nextInt();
                int val = tv.excluir(idx);
                if (val == 0) {
                    System.out.println("Nao ha´ elemento na posicao " + idx);
                } else if (val == -1) {
                    System.out.println("ERRO: o indice esta´ fora dos limites do vetor.");
                } else {
                    System.out.println("Valor excluido da posicao " + idx + ": " + val);
                }

            } else if (op == 4) {
                System.out.println("Digite os indexs de troca");
                int index = scn.nextInt();
                int index2 = scn.nextInt();
                tv.trocar(index, index2);

            } else if (op == 5) {
                tv.maiorAndMenor();
                scn.nextLine();

            } else if (op == 6) {
                tv.ordemCrescente();

            } else if (op == 7) {
                tv.ordemDecrescente();
            }

            System.out.println("\n\nPressione ENTER para prosseguir.");
            scn2.nextLine();

        }

        System.out.println(
                "-------------------------------------------------");
        System.out.println(
                "\n\nObrigado e até a proxima vez.");

    }
}
