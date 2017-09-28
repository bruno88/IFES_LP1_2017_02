package Conteudo1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exerc5 {

	public static void main(String[] args) {
		Livro livroConsultado;
		boolean continuarMenu = true;
		String entrada = "", saida = "";
		String titulo, autor, editora, palavraChave;
		int op;

		Acervo acervo = new Acervo();

		do {
			entrada = JOptionPane.showInputDialog("Digite a opção desejada: " 
					+ "\n1 - Adicionar novo Livro"
					+ "\n2 - Consultar Livro por Título" 
					+ "\n3 - Consultar Livro por Autor" 
					+ "\n4 - Remover Livro"
					+ "\n5 - Adicionar Palavra Chave"
					+ "\n6 - Remover Palavra Chave"
					+ "\n7 - Listar Palavra Chave"
					+ "\n\n0 - Encerrar o programa");

			op = Integer.parseInt(entrada);

			switch (op) {
			case 1:
				titulo = JOptionPane.showInputDialog(null, "Digite o título do livro");
				autor = JOptionPane.showInputDialog(null, "Digite o autor do livro");
				editora = JOptionPane.showInputDialog(null, "Digite a editora do livro");
				Livro novoLivro = new Livro(titulo, autor, editora);
				acervo.getLivrosCadastrados().add(novoLivro);
				saida = "Livro cadastrado com Sucesso !";
				break;
			case 2:
				titulo = JOptionPane.showInputDialog(null, "Digite o título do livro");
				livroConsultado = acervo.getLivroPorTitulo(titulo);
				if (livroConsultado == null) {
					saida = "Livro não encontrado";
				} else {
					saida = livroConsultado.toString();
				}
				break;
			case 3:
				titulo = JOptionPane.showInputDialog(null, "Digite o autor do livro");
				livroConsultado = acervo.getLivroPorAutor(titulo);
				if (livroConsultado == null) {
					saida = "Livro não encontrado";
				} else {
					saida = livroConsultado.toString();
				}
				break;
			case 4:
				titulo = JOptionPane.showInputDialog(null, "Digite o título do livro");
				livroConsultado = acervo.getLivroPorTitulo(titulo);
				if (livroConsultado == null) {
					saida = "Livro não encontrado";
				} else {
					acervo.getLivrosCadastrados().remove(livroConsultado);
					saida = "Livro Removido com sucesso";
				}
				break;
			// 5 - Adicionar Palavra Chave 
			case 5:
				titulo = JOptionPane.showInputDialog(null, "Digite o título do livro");
				livroConsultado = acervo.getLivroPorTitulo(titulo);
				
				if (livroConsultado == null) {
					saida = "Livro não encontrado";
				} else {
					palavraChave = JOptionPane.showInputDialog(null, "Livro encontrado. \nDigite uma palavra chave");
					livroConsultado.adicionarPalavraChave(palavraChave);
					
					saida = "Palavra Chave adicionada!";
				}				
				break;
			// 6 - Remover Palavra Chave" 
			case 6:
				titulo = JOptionPane.showInputDialog(null, "Digite o título do livro");
				livroConsultado = acervo.getLivroPorTitulo(titulo);
				
				if (livroConsultado == null) {
					saida = "Livro não encontrado";
				} else {
					palavraChave = JOptionPane.showInputDialog(null, "Livro encontrado. \nDigite uma palavra chave");
					livroConsultado.removerPalavraChave(palavraChave);
					saida = "Palavra Chave removida!";
				}	
				break;
			// 7 - Listar Palavra Chave
			case 7:
				titulo = JOptionPane.showInputDialog(null, "Digite o título do livro");
				livroConsultado = acervo.getLivroPorTitulo(titulo);
				if (livroConsultado == null) {
					saida = "Livro não encontrado";
				} else {
					saida = "Palavras chave: \n";
					ArrayList<String> todasPalavrasChave = livroConsultado.getPalavrasChave();
					
					/*for (String palavra : todasPalavrasChave) {
						saida += palavra + "\n";
					}*/
					
					for (int i = 0; i < todasPalavrasChave.size() ; i++) {
						saida += todasPalavrasChave.get(i) + "\n";
					}
				}
				break;
			case 0:
				continuarMenu = false;
				saida = "Programa encerrado por comando do usuário!";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
			}
			JOptionPane.showMessageDialog(null, saida);
		} while (continuarMenu);

		System.exit(0);
	}

}
