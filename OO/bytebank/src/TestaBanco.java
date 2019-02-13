public class TestaBanco {
	
	public static void main(String[] args) {
		
		// crio o objeto Cliente
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222.-22";
		paulo.profissao = "programador";

		
		//crio o objeto Conta
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);


		// relação das duas classes criadas anteriormente
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.cpf);
		System.out.println(contaDoPaulo.titular);

	}
}