package vetoresAlura;

public class Aluno {

    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        Aluno outro = (Aluno) o;
        return outro.getNome().equals(this.nome); // aqui compara nome de um aluno com outro

    }

    @Override
    public String toString() {
        return nome;
    }

}
