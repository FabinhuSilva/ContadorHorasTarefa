
package contadorhorastarefa.DAO;

/**
 *
 * @author Fabinhu
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class BancoDeDados {
    
private static Connection con;

public void ConexaoBanco() {

    System.out.println("Entrou aqui");
    
    //Variaveis utilizadas para Conexão com o Banco de Dados
    String driver = "org.postgresql.Driver";
    String user   = "postgres";
    String senha  = "postgres";
    String url    = "jdbc:postgresql://localhost:5432/BancoContadorHoras";

    try{
        System.out.println("Entrou no TRY");
        Connection con = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/BancoContadorHoras",
				"postgres", "postgres");
        
        System.out.println("Conectou!");
        
        //Consultar Tabelas do Banco
        PreparedStatement pstm = con.prepareStatement("SELECT tablename FROM pg_tables order by tablename");
        
        System.out.println("Passou do SELECT");
        
        ResultSet rs = pstm.executeQuery();
                rs.close();
		pstm.close();
		con.close();
        
        // Ver para que Serve
        while (rs.next()) {
	    System.out.println("Nome tabela: " + rs.getString("tablename"));				
	    }
    }
    catch (Exception ex)
    {
        System.err.print(ex.getMessage());
    } 
    System.out.println("Fim dos Carregamentos");
}

public static Connection getCon() {
	return con;
}

public static void setCon(Connection con) {
	BancoDeDados.con = con;
}
}

