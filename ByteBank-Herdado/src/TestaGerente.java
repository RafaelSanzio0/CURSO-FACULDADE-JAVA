
public class TestaGerente {
    
    public static void main(String[]args){
        
        Gerente g1 = new Gerente();
       
        g1.setNome("Rafael");
        g1.setSenha(555); // definindo senha padrao
        
        g1.setSalario(5000.0);
        System.out.println(g1.getSalario());
        
        double bonificaSalario = g1.bonificação();
        System.out.println(bonificaSalario);

        
        
        
        
       
        
        
        
    
        
    }
    
}
