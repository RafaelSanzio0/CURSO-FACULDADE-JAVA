/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasLigadasAlura;

/**
 *
 * @author rafae
 */
public class testaLL {
    
    public static void main(String[] args) {
        
        ListasLigadas lista = new ListasLigadas();
        
        System.out.println(lista);
        
        lista.adicionaNoComeco("rafael");
        System.out.println(lista);
        
        lista.adicionaNoComeco("jane");
        System.out.println(lista);
        
        lista.adicionaNoComeco("carlos");
        lista.contem("carlos");
        System.out.println(lista);
        
        
        
    }
    
}
