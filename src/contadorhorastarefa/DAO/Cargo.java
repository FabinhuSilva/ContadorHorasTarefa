
package contadorhorastarefa.DAO;

public class Cargo {
    
    private int codigo;

    
    private boolean situacao;
    private String Descricao;

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    public Cargo(int codigo, String Descricao) {
        this.codigo = codigo;
        this.Descricao = Descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
}
