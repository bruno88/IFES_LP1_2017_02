package RevisaoComIterator;

import java.util.ArrayList;
import java.util.Iterator;

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

	

	
}
