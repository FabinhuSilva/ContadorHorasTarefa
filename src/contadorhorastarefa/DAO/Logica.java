
package contadorhorastarefa.DAO;

/**
 *
 * @author Fabinhu
 */
public class Logica {
    
 public boolean ConsultarLogin (String login){
// Manda como parametro para ele duas variaveis para ele procurar no banco de dados!
 
            boolean autenticado = false;
            String sql;
            sql = "select login, senha from NOME_DA_SUA_TABELA where login = ? and senha = ?";
            PreparedStatement ps;
 
            ps = conexao.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
 
            ResultSet rs;
            rs = ps.executeQuery();
 
            if (rs.next()) {
                String loginBanco = rs.getString("NOME_DA_COLUNA_QUE_TEM_O_LOGIN");
                String senhaBanco = rs.getString("NOME_DA_COLUNA_QUE_TEM_A_SENHA");
                autenticado = true;
            }
 
            ps.close();
   
 
            return autenticado;
 
        } catch (SQLException ex) {
            System.out.println("Erro ao recuperar cliente/ senha.);
            Logger.getLogger(CartaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException();
        }
}
    
}
