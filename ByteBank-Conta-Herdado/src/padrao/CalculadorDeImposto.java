package padrao;


import padrao.Tributavel;


public class CalculadorDeImposto {
    
    private double totalImposto;
    
    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }
    
    public double getTotalImposto(){
        return this.totalImposto;
    }
    
}
