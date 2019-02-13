package padrao;


public class TestaConta {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(0466,10011-2);
        cc.deposita(500);
        System.out.println("saldo atual cc " + cc.getSaldo());
        
        ContaPoupanca cp = new ContaPoupanca(2342,45673-2);
        cp.deposita(250);
        System.out.println("Saldo atual cp " + cp.getSaldo());
        
        cc.transfere(100, cp);
        System.out.println("cp depois da trasnferencia " + cp.getSaldo());
        
        cc.saca(200);
        System.out.println("saldo atual cc " + cc.getSaldo());

        
    }
    
}
