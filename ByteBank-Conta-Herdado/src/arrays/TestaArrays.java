package arrays;

import padrao.Conta;
import padrao.ContaCorrente;
import padrao.ContaPoupanca;
import padrao.Cliente;

public class TestaArrays {

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente(22, 11);
        ContaPoupanca conta2 = new ContaPoupanca(21, 3);
        ContaPoupanca conta3 = new ContaPoupanca(31, 5);
        ContaPoupanca conta4 = new ContaPoupanca(41, 99);
        Cliente cliente1 = new Cliente();
        cliente1.setNome("rafael");

        ArrayGuardador guardador = new ArrayGuardador();
        
        guardador.adicionar(conta1);
        guardador.adicionar(conta2);
        guardador.adicionar(conta3);
        guardador.adicionar(conta4); 
        guardador.adicionar(cliente1);
        
        Conta refObjeto = (Conta)guardador.getContas(1);
        Cliente refCliente = (Cliente)guardador.getContas(4);


        System.out.println("Total de contas no nosso array "+guardador.getTotal());
        System.out.println(refObjeto.getNumero());
        System.out.println(refCliente.getNome());


       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Object[] contas = new Object[5]; //crio um vetor de uma instancia da classe ContaCorrente
//        
//        ContaCorrente conta1 = new ContaCorrente(22,11);
//        ContaPoupanca conta2 = new ContaPoupanca(11,1);
//        
//        contas[0] = conta1;
//        contas[1] = conta2;
//        
//        
//        System.out.println("conta1 "+conta1.getAgencia());
//        System.out.println("conta2 "+conta2.getAgencia());
//        
//        Object[] referencias = new Object [5];
//
//        referencias[0] = new Designer();
//        referencias[1] = new Gerente();
//
//        Designer designer = (Designer) referencias[0];
//        Gerente gerente = (Gerente) referencias[1];
    }

}
