package Lista4;

public class L04E03 {
	public static void main(String[] args) {
		double total = 0;
		int op;

		// Menu de Lanches
		String textoMenu = "Informe";
		textoMenu += "\n100 - Cachorro quente";
		textoMenu += "\n101 - Bauru simples";
		textoMenu += "\n102 - Bauru com ovo";
		textoMenu += "\n103 - Hambúrguer";
		textoMenu += "\n104 - Cheeseburguer ";

		op = InOut.leInt(textoMenu);

		// Obtém Lanche
		switch (op) {
		case 100:
			total += 12;
			break;
		case 101:
			total += 23;
			break;
		case 102:
			total += 25;
			break;
		case 103:
			total += 12;
			break;
		case 104:
			total += 13;
			break;
		default:
			InOut.MsgDeInformação("", "Valor inválido! ");
			System.exit(0);
		}
		// Menu de Refrigerantes
		textoMenu = "Informe";
		textoMenu += "\n95 - Refrigerante pequeno";
		textoMenu += "\n96 - Refrigerante médio";
		textoMenu += "\n97 - Refrigerante grande";

		// Obtém Refrigerante
		op = InOut.leInt(textoMenu);

		switch (op) {
		case 95:
			if (op != 101 && op != 102) {
				total += 5;
			}
			break;
		case 96:
			if (op != 101 && op != 102) {
				total += 7;
			}
			break;
		case 97:
			if (op != 101 && op != 102) {
				total += 9;
			}
			break;
		default:
			InOut.MsgDeInformação("", "Valor inválido! ");
			System.exit(0);
		}

		InOut.MsgDeInformação("", "Total do seu lanche = R$" + total);
	}
}
