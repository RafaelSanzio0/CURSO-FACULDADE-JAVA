
public class TesteSistema {
    public static void main(String[] args) {
        
        Gerente g = new Gerente();
        g.setSenha(222);
        
        Administrador adm = new Administrador();
        adm.setSenha(222);
        
        Cliente c = new Cliente();
        c.setSenha(9898);
        
        SistemaInterno s = new SistemaInterno();
        s.autenticar(g);
        s.autenticar(adm);
        s.autenticar(c);
      
      
        
        
        
    }
    
}
