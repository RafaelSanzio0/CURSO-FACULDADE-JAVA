
import java.util.InputMismatchException;
import java.util.Scanner;

public class VetorMeses {

    public static void main(String[] args) {

        int numero = 0;

        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"};

        Scanner entrada = new Scanner(System.in);

        try {

            while (numero != -1) {
                System.out.println("Digite um valor de 1 a 12: ");
                numero = entrada.nextInt();
                System.out.println("Mes selecionado foi: " + meses[numero - 1]);
            }

        } catch (ArrayIndexOutOfBoundsException exception) {

            if (numero != -1 && numero < 1 || numero > 12) {
                System.out.println("Indice no Array inexistente");

            }
            if (numero == -1) {
                System.out.println("Você escolheu sair");

            }

        } catch (InputMismatchException exception) {
            System.out.println("entrada de dados incompatível");

        }
    }
}
