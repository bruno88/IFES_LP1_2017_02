package Lista4;

import java.util.Scanner;

/**
 * Digite o nome e idade de 2 pessoas diferentes e retorne o NOME da pessoa mais
 * velha
 */
public class ExercicioExtra7 {

	public static void main(String[] args) {
		int idade1, idade2;

		String saida = "", nome1 = "", nome2 = "";

		System.out.println("Digite o nome da primeira pessoa:");
		nome1 = new Scanner(System.in).nextLine();

		System.out.println("Digite a idade da primeira pessoa:");
		idade1 = new Scanner(System.in).nextInt();

		System.out.println("Digite o nome da segunda pessoa:");
		nome2 = new Scanner(System.in).nextLine();

		System.out.println("Digite a idade da segunda pessoa:");
		idade2 = new Scanner(System.in).nextInt();

		if (idade1 == idade2) {
			saida = nome1 + " e " + nome2 + " possuem a mesma idade.";
		} else {
			if (idade1 > idade2) {
				saida = nome1 + " é mais VELHO que " + nome2;
			} else {
				saida = nome2 + " é mais VELHO que " + nome1;
			}
		}

		System.out.println(saida);

	}
}
