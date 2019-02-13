//GERENTE HERDA DA CLASSE FUNCIONARIO SEUS ATRIBUTOS

public class Gerente extends Funcionarios implements Autenticavel {
    
    private AutenticacaoUtil autenticador;
    
   @Override
   public double bonificação (){
        System.out.println("metodo GERENTE");
        return super.bonificação() + super.getSalario();
    }
   
   @Override
    public void setSenha(int senha) {
       this.autenticador.setSenha(senha);
    }
    
    @Override
    public  boolean autenticaSenha(int senha){
       return this.autenticador.autenticaSenha(senha);
        
        
    }
}