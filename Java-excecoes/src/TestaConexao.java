/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafae
 */
public class TestaConexao {
    
    
    public static void main(String[] args) {
        
    Conexao con = null;
    
    try {
        con = new Conexao();
        con.leDados();
        
    } catch(IllegalStateException ex) {
        
        System.out.println("Deu erro na conexao");
        
    } finally {
        con.fecha();
    }
}
    
}
