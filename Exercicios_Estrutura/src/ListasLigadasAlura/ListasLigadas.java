package ListasLigadasAlura;

public class ListasLigadas {

    private Celula primeiro = null;
    private Celula ultimo = null;
    private int totalElementos = 0;

//    public void adicionaNoComeco(Object elemento) {      metodo utilziado em simplismente ligada
//        Celula nova = new Celula(elemento, primeiro);
//        this.primeiro = nova;
//
//        if (totalElementos == 0) {
//            this.ultimo = this.primeiro;
//        }
//
//        this.totalElementos++;
//
//    }
    public void adicionaNoComeco(Object elemento) { // metodo utilizado em duplamente ligada

        if (this.totalElementos == 0) { //se for 0 entao minha primeira celula é criada e o proximo é ela e o anterior tbm é ela
            Celula nova = new Celula(elemento);
            this.primeiro = nova;
            this.ultimo = nova;

        } else {
            Celula nova = new Celula(this.primeiro, elemento);
            this.primeiro.setAnterior(nova);
            this.primeiro = nova;

        }
        this.totalElementos++;

    }

//    public void adicionaNoFim(Object elemento) {    metodo utilziado em simplismente ligada
//
//        if (totalElementos == 0) {
//            adicionaNoComeco(elemento);
//        }
//        Celula nova = new Celula(elemento, primeiro);
//        this.ultimo.setProximo(nova);
//        this.ultimo = nova;
//
//        this.totalElementos++;
//
//    }
    public void adicionaNoFim(Object elemento) {   //metodo utilziado em duplamente ligada

        if (totalElementos == 0) {
            adicionaNoComeco(elemento);
        }
        Celula nova = new Celula(elemento);
        this.ultimo.setProximo(nova);
        nova.setAnterior(this.ultimo);
        this.ultimo = nova;
        this.totalElementos++;

    }

//    public void adicionaNoMeio(int posicao, Object elemento) {  metodo utilziado em simplismente ligada
//
//        if (posicao == 0) {
//            adicionaNoComeco(elemento);
//        } else if (posicao == this.totalElementos) {
//            adicionaNoFim(elemento);
//        } else {
//            Celula anterior = pegaCelula(posicao - 1); // passando o anterior referente a  onde o usario quer inserir sue novo elemento
//            Celula nova = new Celula(elemento, anterior.getProximo());
//            anterior.setProximo(nova);
//            this.totalElementos++;
//        }
//
//    }
    public void adicionaNoMeio(int posicao, Object elemento) { //metodo utilziado em duplamente ligada

        if (posicao == 0) {
            adicionaNoComeco(elemento);
        } else if (posicao == this.totalElementos) {
            adicionaNoFim(elemento);
        } else {
            Celula anterior = pegaCelula(posicao - 1); // passando o anterior referente a  onde o usario quer inserir sue novo elemento
            Celula proximo = anterior.getProximo();
            Celula nova = new Celula(anterior.getProximo(), elemento);
            nova.setAnterior(anterior);
            anterior.setProximo(nova);
            proximo.setAnterior(nova);
            this.totalElementos++;
        }

    }

    public boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalElementos;
    }

    public Celula pegaCelula(int posicao) {

        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posicao nao existe");
        }

        Celula atual = primeiro;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public Object pega(int posicao) {
        return pegaCelula(posicao).getElemento();
    }

    public void removeComeco() {
        if (this.totalElementos == 0) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        this.primeiro = this.primeiro.getProximo();
        this.totalElementos--;

        if (this.totalElementos == 0) {
            this.ultimo = null;
        }
    }

    public void removeFim() {
        if (this.totalElementos == 1) {
            this.removeComeco();
        } else {
            Celula penultima = this.ultimo.getAnterior();
            penultima.setProximo(null);
            this.ultimo = penultima;
            this.totalElementos--;
        }
    }

    public void removeNoMeio(int posicao) {
        if (posicao == 0) {
            removeComeco();
        } else if (posicao == totalElementos - 1) {
            removeFim();
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula atual = anterior.getProximo();
            Celula proximo = atual.getProximo();

            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);

            this.totalElementos--;
        }
    }

    public int tamanho() {
        return totalElementos;
    }

    public boolean contem(Object o) {

        Celula atual = this.primeiro;

        while (atual != null) { //maneira d percorrer a lista com while
            if (atual.getElemento().equals(o)) {
                return true;
            }
            atual = atual.getProximo(); // vai pegar cada item da lista

        }
        return false;

    }

    @Override
    public String toString() {
        if (this.totalElementos == 0) {
            return "[]";
        }
        Celula atual = primeiro; // começamos a imprimir do primeiro elemento

        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalElementos; i++) {
            builder.append(atual.getElemento()); //aqui estou concatenando com um metodo append da clase stringbuilder
            builder.append(",");

            atual = atual.getProximo(); // vou pegando sempre o prox elemento e imprimindo 

        }
        builder.append("]");

        return builder.toString();

    }
}

/* VANTAGENS LISTAS LIGADAS
A vantagem da lista ligada é que como a relação entre duas células é feita por referências, é fácil inserir um elemento no meio da lista (afinal, basta acertar das células a
esquerda e a direita).
Inserir no começo e no fim também leva tempo constante, afinal geralmente a estrutura possui referências para o primeiro e último elemento.
 */

 /* DESVANTAGENS LISTAS LIGADAS
Recuperar um elemento em uma posição aleatória pode levar tempo linear. Afinal, diferente do vetor, onde pegar um elemento qualquer custa uma simples operação de array,
em uma lista ligada, precisamos navegar pelas referências até encontrar o elemento desejado.
 */

 /* DIFERENÇA ENTRE LISTA LIGADA E DUPLAMENTE LIGADA
Na lista ligada simples a célula só aponta para a próxima célula da lista. Já na lista duplamente ligada, a célula tem referências para a anterior e para a próxima. 
A grande vantagem é que muitas operações necessitam também da célular anterior, e tudo fica mais fácil com a referência armazenada em cada célula.
 */

 /* Como é o tempo de remoção de uma lista duplamente ligada?
A  remoção em uma lista ligada pode ser ou linear ou constante.
Se você tiver a referência em mãos da célula que será deletada, então o tempo é constante. Afinal, já que você tem anterior e proximo nas mãos, basta acertar as referências.
Se você precisar procurar pelo elemento primeiro, então o tempo será linear, afinal passará por todas as células no pior caso.
 */

 /* Qual o tempo de execução da inserção no início e no fim de uma lista duplamente ligada?
Em ambos o tempo é constante. Assim como na lista ligada simples, basta acertar as referências, já que a estrutura armazena o primeiro e ultimo nós.
 */
