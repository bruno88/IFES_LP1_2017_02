package RevisaoProva;

public class Ingrediente {
	private String nome, formato, origem, paladar;

	public Ingrediente(String nome, String formato, String origem, String paladar) {
		this.nome = nome;
		this.formato = formato;
		this.origem = origem;
		this.paladar = paladar;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getPaladar() {
		return paladar;
	}

	public void setPaladar(String paladar) {
		this.paladar = paladar;
	}

	@Override
	public String toString() {
		return nome + " (" + formato + ", " + origem + " - " + paladar + ")\n";
	}

}
