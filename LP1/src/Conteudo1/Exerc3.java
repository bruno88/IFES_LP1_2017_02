package Conteudo1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exerc3 {

	public static void main(String[] args) {
		boolean sairMenuPrincipal = false, sairMenuPessoas = false, sairMenuContas = false;
		String nome, entrada, saida, strSaldo, strNumero;
		int op, cont;
		double saldo, valor;

		ArrayList<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();
		ArrayList<Conta> contasCadastradas = new ArrayList<Conta>();

		do {
			entrada = JOptionPane.showInputDialog("Digite a opção desejada: " 
					+ "\n1 - Gerenciar Pessoas"
					+ "\n2 - Gerenciar Contas" 
					+ "\n\n0 - Encerrar o programa");

			op = Integer.parseInt(entrada);

			switch (op) {
			case 1:
				do {
					entrada = JOptionPane.showInputDialog("Digite a opção desejada: " 
							+ "\n1 - Criar nova Pessoa"
							+ "\n2 - Exibir dados de todas as pessoas cadastradas"
							+ "\n3 - Consultar os dados de uma Pessoa" 
							+ "\n4 - Excluir uma pessoa\n"
							+ "\n0 - Retornar ao menu anterior");

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
						sairMenuPessoas = true;
						break;

					default:
						JOptionPane.showMessageDialog(null, "Opção Inválida!");
					}
				} while (!sairMenuPessoas);

				break;
			case 2:
				do {
					entrada = JOptionPane.showInputDialog("Digite a opção desejada: " 
							+ "\n1 - Adicionar nova Conta"
							+ "\n2 - Remover Conta" 
							+ "\n3 - Consultar número da Conta" 
							+ "\n4 - Consultar Saldo"
							+ "\n5 - Realizar Saque" 
							+ "\n6 - Realizar Depósito" 
							+ "\n7 - Imprimir todas as contas"
							+ "\n\n0 - Retornar ao menu anterior");

					op = Integer.parseInt(entrada);

					switch (op) {
					// Adicionar nova Conta
					case 1:
						Conta novaConta;

						nome = JOptionPane.showInputDialog("Digite o nome do titular da conta");
						Pessoa p1 = Pessoa.getPessoaPorNome(pessoasCadastradas,nome);
						if (p1 != null) {
							strSaldo = JOptionPane.showInputDialog("Digite o saldo atual");
							if (strSaldo.isEmpty()) {
								novaConta = new Conta(p1);
							} else {
								saldo = Double.parseDouble(strSaldo);
								novaConta = new Conta(p1, saldo);
							}

							contasCadastradas.add(novaConta);
						} else {
							JOptionPane.showMessageDialog(null, "Pessoa não encontrada. \n Cadastre-a na Gerencia de Pessoas!");
						}
						
						
						break;

						// 2 - Remover Conta
					case 2:
						// TODO: Implementar Remover Conta
						break;

						// 3 - Consultar número da Conta
					case 3:
						nome = JOptionPane.showInputDialog("Digite o nome do titular da conta");
						cont = 0;

						for (Conta conta : contasCadastradas) {
							if (conta.getTitular().getNome().equalsIgnoreCase(nome)) {
								JOptionPane.showMessageDialog(null, "Conta número: " + conta.getNumero());
								cont++;
							}
						}

						if (cont == 0) {
							JOptionPane.showMessageDialog(null, "Títular não encontrado");
						}
						break;

						// 4 - Consultar Saldo
					case 4:
						strNumero = JOptionPane.showInputDialog("Digite número da Conta");
						cont = 0;

						for (Conta conta : contasCadastradas) {
							if (conta.getNumero().equalsIgnoreCase(strNumero)) {
								JOptionPane.showMessageDialog(null,
										"Conta número: " + conta.getNumero() 
										+ "\nSaldo atual: " + conta.getSaldo());
								cont++;
							}
						}

						if (cont == 0) {
							JOptionPane.showMessageDialog(null, "Conta não encontrada");
						}
						break;
						// 5 - Realizar Saque
					case 5:
						strNumero = JOptionPane.showInputDialog("Digite número da Conta");
						cont = 0;

						for (Conta conta : contasCadastradas) {
							if (conta.getNumero().equalsIgnoreCase(strNumero)) {
								valor = Double.parseDouble(JOptionPane
										.showInputDialog("Conta encontrada." + "\n Digite o valor a ser sacado"));
								
								if (conta.realizarSaque(valor)) {
									JOptionPane.showMessageDialog(null, "Saque bem sucedido"
											+ "\n Saldo atual: " + conta.getSaldo());
									cont++;
								} else {
									JOptionPane.showMessageDialog(null, "Saque não concluído"
											+ "Você nao pode sacar mais do que possui em saldo");
								}
								
								
							}
						}

						if (cont == 0) {
							JOptionPane.showMessageDialog(null, "Conta não encontrada");
						}
						break;

						// 6 - Realizar Depósito
					case 6:
						strNumero = JOptionPane.showInputDialog("Digite número da Conta");
						cont = 0;

						for (Conta conta : contasCadastradas) {
							if (conta.getNumero().equalsIgnoreCase(strNumero)) {
								valor = Double.parseDouble(JOptionPane
										.showInputDialog("Conta encontrada." + "\n Digite o valor a ser depositado"));
								if (conta.realizarDeposito(valor)) {
									JOptionPane.showMessageDialog(null, "Depósito bem sucedido"
											+ "\n Saldo atual: " + conta.getSaldo());
								}
								cont++;
							}
						}

						if (cont == 0) {
							JOptionPane.showMessageDialog(null, "Conta não encontrada");
						}
						break;

						// 7 - Imprimir todas as contas
					case 7:
						for (Conta conta : contasCadastradas) {
							JOptionPane.showMessageDialog(null, conta.toString());
						}
						break;
					case 0:
						sairMenuContas = true;
						break;

					default:
						JOptionPane.showMessageDialog(null, "Opção Inválida!");
					}
				} while (!sairMenuContas);
				break;
			case 0:
				sairMenuPrincipal = true;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
			}

		} while (!sairMenuPrincipal);
		JOptionPane.showMessageDialog(null, "Programa encerrado por comando do usuário!");
		System.exit(0);
	}

}
