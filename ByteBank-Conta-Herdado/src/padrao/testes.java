package padrao;

//CONCEITO DE ORIENTAÇAO A OBJETO

public class testes {
    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        Conta conta1 = new ContaCorrente(0454,100293);
        
        cliente1.setNome("rafael");
        cliente1.setCpf("478393188-78");
        cliente1.setProfissao("programador JAVA");    
        
        conta1.deposita(500);
        
        conta1.titular = cliente1; // associando as duas classes conta e cliente
        
        System.out.println("Dono da conta: "+cliente1.getNome());
        System.out.println(conta1.getSaldo());
        
        
        
        
      
       
        
        
        
        
        
       
    }
    
}
