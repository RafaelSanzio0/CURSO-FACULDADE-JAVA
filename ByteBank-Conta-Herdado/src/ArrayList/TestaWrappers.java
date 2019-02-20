/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class TestaWrappers {

    public static void main(String[] args) {
        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.intValue()); //unboxing
        
        
        Number refN = Double.valueOf(33.2); //classe NUMBER mãe de todos
        refN.byteValue();
        
        List<Number> qualquerValor = new ArrayList();
        qualquerValor.add(10);
        qualquerValor.add(3.2);
        qualquerValor.add(90.22f);
        
       
    }

}
