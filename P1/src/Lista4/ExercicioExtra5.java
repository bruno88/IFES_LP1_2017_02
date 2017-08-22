package Lista4;

import java.util.Scanner;

/**
 * 8 - Transforme um número Racional (formado por numerador e denominador) para
 * um número Real. Antes de dividir, verifique se o denominador é diferente de
 * zero. Emita uma mensagem de alerta ao usuário se for zero.
 */
public class ExercicioExtra5 {

	public static void main(String[] args) {
		int numerador, denominador;
		Scanner sc1 = new Scanner(System.in);
		// Entrada de Dados.
		System.out.println("Digite o Numerador:");
		numerador = sc1.nextInt();
		System.out.println("Digite o Denominador:");
		denominador = sc1.nextInt();

		if (denominador == 0) {

			System.out.println("Fração Inválida, pois o denominador é igual a 0.");

		} else {
			System.out.println("O resultado da sua divisão é o número real " +
					//(double) numerador / denominador + ".");
					 numerador / denominador + ".");
		}

	}

}