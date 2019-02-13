
public class EditorDeVideo extends Funcionarios {
   
    @Override
   public double bonificação (){
        System.out.println("metodo EDITOR DE VIDEOS");
        return super.bonificação() + 100;
    }
    
}
