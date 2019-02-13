package pacote1;

import java.util.*;

public class Exercicio2 {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            int out = 0;
            for (int j = 0; j < i; j++) {
                System.out.print(out);
                out += 1;

            }
            System.out.println();

        }
    }
}

//      List<Integer> itens = Arrays.asList(22,25,66,77,99);
//       
//       for(Integer item : itens){
//           if(item > 60){
//               System.out.println("Os numeros maiores que 60 na lista é "+item);
//           }
//       }
//            
//    }
//        int linhas = 1, colunas = 10;
//        int matriz[][] = new int[linhas][colunas];
//        for (int[] vetor : matriz) {
//            for (int elemento : vetor) {
//                System.out.print("*");
//
//            }
//
//        }
//                    System.out.println();