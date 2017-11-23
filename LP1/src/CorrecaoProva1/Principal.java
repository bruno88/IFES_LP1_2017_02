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

		// Criando uma instância de Controle
		Controle controle = new Controle();

		do {
			entrada = JOptionPane.showInputDialog("Digite a opção desejada: " + 
							"\n1 - Cadastro de Clientes" +
							"\n2 - Cadastro de Aviões" +
							"\n3 - Controle de Vôo" +
							"\n0 - Encerrar programa");

			op = Integer.parseInt(entrada);

			switch (op) {

			case 1:

				do {
					result = "";
					continuarInterno = true;
					entrada = JOptionPane.showInputDialog("Digite a opção desejada: " + "\n1 - Cadastrar Novo Cliente"
							+ "\n2 - Remover Cadastro de Cliente" 
							+ "\n3 - Cadastrar Novo Endereço"
							+ "\n4 - Remover Endereço" 
							+ "\n5 - Vincular Endereço à Cliente"
							+ "\n6 - Desvincular Endereço à Cliente" 
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
							result = "Cliente não encontrado";
						} else {
							controle.removeCliente(c1);
							result = c1.getNome() + 
									" removido com sucesso";
						}

						break;
					case 3:
						e1 = controle.addEnderecos();
						result = "Endereço Adicionado com Sucesso!";
						break;
					case 4:
						String CEP = JOptionPane.showInputDialog(null, 
								"Digite o CEP:");
						e1 = controle.consultaEnderecosPorCEP(CEP);

						if (e1 == null) {
							result = "Endereço não encontrado";
						} else {
							controle.removeEndereco(e1);
							result = "Endereço removido com sucesso";
						}
						break;
					case 5:
						CEP = JOptionPane.showInputDialog(null, 
								"Digite o CEP do Endereço");
						e1 = controle.consultaEnderecosPorCEP(CEP);
						if (e1 == null) {
							result = "Endereço não encontrado";
						} else {
							nome = JOptionPane.showInputDialog(null, 
									"Digite o CEP do Endereço");
							c1 = controle.ConsultaClientePorNome(nome);
							if (c1 == null) {
								result = "Cliente não encontrado";
							} else {
								c1.addEnderecos(e1);
								result = "Adicionado Endereço ao " + 
											c1.getNome();
							}
						}
						break;
					case 6:
						CEP = JOptionPane.showInputDialog(null, 
								"Digite o CEP do Endereço");
						e1 = controle.consultaEnderecosPorCEP(CEP);
						if (e1 == null) {
							result = "Endereço não encontrado";
						} else {
							nome = JOptionPane.showInputDialog(null, 
									"Digite o CEP do Endereço");
							c1 = controle.ConsultaClientePorNome(nome);
							if (c1 == null) {
								result = "Cliente não encontrado";
							} else {
								c1.removeEnderecos(e1);
								result = "Adicionado Endereço ao " + 
											c1.getNome();
							}
						}
						break;
					case 0:
						continuarInterno = false;
						break;
					default:
						result = "Opção Inválida";
					}
					JOptionPane.showMessageDialog(null, 
							result);
				} while (continuarInterno);
				break;
			case 2:
				continuarInterno = true;

				do {
					result = "";
					entrada = JOptionPane.showInputDialog("Digite a opção desejada: " + 
							"\n1 - Cadastrar Novo Avião" + 
							"\n2 - Remover Avião" + 
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
								"Digite o modelo do Avião:");
						a1 = controle.consultaAvioesPorModelo(modelo);

						if (a1 == null) {
							result = "Avião não encontrado";
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
						result = "Opção Inválida";
					}
					JOptionPane.showMessageDialog(null, 
							result);
				} while (continuarInterno);
				break;
			case 3:
				do {
					result = "";
					entrada = JOptionPane.showInputDialog("Digite a opção desejada: " + 
							"\n1 - Cadastrar Vôo"
							+ "\n2 - Reservar Assento para Cliente" 
							+ "\n3 - Cancelar Reserva de Assento para Cliente"
							+ "\n0 - Retornar ao Menu Anterior");

					op2 = Integer.parseInt(entrada);

					switch (op2) {

					case 1:
						controle.addVoos();
						result = "Vôo Adicionado com Sucesso!";
						break;
					case 2:
						dataSaida = JOptionPane.showInputDialog(null, 
								"Digite a data de saída do Vôo");
						dataChegada = JOptionPane.showInputDialog(null, 
								"Digite a data de saída do Vôo");
						v1 = controle.consultaVooPorDatas(dataSaida, dataChegada);

						if (v1 == null) {
							result = "Vôo não encontrado";
						} else {
							String nome = JOptionPane.showInputDialog(null,
									"Digite o nome do cliente a ser "
									+ " incluído no vôo");
							c1 = controle.ConsultaClientePorNome(nome);
							if (c1 == null) {
								result = "Cliente não encontrado";
							} else {
								int numAssento = Integer.valueOf(JOptionPane.showInputDialog(null,
										"Digite o número do assento "));
								Assento assento = new Assento(c1, numAssento);
								v1.reservarAssento(assento);
								result = c1.getNome() + " adicionado ao vôo de " + 
								v1.getCidadeOrigem() + " à " + 
								v1.getCidadeDestino() + " assento " + 
								numAssento;
							}

						}
						break;
					case 3:
						dataSaida = JOptionPane.showInputDialog(null, "Digite a data de saída do Vôo");
						dataChegada = JOptionPane.showInputDialog(null, "Digite a data de saída do Vôo");
						v1 = controle.consultaVooPorDatas(dataSaida, dataChegada);

						if (v1 == null) {
							result = "Vôo não encontrado";
						} else {
							String nome = JOptionPane.showInputDialog(null,
									"Digite o nome do cliente a ter a reserva cancelada");
							Assento assento = v1.ConsultaAssentoPorNomeCliente(nome);
							if (assento == null) {
								result = "Reserva não encontrada";
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
						result = "Opção Inválida";
					}
					JOptionPane.showMessageDialog(null, 
							result);
				} while (continuarInterno);
				break;
			case 0:
				continuarExterno = false;
				result = "Programa encerrado por comando do usuário!";
				break;
			default:
				result = "Opção Inválida";
			}
			JOptionPane.showMessageDialog(null, 
					result);
		} while (continuarExterno);

	}

}
