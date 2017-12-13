import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class CadastrarFuncionario {

	public static void main(String[] args) throws SQLException {
		Funcionario funcionario;
		String condicao = "S";
		String sql = "insert into funcionario (nome,funcao,idade,salario) values (?,?,?,?)";
		
		try {
			Connection conexao = DriverManager.getConnection(
						"jdbc:mysql://localhost/testes_funcionario","testes","asd");

			System.out.println("Conectado!");

			do {
				
				String nome = JOptionPane.showInputDialog("Digite o Nome: ");
				String funcao = JOptionPane.showInputDialog("Digite a Função: ");
				int idade = Integer.valueOf(JOptionPane.showInputDialog("Digite a Idade: "));
				double salario = Double.valueOf(JOptionPane.showInputDialog("Digite o Salário: "));

				funcionario = new Funcionario(nome, funcao, idade, salario);

				PreparedStatement query = conexao.prepareStatement(sql);

				query.setString(1, funcionario.getNome());
				query.setString(2, funcionario.getFuncao());
				query.setInt(3, funcionario.getIdade());
				query.setDouble(4, funcionario.getSalario());

				query.execute();
				query.close();

				condicao = JOptionPane.showInputDialog("Deseja cadastrar outro funcionário (S ou N)? ");
				
			}while (condicao.equalsIgnoreCase("S")) ;

			conexao.close();
			System.out.println("Conexão finalizada!");
			
		}catch(SQLException ex){
			System.out.println("Erro ao conectar ao banco: " + ex);
		}

	}
}




