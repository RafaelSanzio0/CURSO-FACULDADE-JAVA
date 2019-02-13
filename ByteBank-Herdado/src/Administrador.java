
public class Administrador extends Funcionarios implements Autenticavel {
    
    private AutenticacaoUtil autenticador;
    
    
    public Administrador(){
        this.autenticador = new AutenticacaoUtil();
    }
    
    @Override
    public double bonificação(){
        return 50;
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
    
