
import java.util.Scanner;

public class media {
    
    public static void main(String [] args){
        
        double nota_1, nota_2, nota_3,nota_exame,
        media = 0,
        media_exame = 0;
        
        Scanner entrada1 = new Scanner (System.in);
        System.out.println("Digite a primeira nota: ");
        nota_1 = entrada1.nextDouble();
        
        Scanner entrada2 = new Scanner (System.in);
        System.out.println("Digite a segunda nota: ");
        nota_2 = entrada2.nextDouble();
        
        Scanner entrada3 = new Scanner (System.in);
        System.out.println("Digite a terceira nota: ");
        nota_3 = entrada3.nextDouble();
        
        media = (nota_1+nota_2+nota_3)/3;
    
        if (media >= 0 && media < 3){
            System.out.printf("REPROVADO, sua media foi %.2f " , media);
            
        }
        
      if (media >= 3 && media < 7){
            System.out.printf("EXAME, sua media foi %.2f" , media);
            System.out.println();
            System.out.println("Aluno, sua média agora precisar ser maior que 6.0");
            
            Scanner entradaExame = new Scanner(System.in);
            System.out.println("Digite a nota do exame: ");
            nota_exame = entradaExame.nextDouble();
            
            media_exame = (media+nota_exame)/2;
            
            if (media_exame >= 6){
                  System.out.printf("APROVADO, sua media foi %.2f", media_exame);

            }else{
                System.out.printf("REPROVADO, sua media foi %.2f" , media_exame);
            }
  
        }
            
      if (media >= 7 && media <= 10){
                    System.out.printf("APROVADO, sua media foi %.2f" , media);

        }
       
    }
    
}
