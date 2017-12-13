package Conteudo2;

import javax.swing.JOptionPane;

public class Exerc1 {

	public static void main(String[] args) {
		double saldo, valor, limite;
		String dtaAniv;
		boolean ativo= true;

		// Cria Conta 1
		//saldo = Double.valueOf(JOptionPane.showInputDialog("Digite o saldo."));
		/*saldo = 1000;
		Conta c1 = new Conta(saldo, ativo);
		JOptionPane.showMessageDialog(null, c1.toString());
*/
		// Cria Conta 2
		//saldo = Double.valueOf(JOptionPane.showInputDialog("Digite o saldo."));
		/*saldo = 2000;
		Conta c2 = new Conta(saldo, ativo);
		JOptionPane.showMessageDialog(null, c2.toString());
		*/
		// Cria ContaCorrente
		//saldo = Double.valueOf(JOptionPane.showInputDialog("Digite o saldo."));
		saldo = 3000;
		//limite = Double.valueOf(JOptionPane.showInputDialog("Digite o limite da conta corrente."));
		limite = 10000;
		ContaCorrente cc1 = new ContaCorrente(saldo, limite, ativo);
		JOptionPane.showMessageDialog(null, cc1.toString());
		cc1.obterSaldo();
		
		// Cria ContaPoupanca
		//saldo = Double.valueOf(JOptionPane.showInputDialog("Digite o saldo."));
		saldo = 4000;
		//dtaAniv = JOptionPane.showInputDialog("Digite a data de aniversário");
		dtaAniv = "10/10/2010";
		ContaPoupanca cp1 = new ContaPoupanca(saldo, dtaAniv, ativo);
		JOptionPane.showMessageDialog(null, cp1.toString());

		// Sacar de c1
		/*valor = Double.valueOf(JOptionPane.showInputDialog("Digite o valor."));
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
		*/
		
		/*saqueEmergencialPorConta(c1);
		saqueEmergencialPorConta(c2);*/
		saqueEmergencialPorConta(cc1);
		saqueEmergencialPorConta(cp1);
		
	}

	// Exemplo polimorfismo	
	public static void saqueEmergencialPorConta(Conta conta) {
		final double valorEmergencia = 100;
		Conta c1 = conta;
		c1.sacar(valorEmergencia);
		JOptionPane.showMessageDialog(null, c1.toString());

	}

}
