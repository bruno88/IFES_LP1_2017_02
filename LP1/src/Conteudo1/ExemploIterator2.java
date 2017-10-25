package Conteudo1;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class ExemploIterator2 {

	public static void main(String[] args) {
		Pessoa pessoaAtual;
		// Iterator itPessoas, itContas;
		Iterator iterator;
		ArrayList<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();
		ArrayList<Conta> contasCadastradas = new ArrayList<Conta>();

		// Adicionando Pessoa 1
		String nome = "bruno";
		String RG = "q";
		String telefone = "w";
		String email = "e";
		Pessoa novaPessoa = new Pessoa(nome, RG, telefone, email);
		pessoasCadastradas.add(novaPessoa);

		// Adicionando Pessoa 2
		nome = "pedro";
		RG = "a";
		telefone = "s";
		email = "d";
		novaPessoa = new Pessoa(nome, RG, telefone, email);
		pessoasCadastradas.add(novaPessoa);

		// Adicionando Pessoa 3
		nome = "maria";
		RG = "z";
		telefone = "x";
		email = "c";
		novaPessoa = new Pessoa(nome, RG, telefone, email);
		pessoasCadastradas.add(novaPessoa);

		// Conta 1
		Conta c1 = new Conta(novaPessoa);
		contasCadastradas.add(c1);

		iterator = pessoasCadastradas.iterator();
		removePorNome(iterator, "bruno");

		iterator = contasCadastradas.iterator();
		// removePorNome(itContas, "maria");

		// No final, imprime toda a lista, para testes
		iterator = pessoasCadastradas.iterator();

		JOptionPane.showMessageDialog(null, "Imprimindo Pessoas");
		imprimirTudo(iterator);
		iterator = contasCadastradas.iterator();
		JOptionPane.showMessageDialog(null, "Imprimindo Contas");
		imprimirTudo(iterator);

	}

	// Usando Generics para imprimir tudo
	public static void imprimirTudo(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			JOptionPane.showMessageDialog(null, iterator.next());
		}
	}

	// Usando Generics para remover por nome
	public static void removePorNome(Iterator<?> iterator, String criterio) {
		while (iterator.hasNext()) {
			Object o1 = iterator.next();
			if (o1.toString().contains(criterio)) {
				iterator.remove();
			}
		}
	}

}
