package Conteudo2;

public class SistemaInterno {
	private int senha = 1234;

	public void login(Autenticavel funcionario) {
		boolean confirmacao = funcionario.autentica(senha);
		
		// TODO: Realiza o processo de login

	}
}
