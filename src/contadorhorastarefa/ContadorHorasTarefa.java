
package contadorhorastarefa;

/**
 *
 * @author Fabinhu
 */
public class ContadorHorasTarefa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        contadorhorastarefa.GUI.TelaLogin TelaLogin = new contadorhorastarefa.GUI.TelaLogin();
                TelaLogin.ExibeDataHoraLogin();
                TelaLogin.TelaLoginPrincipal();
                TelaLogin.ExibeDataHoraLogin();

       /*
        Teste de conexão com Banco de dados
        contadorhorastarefa.DAO.BancoDeDados conecta = new contadorhorastarefa.DAO.BancoDeDados();
        conecta.ConexaoBanco();
        conecta.DesconectarBancoDados();
        */
    }
    
}
