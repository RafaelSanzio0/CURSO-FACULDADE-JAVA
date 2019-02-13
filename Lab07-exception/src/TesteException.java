public class TesteException {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo2");
        
        int vetor[] = new int[10];
        
        try{
            for(int i = 0; i <= 15; i++) {
            vetor[i] = i;
            System.out.println(i);
        }
            
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Tentou acessar indice inexistente");
        }
        System.out.println("Fim do metodo2");
    }
}