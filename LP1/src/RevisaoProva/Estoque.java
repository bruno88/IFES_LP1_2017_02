package RevisaoProva;

import java.util.ArrayList;

public class Estoque {
	private ArrayList<Ingrediente> ingredCad = new ArrayList<Ingrediente>();
	private ArrayList<Prato> pratosCad = new ArrayList<Prato>();

	public ArrayList<Ingrediente> getIngredCad() {
		return ingredCad;
	}

	public void setIngredCad(ArrayList<Ingrediente> ingredCad) {
		this.ingredCad = ingredCad;
	}

	public ArrayList<Prato> getPratosCad() {
		return pratosCad;
	}

	public void setPratosCad(ArrayList<Prato> pratosCad) {
		this.pratosCad = pratosCad;
	}

	public void cadastrarIngrediente(Ingrediente ingr) {
		this.ingredCad.add(ingr);
	}

	public void removerIngrediente(Ingrediente ingr) {
		this.ingredCad.remove(ingr);
	}

	public void cadastrarPrato(Prato prato) {
		this.pratosCad.add(prato);
	}

	public void removerPrato(Prato prato) {
		this.pratosCad.remove(prato);
	}

	public Prato getPratoPorNome(String nome) {
		for (Prato p1 : pratosCad) {
			if (p1.getNome().equalsIgnoreCase(nome)) {
				return p1;
			}
		}

		return null;
	}

	public Ingrediente getIngredientePorNome(String nome) {
		for (Ingrediente ingr : ingredCad) {
			if (ingr.getNome().equalsIgnoreCase(nome)) {
				return ingr;
			}
		}

		return null;
	}
}
