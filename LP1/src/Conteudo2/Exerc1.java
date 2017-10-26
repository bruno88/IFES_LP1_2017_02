package Conteudo2;

import javax.swing.JOptionPane;

public class Exerc1 {

	public static void main(String[] args) {
		double saldo, valor, limite;
		String dtaAniv;

		// Cria Conta 1
		saldo = Double.valueOf(JOptionPane.showInputDialog("Digite o saldo."));
		Conta c1 = new Conta(saldo);
		JOptionPane.showMessageDialog(null, c1.toString());

		// Cria Conta 2
		saldo = Double.valueOf(JOptionPane.showInputDialog("Digite o saldo."));
		Conta c2 = new Conta(saldo);
		JOptionPane.showMessageDialog(null, c2.toString());
		
		// Cria ContaCorrente
		saldo = Double.valueOf(JOptionPane.showInputDialog("Digite o saldo."));
		limite = Double.valueOf(JOptionPane.showInputDialog("Digite o limite da conta corrente."));
		ContaCorrente cc1 = new ContaCorrente(saldo, limite);
		JOptionPane.showMessageDialog(null, cc1.toString());

		// Cria ContaPoupanca
		saldo = Double.valueOf(JOptionPane.showInputDialog("Digite o saldo."));
		dtaAniv = JOptionPane.showInputDialog("Digite a data de aniversário");
		ContaPoupanca cp1 = new ContaPoupanca(saldo, dtaAniv);
		JOptionPane.showMessageDialog(null, cp1.toString());

		// Sacar de c1
		valor = Double.valueOf(JOptionPane.showInputDialog("Digite o valor."));
		c1.sacar(valor);
		JOptionPane.showMessageDialog(null, c1.toString());

		// Sacar de c2
		valor = Double.valueOf(JOptionPane.showInputDialog("Digite o valor."));
		c2.sacar(valor);
		JOptionPane.showMessageDialog(null, c2.toString());

		// Sacar de cc1
		valor = Double.valueOf(JOptionPane.showInputDialog("Digite o valor."));
		cc1.sacar(valor);
		JOptionPane.showMessageDialog(null, cc1.toString());

		// Sacar de cp1
		valor = Double.valueOf(JOptionPane.showInputDialog("Digite o valor."));
		cp1.sacar(valor);
		JOptionPane.showMessageDialog(null, cp1.toString());
		
	}

}
