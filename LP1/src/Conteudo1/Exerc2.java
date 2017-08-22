package Conteudo1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exerc2 {

	public static void main(String[] args) {
		boolean sair = false;
		int op;
		String nome, RG, telefone, email, entrada, saida;

		ArrayList<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();
		
		
		
		
		
		
		
		
		do {
			entrada = JOptionPane.showInputDialog("Digite a op��o desejada: "
					+ "\n1 - Criar nova Pessoa"
					+ "\n2 - Exibir dados de todas as pessoas cadastradas"
					+ "\n3 - Consultar os dados de uma Pessoa"
					+ "\n4 - Excluir uma pessoa\n"
					+ "\n0 - Encerrar o programa");
			
			op = Integer.parseInt(entrada);

			switch (op) {
			case 1:
				nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
				RG = JOptionPane.showInputDialog("Digite o RG da pessoa");
				telefone = JOptionPane.showInputDialog("Digite o telefone da pessoa");
				email = JOptionPane.showInputDialog("Digite o email da pessoa");

				Pessoa novaPessoa = new Pessoa(nome, RG, telefone, email);
				pessoasCadastradas.add(novaPessoa);
				break;
			case 2:
				saida = "";
				// Utilizano o For
				for (int i = 0; i < pessoasCadastradas.size(); i++) {
					saida += pessoasCadastradas.get(i).toString() + "\n";
				}

				// Utilizando o For Each
				//for (Pessoa p1 : pessoasCadastradas) {
				//	saida += p1.toString() + "\n";
				//}
				if (saida.isEmpty()) {
					saida = "Voc� ainda n�o cadastrou nenhuma Pessoa";
				}
				JOptionPane.showMessageDialog(null, saida);
				break;
			case 3:
				saida = "";
				nome = JOptionPane.showInputDialog("Digite o nome da pessoa a ser consultada");
				for (Pessoa p1 : pessoasCadastradas) {					
					if (p1.getNome().equals(nome)) {
						saida += p1.toString() + "\n";
					}
				}
				if (saida.isEmpty()) {
					saida = "A Pessoa digitada (" + nome + ") n�o est� cadastrada";
				}
				JOptionPane.showMessageDialog(null, saida);
				break;
			case 4:
				saida = "";
				Pessoa pessoaExcluida = null;
				nome = JOptionPane.showInputDialog("Digite o nome da pessoa a ser exclu�da");
				for (Pessoa p1 : pessoasCadastradas) {
					if (p1.getNome().equals(nome)) {
						pessoaExcluida = p1;
					}
				}
				if (pessoaExcluida != null) {
					pessoasCadastradas.remove(pessoaExcluida);
					saida = "A Pessoa digitada (" + nome + ") foi removida com sucesso";
				}
				
				if (saida.isEmpty()) {
					saida = "A Pessoa digitada (" + nome + ") n�o est� cadastrada";
				}

				JOptionPane.showMessageDialog(null, saida);
				break;
			case 0:
				sair = true;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Op��o Inv�lida!");
			}

		} while (sair == false);
		JOptionPane.showMessageDialog(null, "Programa encerrado por comando do usu�rio!");
		System.exit(0);
	}

}
