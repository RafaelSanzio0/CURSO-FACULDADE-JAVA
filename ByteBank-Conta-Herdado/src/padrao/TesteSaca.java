package padrao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafae
 */
public class TesteSaca {
    
    public static void main(String[] args) {
        
        Conta c = new ContaCorrente(0454,123243);
        
        try{
            
        c.deposita(500);
        c.saca(5050);
        
        } catch(SaldoInsuficienteException ex){
            ex.printStackTrace();
        }
        
        System.out.println(c.getSaldo());
                
        
    }
    
}
