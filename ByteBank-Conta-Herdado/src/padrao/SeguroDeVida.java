package padrao;


import padrao.Tributavel;


public class SeguroDeVida implements Tributavel {
    
    @Override
    
    public double getValorImposto(){
        return 42;
    }
    
}
