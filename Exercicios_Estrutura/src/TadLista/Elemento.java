package TadLista;

public class Elemento {

    //==========================================================================
    //                              CONSTRUTORES
    //==========================================================================
    /**
     * Inicializa o no' com o valor enviado pelo metodo chamador.
     *
     * @param n
     */
    public Elemento(int n) {
        this.numero = n;
    }

    public Elemento(Elemento proximo, Elemento elemento) {
        this.proximo = proximo;
        this.elemento = elemento;

    }
    //--------------------------------------------------------------------------
    //
    //
    //
    //
    //==========================================================================
    //                                ATRIBUTOS
    //==========================================================================
    /**
     * Valor que o no' carrega.
     */
    private int numero;
    /**
     * Ponteiro para o proximo elemento da lista.
     */
    private Elemento proximo;
    private Elemento anterior;

    private Object elemento;

    //--------------------------------------------------------------------------
    //
    //
    //
    //
    //==========================================================================
    //                           METODOS GET E SET
    //==========================================================================
    public int getNumero() {
        return numero;
    }

    public void setNumero(int n) {
        this.numero = n;
    }

    public Elemento getProximo() {
        return this.proximo;
    }

    public void setProximo(Elemento prox) {
        this.proximo = prox;
    }
    public Elemento getAnterior() {
        return anterior;
    }

    public void setAnterior(Elemento anterior) {
        this.anterior = anterior;
    }
    //--------------------------------------------------------------------------

}
