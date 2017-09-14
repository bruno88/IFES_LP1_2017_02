package Conteudo1;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class ExemploIterator {

	public static void main(String[] args) {
		Pessoa pessoaAtual;
		Iterator itPessoas;
		ArrayList<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();
		
		// Pessoa 1
		String nome = "bruno";
		String RG = "q";
		String telefone = "w";
		String email = "e";
		Pessoa novaPessoa = new Pessoa(nome, RG, telefone, email);
		pessoasCadastradas.add(novaPessoa);

		// Pessoa 2
		nome = "pedro";
		RG = "a";
		telefone = "s";
		email = "d";
		novaPessoa = new Pessoa(nome, RG, telefone, email);
		pessoasCadastradas.add(novaPessoa);

		// Mostrar o erro por não atualizar o Iterator
		// itPessoas = pessoasCadastradas.iterator();

		// Pessoa 3
		nome = "maria";
		RG = "z";
		telefone = "x";
		email = "c";
		novaPessoa = new Pessoa(nome, RG, telefone, email);
		pessoasCadastradas.add(novaPessoa);

		// Mostrar problema ao remover com o For

		/*for (int i = 0; i < pessoasCadastradas.size(); i++) {
			if (pessoasCadastradas.get(i).getNome() == "bruno") {
				pessoasCadastradas.remove(pessoasCadastradas.get(i));
			}
		}*/

		// Mostrar Problema com For Each

		/*for (Pessoa pessoa : pessoasCadastradas) {
			if (pessoa.getNome() == "bruno") {
				pessoasCadastradas.remove(pessoa);
			}
		}*/

		// "Atualiza" o iterator

		/*itPessoas = pessoasCadastradas. iterator();
		while (itPessoas.hasNext()) {
			pessoaAtual = (Pessoa) itPessoas.next();
			if (pessoaAtual.getNome() == "bruno") {
				itPessoas.remove();
			} 
		}*/

		// No final, imprime toda a lista, para testes
		 itPessoas = pessoasCadastradas.iterator();
		while (itPessoas.hasNext())
		{
			JOptionPane.showMessageDialog(null, itPessoas.next());
		}
		 
	}
}
