
package contadorhorastarefa.DAO;

import java.sql.Statement;
import java.sql.SQLException;

public class Logica{
        
        //Variaveis
        Statement statement;
//        ResultSet resultset;
        boolean autenticado = false;
        String sqlConsulta; 
    
 public boolean ConsultarLogin (){
        //nao estquecer usar o import java.sql.*
        //Conecantando ao Banco de Dados
        contadorhorastarefa.DAO.BancoDeDados conectabanco = new contadorhorastarefa.DAO.BancoDeDados();
        
        try{
            //Conecta no Banco
            conectabanco.ConexaoBanco();
            Statement stms = (Statement)conectabanco.conexao.createStatement();
            sqlConsulta  = "SELECT nome FROM usuario";
            stms.executeQuery(sqlConsulta);
            statement.close();
            
        }catch(SQLException erro){
            System.out.println(erro);
        }
        System.out.println("passou a captura conectou no banco!");
 }
     
}