package padrao;

import padrao.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
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
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public String toString() {
        return ("ContaCorrente, Agencia "+super.getAgencia()+" Numero "+super.getNumero());
    }

}
