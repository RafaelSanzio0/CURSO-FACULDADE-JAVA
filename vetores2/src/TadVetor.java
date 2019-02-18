
public class TadVetor {

    int numeros[];

    public TadVetor() {

    }

    public TadVetor(int tamanho) {
        this.numeros = new int[tamanho];

    }

    public void imprimir() {
        System.out.print("\n[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("]");
    }

    public String adicionar(int index, int valor) {
        if (valor < 0) {
            return "valor do elemento precisa ser maior que 0";
        }
        if (index < 0 || index > numeros.length - 1) {
            return "index fora dos padroes do array";
        }
        if (numeros[index] > 0) {
            return "posição ocupada";
        }
        numeros[index] = valor;
        return "valor inserido";

    }

    public int excluir(int index) {
        if (index < 0 || index > numeros.length - 1) {
            return -1;
        }
        int numero = numeros[index];
        numeros[index] = 0;
        return numero;
    }

    public void trocar(int index, int index2) {
        if (index < 0 || index > numeros.length - 1) {
            System.out.println("troca efetuada");

        }
        if (index2 < 0 || index2 > numeros.length - 1) {
            System.out.println("troca efetuada");

        }
        int temp;
        int numero1 = 0;
        int numero2 = 0;
        for (int i = 0; i < numeros.length; i++) {
            numero1 = numeros[index];
            numero2 = numeros[index2];
        }

        temp = numero1;
        numero1 = numero2;
        numero2 = temp;

        System.out.print("\n[");
        for (int k = 0; k < numeros.length; k++) {
            System.out.print(numeros[k] + " ");
        }
        System.out.println("]");

        System.out.printf("Posicao de numero %d com valor %d e Posicao de numero %d com valor %d", index, numero1, index2, numero2);
    }

//    static Object[] maiorMenor() {
//        int maior = -999999;
//        int menor = 999999;
//        Object[] object = new Object[2];
//        for (int i = 0; i < numeros.length; i++) {
//
//            if (numeros[i] > maior) {
//                maior = numeros[i];
//
//            }
//            if (numeros[i] < menor) {
//                menor = numeros[i];
//            }
//
//            object[0] = maior;
//            object[1] = menor;
//
//        }
//        return object;
//    }
    public void maiorAndMenor() {
        int maior = -999999;
        int menor = 999999;
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];

            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            System.out.println(maior);
            System.out.println(menor);
        }
    }

    public void ordemCrescente() {
        int temp;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        System.out.print("\n[");
        for (int k = 0; k < numeros.length; k++) {
            System.out.print(numeros[k] + " ");
        }
        System.out.println("]");

    }

    public void ordemDecrescente() {
        int temp;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        System.out.print("\n[");
        for (int k = 0; k < numeros.length; k++) {
            System.out.print(numeros[k] + " ");
        }
        System.out.println("]");

    }

}
