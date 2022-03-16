
package contadorhorastarefa.DAO;

/**
 *
 * @author Fabinhu
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoBanco {
    
 
private static Connection con;

public class Conecta {


    String driver = "org.postgresql.Driver";
    String user   = "postgres";
    String senha  = "postgres";
    String url    = "jdbc:postgresql://localhost:5432/BancoContadorHoras";

    try
    {
        Class.forName(driver);
        setCon(null);
        setCon((Connection) DriverManager.getConnection(url, user, senha));
        System.out.println("Conexão realizada com sucesso.");
    }
    catch (ClassNotFoundException ex)
    {
        System.err.print(ex.getMessage());
    } 
    catch (SQLException e)
    {
        System.err.print(e.getMessage());
    }
}

public static Connection getCon() {
	return con;
}

public static void setCon(Connection con) {
	Conecta.con = con;
}
}

