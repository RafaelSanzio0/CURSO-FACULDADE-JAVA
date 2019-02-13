
public class TesteReferencia {
    
    public static void main(String [] args){

    Gerente g1 = new Gerente();
    g1.setNome("Janiele");
    g1.setSalario(5000.0);
    String nome = g1.getNome();
    
    //Funcionarios f1 = new Funcionarios();
   //f1.setNome("Rafael");
    //f1.setSalario(2000.0);
    
    EditorDeVideo ev1 = new EditorDeVideo();
    ev1.setNome("jay");
    ev1.setSalario(2500.00);
    
   
    ControleBonificação controle1 = new ControleBonificação();
    controle1.registra(g1);
    //controle1.registra(f1);
    controle1.registra(ev1);

    
    System.out.println(controle1.getSoma());
    System.out.println(controle1.getQuantidade());
 

    
 
    }

}