
package contadorhorastarefa.DAO;

/**
 *
 * @author Fabinhu
 */
import java.awt.List;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class BancoDeDados {
    
    //Variaveis utilizadas para Conexão com o Banco de Dados
    String driver = "org.postgresql.Driver";
    String usuario   = "postgres";
    String senha  = "postgres";
    String url    = "jdbc:postgresql://localhost:5432/BancoContadorHoras";
    public Connection conexao = DriverManager.getConnection(url,usuario,senha);;

public Connection ConexaoBanco() {
    try{
        Class.forName(driver);
        conexao = DriverManager.getConnection(url,usuario,senha);
        System.setProperty("jdbc.driverClassName",driver);
        
       
        //Abre uma conexão com o Banco de dados
        PreparedStatement script = this.conexao.prepareStatement("SELECT * FROM usuario");
        ResultSet retornoScript = script.executeQuery();
        
        ArrayList<contadorhorastarefa.DAO.Usuario> users = new ArrayList<contadorhorastarefa.DAO.Usuario>();
        while(retornoScript.next()){
            contadorhorastarefa.DAO.Usuario usuario = new contadorhorastarefa.DAO.Usuario();
            usuario.setNome((retornoScript.getString("nome")));            //usuario.setMatricula((retornoScript.getString("matricula")));
            users.add(usuario);
            System.out.println(usuario);
        }
        retornoScript.close();
        script.close();

      
    }
    catch (Exception ex)
    {
    /*Trabalhando com Logs
    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
    */
    JOptionPane.showMessageDialog(null, "Erro na conexão efetuada!\n"+ex.getMessage());
    } 
}

public void DesconectarBancoDados() {

    try {
            conexao.close(); // 
        } catch (Exception ex) {
            /* 
            Trabalhando com LOGs
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            */
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão!\nERRO: " + ex.getMessage(), "Banco de Dados", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}