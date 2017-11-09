package Conteudo2;

public class Diretor extends Funcionario implements Autenticavel {

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		System.out.println("Eu imprimi o Autenticavel: " + this.getNome());
		return false;
	}
	
}
