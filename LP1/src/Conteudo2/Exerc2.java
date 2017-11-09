package Conteudo2;

public class Exerc2 {

	public static void main(String[] args) {
		int senha = 1234;
		
		Gerente g1 = new Gerente();
		g1.setNome("Bruno");
		
		login(g1, senha);
		
		Diretor d1 = new Diretor();
		d1.setNome("Pedro");
		login(d1, senha);
		
		Secretario s1 = new Secretario();
		//login(s1, senha);
		
	}
	
	public static void login (Autenticavel a1, int senha) {
		a1.autentica(senha);
		
	}

}
