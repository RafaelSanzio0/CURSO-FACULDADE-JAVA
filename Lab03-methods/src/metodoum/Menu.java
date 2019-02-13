
import java.util.Scanner;

public class Menu {
    
    public static double media(double numeroUm, double numeroDois){
        return (numeroUm + numeroDois)/2;
    }
    
    public static double produto(double numeroUm, double numeroDois){
        return numeroUm * numeroDois;
    }
    
    public static double diferença(double numeroUm, double numeroDois){
        if (numeroUm > numeroDois){
            
            return numeroUm - numeroDois;
         
        }else{
            
            return numeroDois - numeroUm;
        }
    }
        
      
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double numero1,numero2,saidaMedia = 0, saidaProduto= 0, saidaDiferença = 0;
        int opçao = 0;
       
        
        while(opçao!= 4){
            
            System.out.println("Digite a sua opçao: ");
            opçao = entrada.nextInt();
            
            if (opçao == 1){
                
                System.out.println("Digite o primeiro numero: ");
                numero1 = entrada.nextDouble();

                System.out.println("Digite o segundo numero: ");
                numero2 = entrada.nextDouble();
                
                saidaMedia = media(numero1,numero2);
                System.out.println("a media é " + saidaMedia);
               
                
            }
            
            if (opçao == 2){
                
                System.out.println("Digite o primeiro numero: ");
                numero1 = entrada.nextDouble();

                System.out.println("Digite o segundo numero: ");
                numero2 = entrada.nextDouble();
                
                saidaProduto = produto(numero1,numero2);
                System.out.println("o produto é " + saidaProduto);
            
            
            }
            
            if (opçao == 3){
                
                System.out.println("Digite o primeiro numero: ");
                numero1 = entrada.nextDouble();

                System.out.println("Digite o segundo numero: ");
                numero2 = entrada.nextDouble();
                
                saidaDiferença = diferença(numero1,numero2);
                System.out.println("a diferença é " + saidaDiferença);

        
            }
            
            if (opçao == 4){
                System.out.println("Voce Saiu!");
                
               
            }
        }
    }
}
