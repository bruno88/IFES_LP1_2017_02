package CorrecaoProva1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int op, op2;
		String entrada = "", result = "", dataSaida, dataChegada;
		boolean continuarExterno = true, continuarInterno = true;
		Cliente c1;
		Endereco e1;
		Voo v1;
		Aviao a1;

		// Criando uma inst�ncia de Controle
		Controle controle = new Controle();

		do {
			entrada = JOptionPane.showInputDialog("Digite a op��o desejada: " + 
							"\n1 - Cadastro de Clientes" +
							"\n2 - Cadastro de Avi�es" +
							"\n3 - Controle de V�o" +
							"\n0 - Encerrar programa");

			op = Integer.parseInt(entrada);

			switch (op) {

			case 1:

				do {
					result = "";
					continuarInterno = true;
					entrada = JOptionPane.showInputDialog("Digite a op��o desejada: " + "\n1 - Cadastrar Novo Cliente"
							+ "\n2 - Remover Cadastro de Cliente" 
							+ "\n3 - Cadastrar Novo Endere�o"
							+ "\n4 - Remover Endere�o" 
							+ "\n5 - Vincular Endere�o � Cliente"
							+ "\n6 - Desvincular Endere�o � Cliente" 
							+ "\n0 - Retornar ao Menu Anterior");

					op2 = Integer.parseInt(entrada);

					switch (op2) {

					case 1:	
						c1 = controle.addClientes();
						result = c1.getNome() + " adicionado com Sucesso!";
						break;
					case 2:
						String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente:");
						c1 = controle.ConsultaClientePorNome(nome);

						if (c1 == null) {
							result = "Cliente n�o encontrado";
						} else {
							controle.removeCliente(c1);
							result = c1.getNome() + 
									" removido com sucesso";
						}

						break;
					case 3:
						e1 = controle.addEnderecos();
						result = "Endere�o Adicionado com Sucesso!";
						break;
					case 4:
						String CEP = JOptionPane.showInputDialog(null, 
								"Digite o CEP:");
						e1 = controle.consultaEnderecosPorCEP(CEP);

						if (e1 == null) {
							result = "Endere�o n�o encontrado";
						} else {
							controle.removeEndereco(e1);
							result = "Endere�o removido com sucesso";
						}
						break;
					case 5:
						CEP = JOptionPane.showInputDialog(null, 
								"Digite o CEP do Endere�o");
						e1 = controle.consultaEnderecosPorCEP(CEP);
						if (e1 == null) {
							result = "Endere�o n�o encontrado";
						} else {
							nome = JOptionPane.showInputDialog(null, 
									"Digite o CEP do Endere�o");
							c1 = controle.ConsultaClientePorNome(nome);
							if (c1 == null) {
								result = "Cliente n�o encontrado";
							} else {
								c1.addEnderecos(e1);
								result = "Adicionado Endere�o ao " + 
											c1.getNome();
							}
						}
						break;
					case 6:
						CEP = JOptionPane.showInputDialog(null, 
								"Digite o CEP do Endere�o");
						e1 = controle.consultaEnderecosPorCEP(CEP);
						if (e1 == null) {
							result = "Endere�o n�o encontrado";
						} else {
							nome = JOptionPane.showInputDialog(null, 
									"Digite o CEP do Endere�o");
							c1 = controle.ConsultaClientePorNome(nome);
							if (c1 == null) {
								result = "Cliente n�o encontrado";
							} else {
								c1.removeEnderecos(e1);
								result = "Adicionado Endere�o ao " + 
											c1.getNome();
							}
						}
						break;
					case 0:
						continuarInterno = false;
						break;
					default:
						result = "Op��o Inv�lida";
					}
					JOptionPane.showMessageDialog(null, 
							result);
				} while (continuarInterno);
				break;
			case 2:
				continuarInterno = true;

				do {
					result = "";
					entrada = JOptionPane.showInputDialog("Digite a op��o desejada: " + 
							"\n1 - Cadastrar Novo Avi�o" + 
							"\n2 - Remover Avi�o" + 
							"\n0 - Retornar ao Menu Anterior");

					op2 = Integer.parseInt(entrada);

					switch (op2) {

					case 1:
						a1 = controle.addAvioes();
						result = a1.getModelo() + 
								" adicionado com Sucesso!";
						break;
					case 2:
						String modelo = JOptionPane.showInputDialog(null, 
								"Digite o modelo do Avi�o:");
						a1 = controle.consultaAvioesPorModelo(modelo);

						if (a1 == null) {
							result = "Avi�o n�o encontrado";
						} else {
							controle.removeAviao(a1);
							result = a1.getModelo() + 
									" removido com sucesso";
						}
						break;
					case 0:
						continuarInterno = false;
						break;
					default:
						result = "Op��o Inv�lida";
					}
					JOptionPane.showMessageDialog(null, 
							result);
				} while (continuarInterno);
				break;
			case 3:
				do {
					result = "";
					entrada = JOptionPane.showInputDialog("Digite a op��o desejada: " + 
							"\n1 - Cadastrar V�o"
							+ "\n2 - Reservar Assento para Cliente" 
							+ "\n3 - Cancelar Reserva de Assento para Cliente"
							+ "\n0 - Retornar ao Menu Anterior");

					op2 = Integer.parseInt(entrada);

					switch (op2) {

					case 1:
						controle.addVoos();
						result = "V�o Adicionado com Sucesso!";
						break;
					case 2:
						dataSaida = JOptionPane.showInputDialog(null, 
								"Digite a data de sa�da do V�o");
						dataChegada = JOptionPane.showInputDialog(null, 
								"Digite a data de sa�da do V�o");
						v1 = controle.consultaVooPorDatas(dataSaida, dataChegada);

						if (v1 == null) {
							result = "V�o n�o encontrado";
						} else {
							String nome = JOptionPane.showInputDialog(null,
									"Digite o nome do cliente a ser "
									+ " inclu�do no v�o");
							c1 = controle.ConsultaClientePorNome(nome);
							if (c1 == null) {
								result = "Cliente n�o encontrado";
							} else {
								int numAssento = Integer.valueOf(JOptionPane.showInputDialog(null,
										"Digite o n�mero do assento "));
								Assento assento = new Assento(c1, numAssento);
								v1.reservarAssento(assento);
								result = c1.getNome() + " adicionado ao v�o de " + 
								v1.getCidadeOrigem() + " � " + 
								v1.getCidadeDestino() + " assento " + 
								numAssento;
							}

						}
						break;
					case 3:
						dataSaida = JOptionPane.showInputDialog(null, "Digite a data de sa�da do V�o");
						dataChegada = JOptionPane.showInputDialog(null, "Digite a data de sa�da do V�o");
						v1 = controle.consultaVooPorDatas(dataSaida, dataChegada);

						if (v1 == null) {
							result = "V�o n�o encontrado";
						} else {
							String nome = JOptionPane.showInputDialog(null,
									"Digite o nome do cliente a ter a reserva cancelada");
							Assento assento = v1.ConsultaAssentoPorNomeCliente(nome);
							if (assento == null) {
								result = "Reserva n�o encontrada";
							} else {
								v1.cancelarAssento(assento);
								result = "Reserva do cliente " + nome + " removida com sucesso";
							}
						}

						break;
					case 0:
						continuarInterno = false;
						break;
					default:
						result = "Op��o Inv�lida";
					}
					JOptionPane.showMessageDialog(null, 
							result);
				} while (continuarInterno);
				break;
			case 0:
				continuarExterno = false;
				result = "Programa encerrado por comando do usu�rio!";
				break;
			default:
				result = "Op��o Inv�lida";
			}
			JOptionPane.showMessageDialog(null, 
					result);
		} while (continuarExterno);

	}

}
