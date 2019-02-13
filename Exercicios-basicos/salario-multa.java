public class Salario{
    
    static public void main (String [] args){
        
       double salario,conta_1,conta_2,restante;
       
       salario = 2000.0;
       conta_1 = 400.0;
       conta_2 = 200.0;
       restante = salario - ((conta_1*0.02) + conta_1 + (conta_2*0.02) + conta_2);
       
       System.out.println("O restante do salario de joao foi " + restante);
       

        
    }
    
}