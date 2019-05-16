
package AVL;

import java.util.*;


public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArvoreAvl raiz = null;
        ArvoreAvl aux;
        int op, achou, numero;
        
        
        do{
            System.out.println("\nMENU DE OPÇOES\n");
            System.out.println("1- Inserir na árvore");
            System.out.println("2- Consultar um nó da arvore");
            System.out.println("3- Consultar toda a árvore em ordem");
            System.out.println("4- Consultar toda a árvore em pré-ordem");
            System.out.println("5- Consultar toda a árvore em pos-ordem");
            System.out.println("6- Excluir um nó da árvore");
            System.out.println("7- Esvaziar a árvore");
            System.out.println("8- Sair");
            System.out.println("Digite a sua opção: ");
            
            op = scanner.nextInt();
            
            if(op < 1 || op > 8){
                System.out.println("opção inválida!!");
            }
            
            if (op == 1){
                System.out.println("Digite o número a ser inserido  na arvore");
                numero = scanner.nextInt();
                raiz = inserir(raiz,numero);
                System.out.println("Numero inserido na árvore!!");
            }
            
            if(op == 2){
                
                if(raiz == null)
                {
                    System.out.println("Arvore vazia");
                    
                }
                else
                {
                     System.out.println("Digite o elemento a ser consultado");
                     numero = scanner.nextInt();
                     achou = 0;
                     achou = consultar(raiz,numero,achou);
                }
                
             
            } if (op == 3){
                
                if(raiz == 3){
                    System.out.println("Arvore Vazia!!");
                }
                else{
            }
            }
        }   
    }
        
        
        
}