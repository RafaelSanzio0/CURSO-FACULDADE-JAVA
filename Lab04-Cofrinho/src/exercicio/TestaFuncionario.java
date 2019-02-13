
public class TestaFuncionario {
    
    public static void main(String[]args){
        
        Funcionarios func = new Funcionarios("rafael",1000);
        
        func.departamentoFuncionario =  "Programador";
        func.rgFuncionario = "38.540.348-3";
        
        func.recebeAumento(10);
        func.calculaGanhoAnual();
        func.mostraDados();
        System.out.println("Ganho anual " + func.calculaGanhoAnual());

        // GAMBIARRA
        System.out.println("");
        
        // outro funcionario
        Funcionarios func2 = new Funcionarios("Vinicius",1100);
        
        func2.departamentoFuncionario = "Desenvolvedor";
        func2.rgFuncionario = "123.456.789-0";
        
        func2.recebeAumento(10);
        func2.calculaGanhoAnual();
        func2.mostraDados();
        System.out.println("Ganho Anual " + func2.calculaGanhoAnual());
           
    }
    
}
