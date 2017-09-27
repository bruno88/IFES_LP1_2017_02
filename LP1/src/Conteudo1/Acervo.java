package Conteudo1;

import java.util.ArrayList;

public class Acervo {
	private ArrayList<Livro> livrosCadastrados = new ArrayList<Livro>();
	
	private void Acervo() {
		// TODO Auto-generated method stub

	}

	public ArrayList<Livro> getLivrosCadastrados() {
		return livrosCadastrados;
	}

	public void setLivrosCadastrados(ArrayList<Livro> livrosCadastrados) {
		this.livrosCadastrados = livrosCadastrados;
	}
	
	public Livro getLivroPorTitulo(String titulo) {
		Livro l1;
		
		for (int i = 0; i < this.livrosCadastrados.size(); i++) {
			l1 = this.livrosCadastrados.get(i);
			if (l1.getTitulo().equalsIgnoreCase(titulo)) {
				return l1;
			}
		}
		return null;
	}
	
	public Livro getLivroPorAutor(String titulo) {
		for (Livro livro : this.livrosCadastrados) {
			if (livro.getAutor().equalsIgnoreCase(titulo)) {
				return livro;
			}
		}
		return null;
	}
	
}
