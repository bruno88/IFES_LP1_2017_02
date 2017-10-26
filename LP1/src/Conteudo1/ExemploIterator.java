package Conteudo1;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class ExemploIterator {

	public static void main(String[] args) {
		Pessoa pessoaAtual;
		Iterator it;
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

		// 5: Mostrar o erro por não atualizar o Iterator
		// itPessoas = pessoasCadastradas.iterator();

		// Pessoa 3
		nome = "maria";
		RG = "z";
		telefone = "x";
		email = "c";
		novaPessoa = new Pessoa(nome, RG, telefone, email);
		pessoasCadastradas.add(novaPessoa);

		// 1: Mostrar Problema com For Each
/*
		for (Pessoa pessoa : pessoasCadastradas) {
			if (pessoa.getNome() == "bruno") {
				pessoasCadastradas.remove(pessoa);
			}
		}*/

		// 2: Mostrar que não há problema ao remover com o For

		/*for (int i = 0; i < pessoasCadastradas.size(); i++) {
			if (pessoasCadastradas.get(i).getNome() == "bruno") {
				pessoasCadastradas.remove(pessoasCadastradas.get(i));
			}
		}*/
		
		// 4 : Mostrar o uso do Iterator

		it = pessoasCadastradas.iterator();
		while (it.hasNext()) {
			pessoaAtual = (Pessoa) it.next();
			if (pessoaAtual.getNome() == "bruno") {
				it.remove();
			}
		}

		// No final, imprime toda a lista, para testes
		it = pessoasCadastradas.iterator();
		while (it.hasNext()) {
			JOptionPane.showMessageDialog(null, it.next());
		}

	}
}
