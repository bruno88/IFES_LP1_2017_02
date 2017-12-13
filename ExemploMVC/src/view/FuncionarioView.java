package view;

import java.util.List;
import java.util.Scanner;

import entity.Funcionario;
import bll.FuncionarioBLL;

public class FuncionarioView{
	
	public void Gerenciar(){
		int opcao, codigo;
	
		Scanner teclado = new Scanner(System.in);
		List<Funcionario> objetos = null;
		Funcionario objeto = null;
		FuncionarioBLL controle = new FuncionarioBLL();
				
		do 
		{ 
			System.out.println("Gerenciar Funcionario");
			System.out.println("Opções");		
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Alterar");
			System.out.println("3 - Excluir");
			System.out.println("4 - Listar");
			System.out.println("0 - Voltar");
			System.out.println("\nDigite sua opção: ");
			opcao = teclado.nextInt();
			
			switch (opcao)
			{
				
				case 1:  
					
					objeto = new Funcionario();
					
					System.out.println("Nome: ");
					objeto.setNome(teclado.next());
					System.out.println("Idade: ");
					objeto.setIdade(teclado.nextInt());	
					System.out.println("Função: ");
					objeto.setFuncao(teclado.next());	
					System.out.println("Salario: ");
					objeto.setSalario(teclado.nextDouble());	
					
					controle.salvar(objeto);
					
					
					break;
						
					
				case 2: 
					
					objetos = controle.listar();
					for (Funcionario c: objetos) {
						System.out.println("Codigo: " + c.getIdfuncionario() + 
				                   " Nome: " + c.getNome() + 
	        	                   " Idade: " + c.getIdade()+
									"Salario: " + c.getSalario()+
									"Função: " + c.getFuncao());
					}
					System.out.println("Codigo para alteracao: ");
					codigo = (teclado.nextInt());
					objeto = controle.buscarPorCodigo(codigo);
				
					System.out.println("Nome: ");
					objeto.setNome(teclado.next());
					System.out.println("Idade: ");
					objeto.setIdade(teclado.nextInt());	
					System.out.println("Função: ");
					objeto.setFuncao(teclado.next());	
					System.out.println("Salario: ");
					objeto.setSalario(teclado.nextDouble());			
					controle.salvar(objeto);
					break;
					
					
				case 3:
					objetos = controle.listar();
					for (Funcionario c: objetos) {
						System.out.println("Codigo: " + c.getIdfuncionario() + 
           				                   " Nome: " + c.getNome() + 
			        	                   " Idade: " + c.getIdade()+
											"Salario: " + c.getSalario()+
											"Função: " + c.getFuncao());
					}					
					
					System.out.println("Codigo para exclusao: ");
					codigo = (teclado.nextInt());
					objeto = controle.buscarPorCodigo(codigo);
					controle.excluir(objeto);					
					break;					
					
				case 4:
					objetos = controle.listar();
					for (Funcionario c: objetos) {
						System.out.println("Codigo: " + c.getIdfuncionario() + 
				                   " Nome: " + c.getNome() + 
	        	                   " Idade: " + c.getIdade()+
									"Salario: " + c.getSalario()+
									"Função: " + c.getFuncao());
						
						
					}	
					break;
					
				default:
					System.out.println("Opção inválida.");
				break;					
			}
			
			

		} 
		while (opcao != 0);
	}
}
