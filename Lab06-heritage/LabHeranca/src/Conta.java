
public class Conta {
    
    protected int agencia;
    protected int conta;
    protected String nomeCliente;
    protected double saldo;
    
    public Conta(){
        
        this.agencia = agencia;
        this.conta = conta;
        this.nomeCliente = nomeCliente;
        this.saldo = 3000;
        
    }
    
    public void deposita(double valor){
        this.saldo = saldo + valor;
    }
    
    public void saca(double valor){
        this.saldo = saldo - valor;
    }
    
    public void exibiDados(){
        System.out.println("AGÊNCIA: "+agencia);
        System.out.println("CONTA: "+conta);
        System.out.println("NOME: "+nomeCliente);
        System.out.println("SALDO: "+saldo);
    }
    
    
    
}
