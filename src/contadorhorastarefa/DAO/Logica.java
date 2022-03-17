
package contadorhorastarefa.DAO;

import java.sql.*;

public class Logica{
    
 public boolean ConsultarLogin (){
     
        boolean autenticado = false;
        String sqlConsulta; 
        
        contadorhorastarefa.DAO.BancoDeDados conectabanco = new contadorhorastarefa.DAO.BancoDeDados();
        conectabanco.ConexaoBanco();
        sqlConsulta  = "SELECT * FROM usuario WHERE nome = ?";
        
        System.out.println("passou a captura conectou no banco!");
                
        //nao estquecer usar o import java.sql.*
        
        ResultSet rs;
        PreparedStatement ps;
        ps.ConexaoBanco.preapreStatemente(sqlConsulta);
        ps.seString(1,nome);
        
        rs.ps.executeQuery();
        
     
 }
     
}