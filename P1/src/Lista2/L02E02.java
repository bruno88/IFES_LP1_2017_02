package Lista2;
/* Modifique o algoritmo da média do aluno “Questão 3 dos exercícios sequenciais” 
 * para informar: APROVADO, caso a nota final esteja no 
 * intervalo 70 à 100, RECUPERAÇÃO, caso a nota final esteja no 
 * intervalo 50 à 69 e REPROVADO, caso a nota final esteja no intervalo 0 à 49.
 */

public class L02E02 {
	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		final double pesoN1 = 2, pesoN2 = 4, pesoN3 = 4;

		String nome = InOut.leString("Informe o seu nome");

		nota1 = InOut.leDouble("Informe o valor da nota 1");
		nota2 = InOut.leDouble("Informe o valor da nota 2");
		nota3 = InOut.leDouble("Informe o valor da nota 3");

		media = (nota1 * pesoN1) + (nota2 * pesoN2) + (nota3 * pesoN3);
		media = (media / (pesoN1 + pesoN2 + pesoN3));
		InOut.MsgDeInformação("", "A média final de " + nome + " foi " + media);

		if (media > 6.9 && media <= 10.0) {
			InOut.MsgDeInformação("", "O aluno " + nome + " está APROVADO");
		} else if (media >= 5.0 && media <= 6.9) {
			InOut.MsgDeInformação("", "O aluno " + nome + " está de RECUPERAÇÃO");
		} else
			InOut.MsgDeInformação("", "O aluno " + nome + " está REPROVADO");

	}
}
