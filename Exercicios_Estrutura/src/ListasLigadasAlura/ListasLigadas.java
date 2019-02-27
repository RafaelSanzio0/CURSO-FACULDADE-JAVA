package ListasLigadasAlura;

public class ListasLigadas {

    private Celula primeiro = null;
    private Celula ultimo = null;
    private int totalElementos = 0;

    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(elemento, primeiro);
        this.primeiro = nova;

        if (totalElementos == 0) {
            this.primeiro = this.ultimo;
        }

        this.totalElementos++;

    }

    public void adiciona(int posicao, Object elemento) {
    }

    public Object pega(int posicao) {
        return null;
    }

    public void remove(int posicao) {
    }

    public int tamanho() {
        return 0;
    }

    public boolean contem(Object o) {
        return false;
    }

    @Override
    public String toString() {
        if (this.totalElementos == 0) {
            return "[]";
        }
        Celula atual = primeiro;

        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalElementos; i++) {
            builder.append(atual.getElemento()); //aqui estou concatenando com um metodo append da clase stringbuilder
            builder.append(",");

            atual = atual.getProximo();

        }
        builder.append("]");

        return builder.toString();

    }
}
