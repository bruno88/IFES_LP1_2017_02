package Conteudo3;

import java.util.ArrayList;

public class GerenciadorDeDesenhos {
	ArrayList<Desenhavel> objNaTela = new ArrayList<Desenhavel>();

	public void addDesenho(Desenhavel d) {
		this.objNaTela.add(d);
	}

	public void removeDesenho(Desenhavel d) {
		this.objNaTela.remove(d);
	}

	public void atualizarTela() {
		for (Desenhavel desenho : objNaTela) {
			desenho.desenha();
			System.out.println("(do gerenciador)");
		}
	}
}
