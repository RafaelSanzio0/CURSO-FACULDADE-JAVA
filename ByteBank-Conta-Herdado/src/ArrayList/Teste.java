package ArrayList;

import java.util.ArrayList;
import java.util.List;
import padrao.*;

public class Teste {

    public static void main(String[] args) {

       
        int idade = 29;
        Integer idadeRef = idade;
        System.out.println(idadeRef);
        
        
        
 
        List<Conta> lista = new ArrayList<>();

        ContaCorrente conta1 = new ContaCorrente(50, 60);
        ContaCorrente conta2 = new ContaCorrente(30, 20);

        lista.add(conta1);
        lista.add(conta2);
        System.out.println(lista.size());

       // Conta ref = (Conta) lista.get(0); //cast
      //  System.out.println(ref.getNumero());

        for (int i = 0; i < lista.size(); i++) {
            Conta oRef =(Conta)lista.get(i);
            
            System.out.println(oRef);

        }
        
        System.out.println("-----------------");

        for (Conta o : lista) {
//           int i = 0;
//           Conta oRef = (Conta)lista.get(i);
            System.out.println(o);
        }

    }

}
