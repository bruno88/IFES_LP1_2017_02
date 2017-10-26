package RevisaoComIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Iterator ite = null;
		Ingrediente novoIngr, ingrConsultado;
		Prato novoPrato, pratoConsultado;
		boolean continuarMenu = true;
		String entrada = "", saida = "";
		String nome, formato, origem, gosto;
		int op, tempo;
		double preco;

		Estoque estoque = new Estoque();
		Cardapio cardapio = new Cardapio();
		

		
	
		do {
			entrada = JOptionPane.showInputDialog("Digite a opção desejada: " 
					+ "\n1 - Adicionar novo Ingrediente"
					+ "\n2 - Adicionar novo Prato" 
					+ "\n3 - Remover Prato" 
					+ "\n4 - Adicionar Prato ao Cardápio"
					+ "\n5 - Remover Prato do Cardápio"
					+ "\n6 - Exibir Cardápio"
					+ "\n7 - Adicionar um Ingrediente à um Prato"
					+ "\n8 - Remover um Ingrediente de um Prato"
					+ "\n9 - Listar os Ingredientes de um Prato"
					+ "\n\n0 - Encerrar o programa");

			op = Integer.parseInt(entrada);

			switch (op) {
			
			// 1 - Adicionar novo Ingrediente
			case 1:
				nome = JOptionPane.showInputDialog(null, "Digite o nome do ingrediente");
				formato = JOptionPane.showInputDialog(null, "Digite o formato do ingrediente");
				origem = JOptionPane.showInputDialog(null, "Digite a origem do ingrediente");
				gosto = JOptionPane.showInputDialog(null, "Digite o \"sabor\" do ingrediente");
				
				novoIngr = new Ingrediente(nome, formato, origem, gosto);
				estoque.cadastrarIngrediente(novoIngr);
				saida = "Ingrediente cadastrado com sucesso !";
				break;
			
			// 2 - Adicionar novo Prato
			case 2:
				nome = JOptionPane.showInputDialog(null, "Digite o nome do Prato");
				origem = JOptionPane.showInputDialog(null, "Digite a origem do Prato");
				tempo = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o tempo de preparo em minutos"));
				preco = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o preço do Prato"));
				
				novoPrato = new Prato(nome, origem, tempo, preco);
				estoque.cadastrarPrato(novoPrato);
				saida = "Prato cadastrado com sucesso !";
				break;
			
			// 3 - Remover Prato
			case 3:
				nome = JOptionPane.showInputDialog(null, "Digite o nome do prato a ser consultado");

				ite = estoque.getPratosCad().iterator();

				pratoConsultado = (Prato) Utils.consultaPorNome(ite, nome);
				if (pratoConsultado == null) {
					saida = "Prato não encontrado";
				} else {
					Utils.removePorNome(ite, nome);
					saida = pratoConsultado.getNome() + " removido com sucesso";
				}
				break;
				
			// 4 - Adicionar Prato ao Cardápio
			case 4:
				nome = JOptionPane.showInputDialog(null, "Digite o nome do prato a ser consultado");
				ite = estoque.getPratosCad().iterator();
				pratoConsultado = (Prato) Utils.consultaPorNome(ite, nome); 
				if (pratoConsultado == null) {
					saida = "Prato não encontrado";
				} else {
					cardapio.inserirPrato(pratoConsultado);
					saida = pratoConsultado.getNome() + " adicionado no cardápio com sucesso";
				}
				break;
				
			// 5 - Remover Prato do Cardápio
			case 5:
				nome = JOptionPane.showInputDialog(null, "Digite o nome do prato a ser consultado");
				ite = estoque.getPratosCad().iterator();
				pratoConsultado = (Prato) Utils.consultaPorNome(ite, nome);
				if (pratoConsultado == null) {
					saida = "Prato não encontrado";
				} else {
					ite = cardapio.getPratosEmCardapio().iterator();
					Utils.removePorNome(ite, nome);
					saida = pratoConsultado.getNome() + " removido do cardápio com sucesso";
				}
				break;
			
			// 6 - Exibir Cardápio 
			case 6:
				saida = cardapio.imprimirCardapio();
				if (saida == null) {
					saida = "Nenhum Prato em Cardápio";
				}
				break;
			
			// 7 - Adicionar um Ingrediente à um Prato
			case 7:
				nome = JOptionPane.showInputDialog(null, "Digite o nome do prato a ser consultado");
				ite = estoque.getPratosCad().iterator();
				pratoConsultado = (Prato) Utils.consultaPorNome(ite, nome);
				if (pratoConsultado == null) {
					saida = "Prato não encontrado";
				} else {
					nome = JOptionPane.showInputDialog(null, "Digite o nome do ingrediente a ser consultado");
					ite = estoque.getIngredCad().iterator();
					ingrConsultado = (Ingrediente) Utils.consultaPorNome(ite, nome);
					if (ingrConsultado == null) {
						saida = "Ingrediente não encontrado";
					} else {
						pratoConsultado.addIngrediente(ingrConsultado);
						saida = ingrConsultado.getNome() + " adicionado no prato " + pratoConsultado.getNome();	
					}
				}
				break;
				
			// 8 - Remover um Ingrediente de um Prato 
			case 8:
				nome = JOptionPane.showInputDialog(null, "Digite o nome do prato a ser consultado");
				ite = estoque.getPratosCad().iterator();
				pratoConsultado = (Prato) Utils.consultaPorNome(ite, nome);
				
				if (pratoConsultado == null) {
					saida = "Prato não encontrado";
				} else {
					nome = JOptionPane.showInputDialog(null, "Digite o nome do ingrediente a ser consultado");
					ite = estoque.getIngredCad().iterator();
					ingrConsultado = (Ingrediente) Utils.consultaPorNome(ite, nome);
					if (ingrConsultado == null) {
						saida = "Ingrediente não encontrado";
					} else {
						ite = pratoConsultado.getIngredientes().iterator();
						Utils.removePorNome(ite, nome);
						saida = ingrConsultado.getNome() + " removido do prato " + pratoConsultado.getNome();	
					}
				}
				break;
				
			// 9 - Listar os Ingredientes de um Prato
			case 9:
				nome = JOptionPane.showInputDialog(null, "Digite o nome do prato a ser consultado");
				ite = estoque.getPratosCad().iterator();
				pratoConsultado = (Prato) Utils.consultaPorNome(ite, nome);
				if (pratoConsultado == null) {
					saida = "Prato não encontrado";
				} else {
					saida = pratoConsultado.listaIngredientes();
				}
				break;
			case 0:
				continuarMenu = false;
				saida = "Programa encerrado por comando do usuário!";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
			}
			JOptionPane.showMessageDialog(null, saida);
		} while (continuarMenu);

		System.exit(0);
	}

}
