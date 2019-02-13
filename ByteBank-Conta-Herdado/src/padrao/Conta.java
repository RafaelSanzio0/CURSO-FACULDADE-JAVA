package padrao;



public abstract class  Conta { // class abstrata pode ter metodos ou não

    protected double saldo;
    private int agencia;
    private int numero;
    Cliente titular;
    private static int total = 0;

    
    public Conta(){ // construtor padrao
        
    }
    
    public Conta(int agencia, int numero){ //construtor especifico
        Conta.total++;
       // System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
       // System.out.println("Estou criando uma conta " + this.numero);
    }
    
    public void saca(double valor){
        
        if (this.saldo < valor){ //tratando o erro unchecked
            throw new SaldoInsuficienteException("saldo insuficiente, saldo atual "+ this.saldo + " tentou sacar "+ valor);
        }
        
        this.saldo -= valor;
    }
   
    public abstract void deposita(double valor);
        //this.saldo = this.saldo + valor;
    

    public void transfere(double valor, Conta destino) {
        this.saca(valor);
        destino.deposita(valor);
       
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
   
    @Override
    public String toString(){
        return "string";
    }
    
    
    @Override
    public boolean equals(Object contaNova){
        
        Conta ref = (Conta)contaNova;
        
        if(this.agencia != ref.agencia){
            return false;
        }
        
        if(this.numero != ref.numero){
            return false;
        }
        return true;
        
    }
}
        


        
    
    
        

        
             
    

