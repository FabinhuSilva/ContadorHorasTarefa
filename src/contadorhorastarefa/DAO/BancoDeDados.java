
package contadorhorastarefa.DAO;

/**
 *
 * @author Fabinhu
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class BancoDeDados {
    
    //Variaveis utilizadas para Conexão com o Banco de Dados
    String driver = "org.postgresql.Driver";
    String user   = "postgres";
    String senha  = "postgres";
    String url    = "jdbc:postgresql://127.0.0.1:5432/BancoContadorHoras";
    public Connection conexao;

public void ConexaoBanco() {
    try{
        System.setProperty("jdbc.driverClassName",driver);
        //Abre uma conexão com o Banco de dados
        conexao = DriverManager.getConnection(url,user,senha);
        
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
    
    
    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

}



