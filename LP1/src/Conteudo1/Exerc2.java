package Conteudo1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exerc2 {

	public static void main(String[] args) {
		boolean sair = false;
		int op;
		String entrada, saida;

		ArrayList<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();

		do {
			entrada = JOptionPane.showInputDialog("Digite a opção desejada: "
					+ "\n1 - Criar nova Pessoa"
					+ "\n2 - Exibir dados de todas as pessoas cadastradas"
					+ "\n3 - Consultar os dados de uma Pessoa"
					+ "\n4 - Excluir uma pessoa\n"
					+ "\n0 - Encerrar o programa");

			op = Integer.parseInt(entrada);

			switch (op) {
			case 1:
				Pessoa.inserirPessoa(pessoasCadastradas);
				break;
			case 2:
				saida = Pessoa.imprimirListaPessoas(pessoasCadastradas);				
				JOptionPane.showMessageDialog(null, saida);
				break;
			case 3:
				saida = Pessoa.consultarPessoa(pessoasCadastradas);
				JOptionPane.showMessageDialog(null, saida);
				break;
			case 4:
				saida = Pessoa.excluirPessoa(pessoasCadastradas);
				JOptionPane.showMessageDialog(null, saida);
				break;
			case 0:
				sair = true;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
			}

		} while (!sair);
		JOptionPane.showMessageDialog(null, "Programa encerrado por comando do usuário!");
		System.exit(0);
	}	
	
	
}
