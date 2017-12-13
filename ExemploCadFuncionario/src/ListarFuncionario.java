import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListarFuncionario {

	public static void main(String[] args) throws SQLException {
		List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
		Statement consulta = null;
		ResultSet resultado = null;
		Funcionario funcionario = null;
		Connection conexao = null;
		final String ordenacao = "nome";
		String sql = "select * from Funcionario order by "+ ordenacao + ";";
		
		try{
			// Abre a conexão
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/testes_funcionario","testes","asd");
			System.out.println("Conectado! \n");

			// Executa a query
			consulta = conexao.createStatement();
			resultado = consulta.executeQuery(sql);
			
			// Loop nos resultados
			while (resultado.next()) {
				
				// Lê os dados de cada row
				int codigo = Integer.valueOf(resultado.getString("Codigo"));
				String nome = resultado.getString("Nome");
				String funcao = resultado.getString("Funcao");
				int idade = Integer.valueOf(resultado.getString("Idade"));
				double salario  = Double.valueOf(resultado.getString("Salario"));
				
				// Cria um novo objeto
				funcionario = new Funcionario(nome, funcao, idade, salario);
				funcionario.setCodigo(codigo);
				
				// adiciona na lista
				listaFuncionario.add(funcionario);
			}
			
			System.out.println("Funcionários cadastrados");
			
			// Imprime os dados dos funcionários
			for(Funcionario f:  listaFuncionario){
				System.out.print("Código: " + f.getCodigo());
				System.out.print("; Nome: " + f.getNome());
				System.out.print("; Função: " + f.getFuncao());
				System.out.print("; Idade: " + f.getIdade());
				System.out.println("; Salário: " + f.getSalario());
			}
			
			// Fecha as conexões abertas
			consulta.close();
			conexao.close();			

		}catch(SQLException ex){
			System.out.println("Erro ao conectar ao banco: " + ex);
		}

	}
	
}




