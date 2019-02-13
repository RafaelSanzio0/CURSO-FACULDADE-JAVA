public class TestaContaSemCliente {
	public static void main(String[] args) {
		
		
		// crio o objeto Conta
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());

		
		// referencio direto o objeto Conta com o titular que esta na classe cliente
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);

		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);

	}
}