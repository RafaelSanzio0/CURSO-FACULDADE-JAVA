package pacote1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Exercicio3 {

    public static void main(String[] args) {

        String palpite = showInputDialog("Digite algum valor: ");
        int facePalpite = Integer.parseInt(palpite);
        int faceSorteada = 1 + (int) (Math.random() * 6);
        String mensagem = "";

        if (facePalpite < 1 || facePalpite > 6) {
            mensagem = ("Valor inválido! entre com um numero entre 1 a 6");
        } else {
            if (facePalpite == faceSorteada) {
                mensagem = ("Parabens! Você acertou");
            } else {
                mensagem = ("AHH! voce errou, o numero era "+faceSorteada);
            }
        }
        showMessageDialog(null, mensagem);
    }
}
