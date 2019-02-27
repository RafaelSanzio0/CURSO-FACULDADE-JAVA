package vetores;

public class Main {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Rafael");
        Aluno a2 = new Aluno("Janiele");
        Aluno a3 = new Aluno("Mario");

        VetorEhArray listaDeAlunos = new VetorEhArray();

        listaDeAlunos.adiciona(a1);
        listaDeAlunos.adiciona(a2);
        System.out.println(listaDeAlunos);

        System.out.println(listaDeAlunos.tamanho());

        listaDeAlunos.adicionaComplexo(1, a3);

         listaDeAlunos.remove(2);
        System.out.println(listaDeAlunos);

        System.out.println(listaDeAlunos.tamanho());
        
        for(int i = 0; i < 900000000; i++){ //testa aumentaArray
            Aluno y = new Aluno("joao"+i);
            listaDeAlunos.adiciona(y);
            
        }
        System.out.println(listaDeAlunos);

    }

}
