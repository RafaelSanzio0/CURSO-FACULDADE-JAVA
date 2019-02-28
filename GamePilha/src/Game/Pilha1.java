/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.Arrays;

/**
 *
 * @author 31787622
 */
public class Pilha1 {

    private final int tamanhoMaximo = 10;
    private final int[] pilhaDeInteiros;
    private int topo = -1;

    public Pilha1() {
        this.pilhaDeInteiros = new int[tamanhoMaximo];
    }

    public void push(int n) {
        topo++;
        pilhaDeInteiros[topo] = n;
    }
    
    public void pop(){
       pilhaDeInteiros[topo] = topo--;
    }
      
    @Override
    public String toString(){
        return Arrays.toString(pilhaDeInteiros);
    }

 
    public int getElemento() {
        int a = 0;
        return pilhaDeInteiros[a];
        
    }
}
