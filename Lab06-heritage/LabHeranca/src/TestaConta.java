
public class TestaConta {
    public static void main(String[]args){
        
        ContaCorrente cc = new ContaCorrente();
        cc.agencia = 111;
        cc.conta = 1111;
        cc.nomeCliente = "Joao da silva";
        cc.saldo = 200;
        cc.exibiDados();
        cc.deposita(1000);
        System.out.println("Saldo atual da conta corrente: "+cc.saldo);
   
        System.out.println("---------------------------");
        
        ContaPoupanca cp = new ContaPoupanca();
        cp.agencia = 222;
        cp.conta = 2222;
        cp.nomeCliente = "Maria souza";
        cp.saldo = 3000;
        cp.exibiDados();
        cp.saca(1000);
        System.out.println("Saldo atual da conta poupanca: "+cp.saldo);
    }
    
    
}
