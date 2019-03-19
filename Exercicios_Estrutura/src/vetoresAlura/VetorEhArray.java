package vetoresAlura;

import java.util.Arrays;

public class VetorEhArray {

    private Aluno[] alunos = new Aluno[100];
    private int posicaoLivre = 0;

    public void aumentaArray() {
        if (posicaoLivre == alunos.length) {
            Aluno[] novoArray = new Aluno[alunos.length * 2]; //cria um novo array com o dobro de tamanho do antigo;
            for (int i = 0; i < alunos.length; i++) {
                novoArray[i] = alunos[i]; // copia os dados do array antigo para o novo

            }
            this.alunos = novoArray; // digo que meu array antigo agora é esse
        }
    }

    public void adiciona(Aluno aluno) {
        aumentaArray();
        alunos[posicaoLivre] = aluno; // solução mais correta ou seja uma solução "constante"
        posicaoLivre++;

//        for (int i = 0; i < alunos.length; i++) { // SOLUÇÃO FUNCIONAL PORÉM O TEMPO NAO É CONSTANTE, OU SEJA QUANTOR MAIOR A LISTA MAIS DEMORADO O TEMPO DE EXECUCAO
//            if(alunos[i] == null){
//                alunos[i] = aluno;
//                break;
//            }       
//        }
    }

    public boolean posicaoInvalida(int posicao) {
        return posicao >= 0 && posicao <= posicaoLivre;
    }

    public void adicionaComplexo(int posicao, Aluno aluno) {
        aumentaArray();

        if (!posicaoInvalida(posicao)) {
            throw new IllegalArgumentException("Posicao invalida");
        }

        for (int i = posicaoLivre - 1; i >= posicao; i -= 1) { //começa da ultima posicao, se eu passei 3 quero que empure do 3 pra frente, o 1 e 2 deve ficar intacto
            alunos[i + 1] = alunos[i]; //atualizo os valores da lista

        }
        alunos[posicao] = aluno;
        posicaoLivre++; // repsonsavel pelo tamanho da lista
    }

    public boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < posicaoLivre;
    }

    public Aluno pega(int posicao) { //pq retornar Aluno? pq simplismente quero um aluno '-'

        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição invalida");
        }

        return alunos[posicao];
    }

    public void remove(int posicao) {
        for (int i = posicaoLivre - 1; i >= posicao; i -= 1) { //começa da ultima posicao, se eu passei 3 quero que empure do 3 pra frente, o 1 e 2 deve ficar intacto
            alunos[i - 1] = alunos[i];

        }
        alunos[posicao] = null;
        posicaoLivre--;

//        for (int i = posicao; i < this.posicaoLivre; i++) { //solucao diferente
//            this.alunos[i] = this.alunos[i + 1];
//        }
//        posicaoLivre--;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < posicaoLivre; i++) { //jeito mais rapido pois to percorrendo o tamanho "posicaoLivre" que no caso seria o total de objetos add dentro da lista
            if (aluno.equals(alunos[i])) {
                return true;
            }
        }

        return false;

//        for (int i = 0; i < alunos.length; i++) {
//            if (alunos[i] != null) { // COMO MEU METODO EQUAL LANÇA UMA EXCECAO QUANDO ESBARRO NUMA POSICAO VAZIA, É NESCESSARIO FAZER UMA VERIFICAO ANTES E DEPOIS COMPARAR .
//                if (aluno.equals(alunos[i])) {
//                    return true;
//                }
//            }
//        }
    }

    public int tamanho() {
        return posicaoLivre;
    }

    public String toString() {
        return Arrays.toString(alunos);
    }

}
