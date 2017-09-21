package Conteudo1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pessoa {
	private String nome, RG, telefone, email;

	public Pessoa(String nome, String RG, String telefone, String email) {
		this.nome = nome;
		this.RG = RG;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static void inserirPessoa(ArrayList<Pessoa> pessoasCadastradas) {
		String nome, RG, telefone, email;

		nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
		RG = JOptionPane.showInputDialog("Digite o RG da pessoa");
		telefone = JOptionPane.showInputDialog("Digite o telefone da pessoa");
		email = JOptionPane.showInputDialog("Digite o email da pessoa");

		Pessoa novaPessoa = new Pessoa(nome, RG, telefone, email);

		pessoasCadastradas.add(novaPessoa);

	}

	public static String imprimirListaPessoas(ArrayList<Pessoa> pessoasCadastradas) {
		String saida = "";

		// Utilizano o For tradicional
		// for (int i = 0; i < pessoasCadastradas.size(); i++) {
		// saida += pessoasCadastradas.get(i).toString() + "\n";
		// }

		// Utilizando o For Each
		for (Pessoa p1 : pessoasCadastradas) {
			saida += p1.toString() + "\n";
		}

		if (saida.isEmpty()) {
			saida = "Você ainda não cadastrou nenhuma Pessoa";
		}
		return saida;
	}

	public static String consultarPessoa(ArrayList<Pessoa> pessoasCadastradas) {
		String nome, saida = "";
		nome = JOptionPane.showInputDialog("Digite o nome da pessoa a ser consultada");
		for (Pessoa p1 : pessoasCadastradas) {
			if (p1.getNome().equalsIgnoreCase(nome)) {
				saida += p1.toString() + "\n";
			}
		}
		if (saida.isEmpty()) {
			saida = "A Pessoa digitada (" + nome + ") não está cadastrada";
		}
		return saida;
	}

	public static String excluirPessoa(ArrayList<Pessoa> pessoasCadastradas) {
		String nome, saida = "";
		Pessoa pessoaExcluida = null;
		nome = JOptionPane.showInputDialog("Digite o nome da pessoa a ser excluída");
		for (Pessoa p1 : pessoasCadastradas) {
			if (p1.getNome().equalsIgnoreCase(nome)) {
				pessoaExcluida = p1;
			}
		}
		if (pessoaExcluida != null) {
			pessoasCadastradas.remove(pessoaExcluida);
			saida = "A Pessoa digitada (" + nome + ") foi removida com sucesso";
		}

		if (saida.isEmpty()) {
			saida = "A Pessoa digitada (" + nome + ") não está cadastrada";
		}
		return saida;
	}
	
	public static Pessoa getPessoaPorNome(ArrayList<Pessoa> lista, String nome) {
		for (Pessoa p1 : lista) {
			if (p1.getNome().equalsIgnoreCase(nome)) {
				return p1;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome 
				+ ", RG=" + RG 
				+ ", telefone=" + telefone 
				+ ", email=" + email + "]";
	}

}
