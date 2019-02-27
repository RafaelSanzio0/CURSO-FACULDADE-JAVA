package PilhasAlura;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

    private List<String> nomes = new LinkedList<String>();
    private int topo = -1;

    public void push(String nome) {
        nomes.add(nome);

    }

    public String pop() {

        return nomes.remove(nomes.size() - 1);

    }

    public boolean vazia() {
        boolean vazio = nomes.isEmpty();

        if (vazio == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        boolean vazio = nomes.isEmpty();

        if (vazio == true) {
            return "[]";
        } else {
            return nomes.toString();
        }

    }

}
