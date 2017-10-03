package RevisaoProva;

import java.util.ArrayList;

//import javax.swing.JOptionPane;

public class Cardapio {
	ArrayList<Prato> pratosEmCardapio = new ArrayList<Prato>();

	public ArrayList<Prato> getPratosEmCardapio() {
		return pratosEmCardapio;
	}

	public void setPratosEmCardapio(ArrayList<Prato> pratosEmCardapio) {
		this.pratosEmCardapio = pratosEmCardapio;
	}

	public void inserirPrato(Prato prato) {
		this.pratosEmCardapio.add(prato);
	}

	public void removerPrato(Prato prato) {
		this.pratosEmCardapio.remove(prato);
	}

	public Prato getPratoPorNome(String nome) {
		for (Prato p1 : pratosEmCardapio) {
		//for ( int i = 0; i < pratosEmCardapio.size(); i++) {
			if (p1.getNome().equalsIgnoreCase(nome)) {
			//if (pratosEmCardapio.get(i).getNome().equalsIgnoreCase(nome)) {
				return p1;
			}
		}

		return null;
	}

	
	public String imprimirCardapio() {
		int cont = 0;
		String saida = "Cardápio: \n\n";
		for (Prato prato : pratosEmCardapio) {
			saida += prato.toString();
			cont++;
		}

		if (cont == 0) {
			return null;
		} else {
			return saida;
		}

	}

}
