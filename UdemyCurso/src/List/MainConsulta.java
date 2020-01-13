package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainConsulta {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // list nao aceita tipos primitivos
        list.add("Maria");
        list.add("Maria");
        list.add("Maria");
        list.add("Anna");
        list.add(2, "Marco");
        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'M'); //predicado aqui / remove elementos que começam com M na lista
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        //steam aceita funcoes lambdas, o filter que e uma func lambda recebe um predicado e nos retorna um tipo stream
        // convertemos este tipo stream para lista denovo utilizando collect

        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}


