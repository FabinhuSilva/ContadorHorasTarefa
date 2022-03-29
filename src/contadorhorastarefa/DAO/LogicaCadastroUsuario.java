
package contadorhorastarefa.DAO;

import java.beans.Statement;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class LogicaCadastroUsuario {
    
//instanciando classes
    contadorhorastarefa.DAO.BancoDeDados ConectarBanco = new contadorhorastarefa.DAO.BancoDeDados();
    contadorhorastarefa.GUI.TelaLogin login = new contadorhorastarefa.GUI.TelaLogin();
    contadorhorastarefa.DAO.Usuario usuario = new contadorhorastarefa.DAO.Usuario();
 
    PreparedStatement Script;
    ResultSet respostaBanco = null;
    String sqll,nomeSQL;
    String pessoa = login.pessoa;
    Statement ExecutarScript;
    
    
public ArrayList<Usuario> encontrarItem(String pessoa) throws SQLException {
    

//Array para gravar conteudo da tabela
    ArrayList<Usuario> ConteudoBancodeDados = new ArrayList<>();
    
    //conectar no banco e preparar a consulta
    sql = "SELECT * FROM usuario WHERE nome = " + pessoa;
    Script = ConectarBanco.ConexaoBanco().prepareStatement(sql);
    ResultSet respostaBanco = Script.executeQuery(sql);
    while(respostaBanco.next()){
        usuario.setNome((respostaBanco.getString("nome")));
        ConteudoBancodeDados.add(usuario);
        StringBuilder nomeSQL = StringBuilder(usuario);
             
        if(nomeSQL.equals(pessoa)){
             System.out.println("Conectou!");
         } else{
             System.out.println("Nome Nao encontrado");
         }
      }
        return null;
}
    
public void validalogin() throws SQLException{
            
     }
}



