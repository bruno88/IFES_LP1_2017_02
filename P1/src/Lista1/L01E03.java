package Lista1;
/*
 * - Faça um algoritmo que calcule a média ponderada de um aluno, a partir de suas 3 notas
obtidas no curso, sabendo-se que a primeira avaliação tem peso 2, a segunda tem peso 4 e a
terceira tem peso 4. Mostre, ao final, a mensagem : “ A MEDIA FINAL DE ... FOI ...” .
*/
public class L01E03 {
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
	}
}
