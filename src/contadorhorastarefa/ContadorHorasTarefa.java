
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

        contadorhorastarefa.DAO.BancoDeDados conecta = new contadorhorastarefa.DAO.BancoDeDados();
        conecta.ConexaoBanco();
    }
    
}
