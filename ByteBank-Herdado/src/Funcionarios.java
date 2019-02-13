
public abstract class Funcionarios {
    //atributos
    private String nome;
    private String cpf;
    private double salario;
    
    //metodos
    public double bonificação (){
      
        return this.salario * 0.05;
    }
    
    //metodos GET e SET
    public String getNome(){
            return nome;
    }

    public void setNome(String nome){
            this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;   
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
       
}
