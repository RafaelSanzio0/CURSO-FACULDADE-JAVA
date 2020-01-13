package OO;

public class Account {
    private Integer number;
    private String holder;
    private Double balance = 0.00;

    public Account(Integer number, String holder, Double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "*********ACCOUNT DATA" + '\''+
                "number: " + number +
                ", Holder: " + holder + '\'' +
                ", Balance: " + balance+"**********";
    }


}

/*

        Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
        titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
        inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
        conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
        Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
        o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
        exemplo).
        Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
        isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
        realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
        suficiente para realizar o saque e/ou pagar a taxa.
        Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
        informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
        mostrando os dados da conta após cada operação.

*/
