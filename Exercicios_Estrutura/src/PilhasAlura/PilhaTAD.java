package PilhasAlura;

public class PilhaTAD {

    public static void main(String[] args) {

        Pilha p = new Pilha();

        p.push("rafael");
        System.out.println(p);
        p.push("Joel");
        System.out.println(p);

        System.out.println("Pilha esta vazia? " + p.vazia());

    }

}
