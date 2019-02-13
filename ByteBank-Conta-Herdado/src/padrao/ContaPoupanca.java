package padrao;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero); //super() faz a chamada para o construtor da classe MAE, ja que o mesmo nao é herdado

    }

    @Override
    public void saca(double valor) {

        double valorSacar = valor + 0.2;
        super.saca(valorSacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo = super.saldo + valor;

    }

    @Override
    public String toString() {
        return ("ContaPoupanca, Agencia " + super.getAgencia() + " Numero " + super.getNumero());
    }
}
