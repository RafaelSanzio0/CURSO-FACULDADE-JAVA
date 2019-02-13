
//codigo que sera reescrito nas classes cliente, gerente e adm como uma "composição"

public class AutenticacaoUtil {
    
    private int senha;
    
    public void setSenha(int senha){
        this.senha = senha;
    }
    
    public  boolean autenticaSenha(int senha){
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }
    }
    
}
