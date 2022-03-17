
/**
 *
 * @author Fabinhu
 */
public class anotacoes {
    /*
    ------------------Conexão com o Banco de dados--------------------
       
    
    String url = "jdbc:postgresql://localhost:5432/hsegura_tutorial";
String usuario = "hsegura_gerente";
String senha = "123456";
try {
    Class.forName("org.postgresql.Driver");
    Connection conexao = DriverManager.getConnection(url, usuario, senha);
} catch (ClassNotFoundException e) {
    // Erro caso o driver JDBC não foi instalado
    e.printStackTrace();
} catch (SQLException e) {
    // Erro caso haja problemas para se conectar ao banco de dados
    e.printStackTrace();
}
    -----------------------------------------------------------------
    
    Sobre o PreparedStatement
    Um objeto da interface PreparedStatement, do pacote java.sql, é usado quando precisamos
    executar comandos SQL pré-compilados e obter o resultado produzido. Pré-compilação significa 
    que estas instruções poderão ser executadas com uma eficiência maior do que usando simples objetos Statement.
    
    executeUpdate(String sql): Este método executa uma instrução SQL INSERT, UPDATE ou DELETE e retorna um valor inteiro indicando a quantidade de registros afetados ou o valor 0 (no caso de comandos que não retornam nada).
    
    executeQuery(String sql): Este método executa uma instrução SQL que retorna um único ResultSet (conjunto de dados).
    
    execute(String sql): Executa instruções SQL que podem retornar múltiplos resultados.
    
    Exemplo:
    // vamos obter um objeto PreparedStatement para criar uma consulta SQL
// parametrizada
PreparedStatement pstmt = conn.prepareStatement("INSERT INTO livros " + 
  "VALUES(?, ?, ?, ?)");
    */
    
}
