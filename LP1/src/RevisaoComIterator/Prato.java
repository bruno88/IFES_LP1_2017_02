package RevisaoComIterator;

import java.util.ArrayList;

public class Prato {
	private String nome, origem;
	private int tempoPreparo;
	private double preco;
	private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

	public Prato(String nome, String origem, int tempo, double preco) {
		this.nome = nome;
		this.origem = origem;
		this.tempoPreparo = tempo;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public int getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(int tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public void addIngrediente(Ingrediente ingr) {
		this.ingredientes.add(ingr);
	}

	public void removeIngrediente(Ingrediente ingr) {
		this.ingredientes.remove(ingr);
	}

	@Override
	public String toString() {
		return nome + "(Origem: " + origem + ", " + tempoPreparo + "min de preparo " 
				+ "R$ " + preco + ")\nIngredientes desse Prato: \n" 
				+ listaIngredientes() + "\n\n";
	}

	public String listaIngredientes() {
		String saida = "";
		for (Ingrediente ingrediente : ingredientes) {
			saida += ingrediente.toString();
		}
		return saida;
		
	}

}
