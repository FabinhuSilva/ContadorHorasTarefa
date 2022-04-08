
package contadorhorastarefa.DAO;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class UsuarioTableModel extends AbstractTableModel {

    /*
    https://www.youtube.com/watch?v=wK_rDHZkLdY&list=PLWd_VnthxxLfA37A4Lb7VJZjqPYpes96X&index=2
    */
    
    //Criando lista para trazer os dados
    private List<Usuario> DadosUsuario = new ArrayList<>();
    private String[] ColunasJTable = {"Matricula","Nome","DataAdmissão","Login"};

    @Override
    public String getColumnName(int column) {
        return ColunasJTable[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getRowCount() {
        /*
        Este metodo é reponsavel pela quantidade de linhas
        */
        try {
            return DadosUsuario.size();
            
        } catch (Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public int getColumnCount() {
         /*
        Este metodo é reponsavel pela quantidade de Colunas
        */
         try {
            return ColunasJTable.length;
            
        } catch (Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
         /*
        utilizando este metodo para pegar o conteudo das tabelas
        */
         try {
          switch(coluna){
              //sempre no JTABLe começa do zero
              case 0:
              //chama o Array trazendo a linha
              return DadosUsuario.get(linha).getMatricula();
              case 1:
              return DadosUsuario.get(linha).getNome();
              case 2:
              return DadosUsuario.get(linha).getDataAdmissao();
              case 3:
              return DadosUsuario.get(linha).getLogin();
          } 
          return null;
          
        } catch (Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public void setValueAt(Object NovoValor, int linha, int coluna) {
        try {
             switch(coluna){
              //sempre no JTABLe começa do zero
              case 0:
              //chama o Array trazendo a linha
              DadosUsuario.get(linha).setMatricula(Integer.parseInt((String) NovoValor));
              break;
              case 1:
              DadosUsuario.get(linha).setNome((String)NovoValor);
              break;
              case 2:
              DadosUsuario.get(linha).setDataAdmissao((String) NovoValor);
              break;
              case 3:
              DadosUsuario.get(linha).setLogin((String) NovoValor);
              break;
          }
          this.fireTableRowsUpdated(linha, linha);
        } catch (Exception e) {
        super.setValueAt(NovoValor, linha, coluna); //To change body of generated methods, choose Tools | Templates.
        }
    }
    

    
    public void adicionarLinhas(Usuario usuario){
        
        //vinculo a chamada a Lista que criei acima
        this.DadosUsuario.add(usuario);
        this.fireTableDataChanged();
    }
    
    public void removerLinhas(int NumeroLinha){
        
        this.DadosUsuario.remove(NumeroLinha);
        
//função especifica para deletar dados
        this.fireTableRowsDeleted(NumeroLinha, NumeroLinha);
        
    }
}
