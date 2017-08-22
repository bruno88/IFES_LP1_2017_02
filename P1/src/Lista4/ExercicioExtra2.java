/*
   Implemente uma calculadora que exiba o menu abaixo:
 	1 - Somar
	2 - Subtrair
	3 - Multiplicar
	4 - Dividir
	
	Após ler a opção do usuário e fazendo uso do Switch Case, receba dois 
	números e retorne o resultado da operação, com base no operador 
	escolhido pelo usuário  
 */

package Lista4;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ExercicioExtra2 {
	public static void main(String[] args) {
		int num1, num2;
		String op = "", saida = "";
		Scanner sc1 = new Scanner(System.in);

		// Menu
		String textoMenu = "Escolha uma opção: ";
		textoMenu += "\n+ para Somar";
		textoMenu += "\n- para Subtrair";
		textoMenu += "\n* para Multiplicar";
		textoMenu += "\n/ para Dividir";

		// op = InOut.leString(textoMenu);
		System.out.println(textoMenu);
		op = sc1.nextLine();

		System.out.println("Digite o 1º número");
		num1 = sc1.nextInt();

		System.out.println("Digite o 2º número");
		num2 = sc1.nextInt();

		switch (op) {
		case "+":
			// saida = "" + (num1 + num2);
			saida = String.valueOf(num1 + num2);
			break;
		case "-":
			saida = String.valueOf(num1 - num2);
			break;
		case "*":
			saida = String.valueOf(num1 * num2);
			break;
		case "/":
			saida = String.valueOf(num1 / num2);
			break;
		default:
			System.out.println("Valor inválido!");
			System.exit(0);
		}

		System.out.println(saida);

	}
}
