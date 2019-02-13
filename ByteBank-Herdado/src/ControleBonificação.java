//EXEMPLO DE POLIMOFISMO

public class ControleBonificação {
    
    private double soma;
    static int quantidade;
    
    
    
   // ao inves de eu ter uma um metodo para cada tipo de funcinario, eu sómente declaro um metodo
   // referente a classe mãe FUNCIONARIOS, ela é direcionada para todos os outros tipos de funcionarios automaticamente.
   
     public void registra(Funcionarios f){
        double bonificação = f.bonificação();
        this.soma = this.soma + bonificação;
        quantidade++;
    }
     
    // public void registra(Gerente g){
       // double bonificação = g.bonificação();
       // this.soma = this.soma + bonificação;
   // }
    
   // public void registra(EditorDeVideo ev){
       // double bonificação = ev.bonificação();
       // this.soma = this.soma + bonificação;
  //  }
    
    public double getSoma(){
        return soma;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
}
