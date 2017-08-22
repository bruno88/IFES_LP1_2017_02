package Lista2;
// Faça um Programa que receba dois números e imprima o menor dos dois.

public class L02E06 {
	public static void main(String[] args) {
		int num1, num2;

		num1 = InOut.leInt("Digite o primeiro número");
		num2 = InOut.leInt("Digite o segundo número");

		if (num1 > num2) {
			InOut.MsgDeInformação("", "O primeiro número (" + num1 + ") é maior que o segundo número (" + num2 + ")");
		} else {
			InOut.MsgDeInformação("", "O segundo número (" + num2 + ") é maior que o primeiro número (" + num1 + ")");
		}

	}
}
