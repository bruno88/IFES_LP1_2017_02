package Lista1;
public class ExerciciosDeSala {

	public static void main(String[] args) {
		// Faça um programa que lê 1 número inteiro e o imprime para o usuário

		int numero = InOut.leInt("Digite um número");
		InOut.MsgDeInformação("Resultado", "Você digitou o número: " + numero);

		// Faça um programa que lê o nome de duas pessoas e as imprime para o usuário

		String nome1 = InOut.leString("Digite o primeiro nome");
		String nome2 = InOut.leString("Digite o segundo nome");
		InOut.MsgDeInformação("Resultado", "Você digitou os nomes: " + nome1 + " e " + nome2);

		/*
		 * Faça um programa que lê o valor bruto do produto e calcula seu valor final,
		 * sendo que sempre será cobrado 10% de imposto sobre o valor bruto
		 */

		final double imposto = 0.1;
		double valorBruto = InOut.leDouble("Digite o valor do produto");
		double valorFinal = (valorBruto * (1 - imposto));
		InOut.MsgDeInformação("Resultado", "O valor final do produto é: " + valorFinal);

		/*
		 * Faça um programa que lê o nome de um aluno e suas 3 notas e calcula a média
		 * aritimética
		 */

		String nomeAluno = InOut.leString("Digite o nome do aluno");
		double nota1 = InOut.leDouble("Digite a primeira nota do aluno " + nomeAluno);
		double nota2 = InOut.leDouble("Digite a segunda nota do aluno " + nomeAluno);
		double nota3 = InOut.leDouble("Digite a terceira nota do aluno " + nomeAluno);
		double mediaArit = (nota1 + nota2 + nota3) / 3;
		InOut.MsgDeInformação("Resultado", "A média aritimética das notas digitadas é : " + mediaArit);

	}
}