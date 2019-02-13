//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class Designer extends Funcionarios {
	
	public double bonificação() {
		System.out.println("Chamando o método de bonificacao do Designer");
		return 200;
	}	

}
