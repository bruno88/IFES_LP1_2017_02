package Lista2;

public class L02E09 {
	public static void main(String[] args) {
		int opcao;
		int num1, num2;

		opcao = InOut.leInt("Digite o código da operação\n "
				+ "1 - Soma\n "
				+ "2 - Raíz Quadrada\n "
				+ "0 - Finalizar");

		String saida = "O resultado da operação é: \n";

		// Soma
		if (opcao == 1) {
			num1 = InOut.leInt("Digite um número");
			num2 = InOut.leInt("Digite um número");
			int soma = num1 + num2;
			saida += "A soma é: " + soma ;
		} else if (opcao == 2) {
			num1 = InOut.leInt("Digite um número");
			double raiz = Math.sqrt(num1);
			saida += "A raíz quadrada de " + num1 + " = " + raiz;
		} else if (opcao == 0) {
			saida = "Programa encerrado pelo usuário!";
		} else {
			saida = "Você digitou um valor inválido!";
		}
		InOut.MsgDeInformação("", saida);

	}
}
