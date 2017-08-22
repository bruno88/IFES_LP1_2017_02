package Conteudo1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exerc1 {

	public static void main(String[] args) {
		String nome, RG, telefone, email;
		Pessoa pessoa1, pessoa2;
		
		nome = JOptionPane.showInputDialog("Digite o nome da pessoa 1");
		RG = JOptionPane.showInputDialog("Digite o RG da pessoa 1");
		telefone = JOptionPane.showInputDialog("Digite o telefone da pessoa 1");
		email = JOptionPane.showInputDialog("Digite o email da pessoa 1");

		pessoa1 = new Pessoa(nome, RG, telefone, email);

		nome = JOptionPane.showInputDialog("Digite o nome da pessoa 2");
		RG = JOptionPane.showInputDialog("Digite o RG da pessoa 2");
		telefone = JOptionPane.showInputDialog("Digite o telefone da pessoa 2");
		email = JOptionPane.showInputDialog("Digite o email da pessoa 2");

		pessoa2 = new Pessoa(nome, RG, telefone, email);

		// Consulta a dados internos
		JOptionPane.showMessageDialog(null,
				"Você digitou as pessoas a seguir: " + pessoa1.getNome() + " e " + pessoa2.getNome());

		JOptionPane.showMessageDialog(null,
				"os e-mails cadastrados no sistema são: " + pessoa1.getEmail() 
				+ " e " + pessoa2.getEmail());

		// Alteração de dados internos
		email = JOptionPane.showInputDialog("Digite o novo email da pessoa 1");
		pessoa1.setEmail(email);

		email = JOptionPane.showInputDialog("Digite o novo email da pessoa 2");
		pessoa2.setEmail(email);

		// Conferindo a alteração
		JOptionPane.showMessageDialog(null,
				"os e-mails cadastrados no sistema são: " + pessoa1.getEmail() 
				+ " e " + pessoa2.getEmail());

		// Imprimindo as pessoas
		JOptionPane.showMessageDialog(null, pessoa1.toString());
		JOptionPane.showMessageDialog(null, pessoa2.toString());

	}

}
