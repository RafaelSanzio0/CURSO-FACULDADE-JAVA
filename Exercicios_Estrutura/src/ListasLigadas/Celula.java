/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasLigadas;

/**
 *
 * @author rafae
 */
public class Celula {
    
    private Object elemento;
    private Celula proximo;
    
    public Celula(Object elemento, Celula proximo){
        this.elemento = elemento;
        this.proximo = proximo;
        
    }
    
    public Celula getProximo(){
        return proximo;
    }
    
    public void setElemento(Object elemento){
        this.elemento = elemento;
    }
    
    public Object getElemento(){
        return elemento;
    }
    
}
