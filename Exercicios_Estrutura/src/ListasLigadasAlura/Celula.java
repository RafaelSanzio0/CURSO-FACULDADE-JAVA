package ListasLigadasAlura;

public class Celula {

    private Object elemento;
    private Celula anterior;
    private Celula proximo;

    public Celula(Celula proximo, Object elemento) {
        this.proximo = proximo;
        this.elemento = elemento;

    }

    public Celula(Object elemento) {
        this(null, elemento);
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Object getElemento() {
        return elemento;
    }

}
