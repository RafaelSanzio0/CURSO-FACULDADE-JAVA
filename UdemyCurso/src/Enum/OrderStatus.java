package Enum;

public enum OrderStatus {

    PENDING_PAYMENT(1),
    PROCESSING(2),
    SHIPPED(3),
    DELIVERED(4);

    private int valor;

    OrderStatus(int valor){this.valor = valor;}
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

}

