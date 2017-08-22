package Lista3;

public class L03E03 {
	public static void main(String[] args) {
		int numAulas, aulasAssistidas;
		double nota1, nota2;

		String saida = "";

		nota1 = InOut.leDouble("Informe a primeira nota");
		nota2 = InOut.leDouble("Informe a segunda nota");
		aulasAssistidas = InOut.leInt("Informe o número de aulas assistidas");
		numAulas = InOut.leInt("Informe o número total de aulas");

		double media = (nota1 + nota2) / 2;
		int percPresenca = (aulasAssistidas * 100) / numAulas;

		if (media >= 6.0 && percPresenca >= 60) {
			saida = "APROVADO";
		} else if (media < 60) {
			saida = "REPROVADO POR NOTA";
		} else {
			saida = "REPROVADO POR FALTA";
		}
		InOut.MsgDeInformação("", saida);
	}
}
