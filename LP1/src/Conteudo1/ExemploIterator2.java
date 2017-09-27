package Conteudo1;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class ExemploIterator2 {

	public static void main(String[] args) {
		Pessoa pessoaAtual;
		Iterator itPessoas, itContas;
		ArrayList<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();
		ArrayList<Conta> contasCadastradas = new ArrayList<Conta>();

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
		
		// Conta 1
		Conta c1 = new Conta(novaPessoa);
		contasCadastradas.add(c1);
		
		itPessoas = pessoasCadastradas.iterator();
		itContas = contasCadastradas.iterator();
		removePorNome(itPessoas, "bruno");
		removePorNome(itContas, "maria");

		// No final, imprime toda a lista, para testes
		itPessoas = pessoasCadastradas.iterator();
		itContas = contasCadastradas.iterator();
		JOptionPane.showMessageDialog(null, "Imprimindo Pessoas");
		imprimirTudo(itPessoas);
		JOptionPane.showMessageDialog(null, "Imprimindo Contas");
		imprimirTudo(itContas);

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
