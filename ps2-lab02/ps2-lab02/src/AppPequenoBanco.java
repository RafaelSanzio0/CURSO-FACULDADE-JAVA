
public class AppPequenoBanco {
    private static PequenoBanco banco;
    
    public static void main(String[] args) {
        banco = new PequenoBanco("Banco dos Programadores Java");
        menuPrincipal();
        System.out.println("\n>> Obrigado por usar este banco!");
    }

    private static void menuPrincipal() {
        boolean sair = false;
        while (!sair) {
            System.out.println("\n>> MENU PRINCIPAL");
            int opcao = Dialogo.menu("Criar conta normal", 
                                     "Criar conta com limite",
                                     "Mostrar informações do banco",
                                     "Sair");
            if (opcao == 1) {
                criarContaNormal();
            }
            else if(opcao == 2){
                criarContaComLimite();
            }
            else if (opcao == 3) {
                System.out.println("\n>> INFORMAÇÕES DO BANCO:");
                System.out.println(banco);
            }
            else if (opcao == 4) {
                sair = true;
            }
        }        
    }
    private static void criarContaComLimite() {
        System.out.println("\n>> CRIAÇÃO DE CONTA NORMAL");
        int num = Dialogo.lerInteiro("Número da conta: ");
        String nome = Dialogo.lerString("Nome do correntista: ");
        double saldo = Dialogo.lerDouble("Saldo da conta: ");
        double limite = Dialogo.lerDouble("Limite da conta: ");
        ContaComLimite c = new ContaComLimite(num, nome, saldo,limite);
        banco.adicionar(c);
    }
    
    private static void criarContaNormal() {
        System.out.println("\n>> CRIAÇÃO DE CONTA NORMAL");
        int num = Dialogo.lerInteiro("Número da conta: ");
        String nome = Dialogo.lerString("Nome do correntista: ");
        double saldo = Dialogo.lerDouble("Saldo da conta: ");
        ContaNormal c = new ContaNormal(num, nome, saldo);
        banco.adicionar(c);
    }
}
