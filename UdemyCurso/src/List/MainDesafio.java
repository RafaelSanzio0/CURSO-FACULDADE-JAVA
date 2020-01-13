package List;

/*
Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada.
 */


import vetores.Estudante;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainDesafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> listFuncionarios = new ArrayList<>();
        Funcionario funcionario = null;

        System.out.print("Quantos funcionarios serao registrados? ");
        int funcRegistrados = scanner.nextInt();

        for(int i=1; i <= funcRegistrados; i ++){
            System.out.println("Funcionario# "+(i));

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.print("Salario: ");
            double salario = scanner.nextDouble();

            listFuncionarios.add(new Funcionario(id,nome,salario));

        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = scanner.nextInt();

        Funcionario func = listFuncionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (func == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            func.aumentaSalario(percentage);
        }

        System.out.println("*********FUNCIONARIOS REGISTRADOS**********");

        for(Funcionario funcionarios : listFuncionarios){
            System.out.println(funcionarios);
        }
    }
}