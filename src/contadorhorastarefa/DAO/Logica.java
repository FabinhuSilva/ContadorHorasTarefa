
package contadorhorastarefa.DAO;

import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Logica{
        
        /*
    PreparedStatement Resposanvel pela consulta
        */
        PreparedStatement Script;
        ResultSet ResultadoScript;
    //    String sqlConsulta; **desuso
        
        boolean autenticado = false;
      contadorhorastarefa.DAO.BancoDeDados ConexaoBanco = new contadorhorastarefa.DAO.BancoDeDados();
      contadorhorastarefa.DAO.Usuario usuario = new contadorhorastarefa.DAO.Usuario();
      contadorhorastarefa.GUI.TelaLogin login = new contadorhorastarefa.GUI.TelaLogin();
    
 public Usuario ConsultarLogin (String nome){
     try{

         nome = login.pessoa;
         String consulta = "SELECT * FROM usuario WHERE nome = ?";
         
         ConexaoBanco.ConexaoBanco();

         //Validação de Acesso ao Banco
         if (ConexaoBanco.ConexaoBanco() != null) {
             JOptionPane.showMessageDialog(null,"Conectado com Sucesso!");
         }else{
             JOptionPane.showMessageDialog(null,"Problemas com conexao!\n Erro: "+conectarBanco.conexao);
         }

         Statement Script = (Statement) ConexaoBanco.conexao.createStatement();
         this.Script.executeQuery(consulta);
         JOptionPane.showMessageDialog(null,consulta);
         
           }catch(SQLException ex){
         JOptionPane.showMessageDialog(null,ex);
     }
 }
     
}