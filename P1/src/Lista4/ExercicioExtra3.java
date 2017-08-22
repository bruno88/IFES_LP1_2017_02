/*
   Crie um programa que leia o nome do usuário e imprima um recado, conforme abaixo:
 	1 - Bruno
 	2 - Pedro
 	3 - Maria
 	4 - João
 	5 - Joana
 	
 	As mensagens a serem exibidas são:
 	Para Bruno: Terá aula Segunda, Terça e Sexta
 	Para Pedro: Terá aula Quarta, Quinta e Sexta
 	Para Maria: Terá aula Segunda, Terça e Quinta
 	Para João: Terá aula Terça, Quarta e Quinta
 	Para Joana: Terá aula Quarta e Sábado
 */

package Lista4;

import java.util.Scanner;

public class ExercicioExtra3 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		String op = "", saida = "";

		// Menu
		String textoMenu = "Central de Recados:\n";
		textoMenu += "Digite seu nome e informaremos se há recados\n";

		System.out.println(textoMenu);
		op = sc1.nextLine().toLowerCase();

		switch (op) {
		case "bruno":
			saida = "Terá aula Segunda, Terça e Sexta";
			break;
		case "pedro":
			saida = "Terá aula Quarta, Quinta e Sexta";
			break;
		case "maria":
			saida = "Terá aula Segunda, Terça e Quinta";
			break;
		case "joão":
			saida = "Terá aula Terça, Quarta e Quinta";
			break;
		case "joana":
			saida = "Terá aula Quarta e Sábado";
			break;
		default:
			System.out.println("Sem recados! ");
			System.exit(0);
		}

		System.out.println(saida);

	}
}
