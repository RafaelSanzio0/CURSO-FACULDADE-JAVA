package arrays;

import java.util.ArrayList;
import java.util.List;
import padrao.Conta;
import padrao.ContaCorrente;

public class Equals {

    public static void main(String[] args) {

        List<Conta> lista = new ArrayList<>();
        
        ContaCorrente conta1 = new ContaCorrente(50, 60);
        lista.add(conta1);
        
        ContaCorrente conta2 = new ContaCorrente(30, 20);
        lista.add(conta2);

        ContaCorrente conta3 = new ContaCorrente(30, 20);


        boolean existe = lista.contains(conta3);
        System.out.println(existe);

        
//        for (Conta conta : lista) {
//            if(conta.equals(conta3)){
//               System.out.println("existe");
//            }
//        }

    }

}
