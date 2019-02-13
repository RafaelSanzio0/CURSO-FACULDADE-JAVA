package arrays;

import padrao.*;

public class ArrayGuardador {

    private Object[] referencias; // cria um atributo do tipo conta(array)
    private int posicaoLivre = 0;

    public ArrayGuardador() {
        this.referencias = new Object[10]; //construtor responsavel por armazenar ate 10 arrays
    }
    
    public void adicionar(Object referencia){
        
        this.referencias[this.posicaoLivre] = referencia;
        this.posicaoLivre++;
              
    }
    
    public int getTotal(){
        return this.posicaoLivre;
        
    }
    
    public Object getContas(int index){
        return this.referencias[index];
        
    }

}
