package Lista2;
/* Faça uma Programa que receba a idade de uma pessoa e imprima 
 * mensagem de maioridade ou não */

public class L02E04 {
	public static void main(String[] args) {
		int idade;

		idade = InOut.leInt("Informe a sua idade");

		if (idade < 18) {
			InOut.MsgDeInformação("", "Você é menor de idade");
		} else
			InOut.MsgDeInformação("", "Você é maior de idade");
	}
}
