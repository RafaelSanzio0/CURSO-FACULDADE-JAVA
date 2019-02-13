//crie um vetor com 20 elementos e conte quantos sao pares

public class arrayPar {
    
    public static void main(String[]args){
        
        int [] lista = new int [20];
        int pares = 0;
        
        for (int elemento = 0; elemento < lista.length; elemento ++){
            
            lista[elemento] =+ elemento; // aqui eu incremento cada elemento dentro da lista

            if (elemento % 2 == 0){
                pares ++;
                System.out.println("os pares " + lista[elemento]);

            } 

        }
        
        System.out.println("Quantidade de pares é " + pares);

    }
}
