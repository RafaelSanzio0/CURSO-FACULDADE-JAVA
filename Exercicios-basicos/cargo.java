
import java.util.Scanner;

public class cargo {
    
    public static void main(String[]args){
        
        int codigo;
        
        double salario,
        salario_aumento=0;
        
        Scanner entradaCodigo = new Scanner (System.in);
        System.out.println("Digite o codigo: ");
        codigo = entradaCodigo.nextInt();
        
        Scanner entradaSalario = new Scanner (System.in);
        System.out.println("Digite o salario: ");
        salario = entradaSalario.nextDouble();
        
        switch(codigo){
            
            case 1:
                System.out.println("Cargo: Escrituário");
                System.out.println("Percentual de aumento será em 50%");
                salario_aumento = salario * 1.5;
                System.out.printf("Salario antigo = %.2f " , salario);
                System.out.println();
                System.out.printf("Salario atual = %.2f", salario_aumento);
                break;
                
            case 2:
                System.out.println("Cargo: Secretário");
                System.out.println("Percentual de aumento será em 35%");
                salario_aumento = salario * 1.35;
                System.out.printf("Salario antigo = %.2f " , salario);
                System.out.println();
                System.out.printf("Salario atual = %.2f", salario_aumento);
                break;
            
            case 3:
                System.out.println("Cargo: Caixa");
                System.out.println("Percentual de aumento será em 20%");
                salario_aumento = salario * 1.2;
                System.out.printf("Salario antigo = %.2f " , salario);
                System.out.println();
                System.out.printf("Salario atual = %.2f", salario_aumento);
                break;

            
            case 4:
                System.out.println("Cargo: Gerente");
                System.out.println("Percentual de aumento será em 10%");
                salario_aumento = salario * 1.1;
                System.out.printf("Salario antigo = %.2f " , salario);
                System.out.println();
                System.out.printf("Salario atual = %.2f", salario_aumento);
                break;

            
                
            case 5:
                System.out.println("Cargo: Escrituário");
                System.out.println("Sem aumento");
                System.out.printf("Salario atual = %.2f " , salario);
                break;

                
                



                
                
                
                
                
                
            
          
        }
    }
    
}
