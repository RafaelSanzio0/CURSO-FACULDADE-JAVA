
public class Funcionarios {
    
        //atributos
        String nomeFuncionario;
        String departamentoFuncionario;
        double salarioFuncionario;
        String rgFuncionario;
        
        //construtor
        public Funcionarios(String nomeFuncionario ,double salarioFuncionario){
            this.nomeFuncionario = nomeFuncionario;
            this.salarioFuncionario = salarioFuncionario;
            
        }
        
        //metodos
        public void recebeAumento(double valor){
            this.salarioFuncionario = salarioFuncionario + (salarioFuncionario * (valor/100));
        }
        
        public double calculaGanhoAnual(){
            return salarioFuncionario * 12;
            
        }
        
        public void mostraDados(){
           System.out.println("nome do funcionario " + this.nomeFuncionario);
           System.out.println("Departamento do funcionario " + this.departamentoFuncionario);
           System.out.println("RG do funcionario " + this.rgFuncionario);
           System.out.println("Salario do funcionario " + salarioFuncionario);
           
        }
}
         
  

