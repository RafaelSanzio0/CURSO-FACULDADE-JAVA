
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class AppBanco {

    private static PequenoBanco banco;

    public static void main(String[] args) {
        banco = new PequenoBanco("Banco dos Programadores Java");
        menuPrincipal();
        DialogoGui.mostrarMsg("\n>> Obrigado por usar este banco!");
    }

    private static void menuPrincipal() {
        boolean sair = false;
        while (!sair) {
            int opcao = DialogoGui.menu("Criar conta normal",
                    "Criar conta com limite",
                    "Criar conta-salário",
                    "Mostrar informações do banco",
                    "Sair",
                    "SalvarDados");
            if (opcao == 1) {
                criarContaNormal();
            } else if (opcao == 2) {
                criarContaComLimite();
            } else if (opcao == 3) {
                criarContaSalario();
            } else if (opcao == 4) {
                String s = "\n>> INFORMAÇÕES DO BANCO:\n" + banco;
                DialogoGui.mostrarMsg(s);
            } else if (opcao == 5) {
                sair = true;
            }else if (opcao == 6){
                salvarDadosConta();
            }
        }
    }

    private static void criarContaNormal() {
        System.out.println("\n>> CRIAÇÃO DE CONTA NORMAL");
        int num = DialogoGui.lerInteiro("Número da conta: ");
        String nome = DialogoGui.lerString("Nome do correntista: ");
        double saldo = DialogoGui.lerDouble("Saldo da conta: ");
        ContaNormal c = new ContaNormal(num, nome, saldo);
        banco.adicionar(c);
    }

    private static void criarContaComLimite() {
        System.out.println("\n>> CRIAÇÃO DE CONTA COM LIMITE");
        int num = DialogoGui.lerInteiro("Número da conta: ");
        String nome = DialogoGui.lerString("Nome do correntista: ");
        double saldo = DialogoGui.lerDouble("Saldo da conta: ");
        double limite = DialogoGui.lerDouble("Limite da conta: ");
        ContaComLimite c = new ContaComLimite(num, nome, saldo, limite);
        banco.adicionar(c);
    }

    private static void criarContaSalario() {
        System.out.println("\n>> CRIAÇÃO DE CONTA-SALÁRIO");
        int num = DialogoGui.lerInteiro("Número da conta: ");
        String nome = DialogoGui.lerString("Nome do correntista: ");
        double saldo = DialogoGui.lerDouble("Saldo da conta: ");
        String cnpj = DialogoGui.lerString("CNPJ da empresa contratante: ");
        ContaSalario c = new ContaSalario(num, nome, saldo, cnpj);
        banco.adicionar(c);
    }

    public static void salvarDadosConta() throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter("veiculos.txt")) {
            for (ContaAbstrata ca : lista) {
                String linha = "";

                if (ca instanceof ContaNormal) {
                    ContaNormal cn = (ContaNormal) ca;
                    linha = "ContaNormal;" + cn.getCorrentista() + ";" + cn.getNumero() + ";" + cn.getSaldo();
                } else if (ca instanceof ContaSalario) {
                    ContaSalario cs = (ContaSalario) ca;
                    linha = "ContaSalario;" + cs.getCorrentista() + ";" + cs.getNumero() + ";" + cs.getSaldo() + ";" + cs.getCnpjContratante();

                } else if (ca instanceof ContaComLimite) {
                    ContaComLimite ccl = (ContaComLimite) ca;
                    linha = "ContaComLimite;" + ccl.getCorrentista() + ";" + ccl.getNumero() + ";" + ccl.getSaldo() + ";" + ccl.getLimite();
                }
                pw.println(linha);
            }
            pw.flush();
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Falha ao abrir arquivo");
        }

    }

}
