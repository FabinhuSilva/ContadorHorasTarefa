
package contadorhorastarefa.DAO;


public class Setor {
 
    private int codigo;
    private String descricao;
    private boolean stiaucao;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
    public boolean isStiaucao() {
        return stiaucao;
    }

    public void setStiaucao(boolean stiaucao) {
        this.stiaucao = stiaucao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Setor(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
}
