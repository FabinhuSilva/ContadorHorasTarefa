
package contadorhorastarefa.DAO;


public class Usuario {

    /*public Usuario(int Matricula, String Nome, String DataAdmissao) {
        this.Matricula = Matricula;
        this.Nome = Nome;
        this.DataAdmissao = DataAdmissao;
    }*/

    private int Matricula;
    private String Nome,DataAdmissao,login;
    private boolean situacao;

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDataAdmissao() {
        return DataAdmissao;
    }

    public void setDataAdmissao(String Data_Admissao) {
        this.DataAdmissao = DataAdmissao;
    }
    
}
