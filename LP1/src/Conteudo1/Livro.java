package Conteudo1;

import java.util.ArrayList;

public class Livro {
	private String titulo, resumo, autor, editora;
	private int anoPublicacao;
	private ArrayList<String> palavrasChave = new ArrayList<String>();

	public Livro(String titulo, String autor, String editora) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public ArrayList<String> getPalavrasChave() {
		return palavrasChave;
	}

	public void setPalavrasChave(ArrayList<String> palavrasChave) {
		this.palavrasChave = palavrasChave;
	}

	public void adicionarPalavraChave(String palavra) {
		this.palavrasChave.add(palavra);
	}

	public void removerPalavraChave(String palavra) {
		this.palavrasChave.remove(palavra);
	}

	public static Livro getLivroPorTitulo(ArrayList<Livro> livrosCadastrados, String titulo) {
		Livro l1;
		
		for (int i = 0; i < livrosCadastrados.size(); i++) {
			l1 = livrosCadastrados.get(i);
			if (l1.getTitulo().equalsIgnoreCase(titulo)) {
				return l1;
			}
		}
		/*for (Livro livro : livrosCadastrados) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				return livro;
			}
		}*/
		return null;
	}

	public static Livro getLivroPorAutor(ArrayList<Livro> livrosCadastrados, String titulo) {
		for (Livro livro : livrosCadastrados) {
			if (livro.getAutor().equalsIgnoreCase(titulo)) {
				return livro;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", resumo=" + resumo + ", autor=" + autor + ", editora=" + editora
				+ ", anoPublicacao=" + anoPublicacao + ", palavrasChave=" + palavrasChave + "]";
	}

}
