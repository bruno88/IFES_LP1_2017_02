package Conteudo2;

import java.util.ArrayList;

public class Gerente extends Funcionario implements Autenticavel {
	ArrayList<Funcionario> subordinados = new ArrayList<Funcionario>();
	int anoVigencia;
	
	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		System.out.println("Eu imprimi o Autenticavel: " + this.getNome());
		return false;
	}		

	
}
