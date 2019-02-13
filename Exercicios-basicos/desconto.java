public class Desconto{
    
    static public void main (String [] args){
        
        double produto,novoPreco;
        
        produto = 1000.0;
        novoPreco = produto - (produto * 0.075);
        
        System.out.println("Produto custa " + produto + " com o desconto de 7.5% o seu novo valor eh " + novoPreco);
        
        
    }
    
}