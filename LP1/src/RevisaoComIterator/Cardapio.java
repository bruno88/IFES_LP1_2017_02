package RevisaoComIterator;

import java.util.ArrayList;
import java.util.Iterator;

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
