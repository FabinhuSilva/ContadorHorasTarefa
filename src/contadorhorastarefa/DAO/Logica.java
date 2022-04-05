
package contadorhorastarefa.DAO;

import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.postgresql.core.ConnectionFactory;

public class Logica{

    public Logica() {
    
    }
        
    
 public static void ConsultarLogin (){
  
     BancoDeDados conexaobd = new BancoDeDados();
     conexaobd.ConexaoBanco();
     
     PreparedStatement script = null;
     ResultSet resultadoScript = null;
     
     List<Usuario> usuarios = new ArrayList<>();
     
     try {
         script = conexaobd.ConexaoBanco().prepareStatement("select * from usuario");
         resultadoScript = script.executeQuery();
         
         while (resultadoScript.next()){
             
             Usuario usuario = new Usuario();
             
             usuario.setMatricula(resultadoScript.getInt("matricula"));
             usuario.setNome(resultadoScript.getString("nome"));
             usuario.setDataAdmissao(resultadoScript.getString("dataadmissao"));
             usuario.setLogin(resultadoScript.getString("login"));
             usuarios.add(usuario);
             
             //System.out.println(usuarios);
             //System.out.println(usuarios.size());
             
            
         }
         
     } catch (Exception e) {
         System.out.println(e);
     }
 }
     
}