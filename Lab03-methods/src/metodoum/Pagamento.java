

import java.util.Scanner;

public class Pagamento {
    
     public static double valorPagamento(double valorCompra, double diasAtraso){
        if (diasAtraso == 0){
            
           return valorCompra;
            
        }
        if (diasAtraso > 1 && diasAtraso <= 5){
            
           return valorCompra = valorCompra * 1.05;
            
        }
        if (diasAtraso > 5){
            
            return valorCompra = valorCompra * 1.10;
        }
         return 0;
    }
    
     public static void main(String[]args){
         
         Scanner entrada = new Scanner(System.in);
         
         double compra,atraso,total = 0;
         
    
         System.out.println("Digite o valor da compra: ");
         compra = entrada.nextDouble();
         
         System.out.println("Digite a quantidade de dias atrasado: ");
         atraso = entrada.nextDouble();
         
         total = valorPagamento(compra,atraso);
         
         System.out.println("Valor total da compra é: " + total );
         
     }
    
   
}

    
   
