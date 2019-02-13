public class Troca{
    
    static public void main (String [] args){
        
        int a,b,troca;
        
        a = 10;
        b = 20;
        
        System.out.println("Aqui a variavel A esta valendo " + a + " e a variavel B esta valendo " + b);
        
        troca = a;
        a = b;
        b = troca;
        
        System.out.println("Agora a variavel A vale " + a + " e a variavel B vale " + b);

        
    }
    
}