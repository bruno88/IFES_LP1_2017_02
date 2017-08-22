package Lista2;
/* Faça uma Programa que receba a idade de um atleta e
 * imprima a sua categoria seguindo as regras:
Infantil A 5 - 7 anos
Infantil B 8 - 10 anos
Juvenil A 11- 13 anos
Juvenil B 14- 17 anos
Sênior maiores de 18 anos
*/

public class L02E05 {
	public static void main(String[] args) {
		int idade;

		idade = InOut.leInt("Informe a sua idade");

		if (idade >= 5 && idade <= 7) {
			InOut.MsgDeInformação("", "Sua categoria é Infantil A");
		} else if (idade >= 8 && idade <= 10) {
			InOut.MsgDeInformação("", "Sua categoria é Infantil B");
		} else if (idade >= 11 && idade <= 13) {
			InOut.MsgDeInformação("", "Sua categoria é Juvenil A");
		} else if (idade >= 13 && idade <= 17) {
			InOut.MsgDeInformação("", "Sua categoria é Juvenil B");
		} else {
			InOut.MsgDeInformação("", "Sua categoria é Senior");
		}

	}
}
