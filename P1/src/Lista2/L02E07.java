package Lista2;
// Faça um programa que pergunte em que ano você nasceu e exiba quantos 
// anos você tem. Exiba também se você é mais velho que 18 anos inclusive, 
// se está entre 15 e 18 anos, ou se tem menos que 15 anos. 

public class L02E07 {
	public static void main(String[] args) {
		int anoNasc, idadeAtual;
		final int anoAtual = 2017;

		anoNasc = InOut.leInt("Informe o ano do seu nascimento");
		idadeAtual = anoAtual - anoNasc;
		
		String saida = "Você está com " + idadeAtual + " anos.";
		
		if (idadeAtual < 18) {
			saida += "\nVocê é menor de idade";
		} else
			saida += "\nVocê é maior de idade";
		InOut.MsgDeInformação("", saida);
	}
}
