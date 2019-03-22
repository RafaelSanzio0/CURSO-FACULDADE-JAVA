
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class ProfessoresCrud {
    
    public static void main(String[] args) {
        
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("DRIVER JDBC CARREGADO");
            
            String url = "jdbc:derby://localhost:1527/faculdade";
            String usuario = "rafael";
            String senha = "";
            Connection conexao = DriverManager.getConnection(url,usuario, senha);
            System.out.println("CONEXAO ESTABELECIDA COM SUCESSO");
            
            String sqlInsert = "INSERT INTO professores (nome,matricula,area)";
            sqlInsert += "VALUES (?,?,?)";
            
            String sqlSelect = "SELECT FROM * professores";
            
            String sqlUpdate = "UPDATE professores SET nome=?, matricula=?, senha=?";
            sqlUpdate += "WHERE id=?";
            
            String sqlDelete = "DELETE FROM professores WHERE id=?";
            
            PreparedStatement insertStatement = conexao.prepareStatement(sqlInsert);
            PreparedStatement selectStatement = conexao.prepareStatement(sqlSelect);
            PreparedStatement updateStatement = conexao.prepareStatement(sqlUpdate);
            PreparedStatement deleteStatement = conexao.prepareStatement(sqlDelete);
            
            boolean querSair = false;
            Scanner scanner = new Scanner(System.in);
            
            while(!querSair){
                
                System.out.println("\n menu");
                System.out.println("(1) Criar registro");
                System.out.println("(2) Ler registro");
                System.out.println("(3) Atualizar regristro");
                System.out.println("(4) Apagar registro");
                System.out.println("(5) Sair");
                
                int opcao = Integer.parseInt(scanner.nextLine());
                

            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }catch(Exception ex){
            
        }
        
    }
    
}
