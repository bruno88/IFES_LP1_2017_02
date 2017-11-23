package Conteudo3;

import javax.swing.JOptionPane;

public class Exerc1 {

	public static void main(String[] args) {

		GerenciadorDeDesenhos gerenciador = new GerenciadorDeDesenhos();

		double area = Double.valueOf(JOptionPane.showInputDialog(null, "Digite a área da figura"));
		double perimetro = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o perimetro da figura"));

		// criei tijolo
		Tijolo tijolo = new Tijolo(10.2, 20.4);
		verificaSeFazNada(tijolo);
		gerenciador.addDesenho(tijolo);
		
		// criei 1 retangulo
		Retangulo ret1 = new Retangulo(area, perimetro, 20.2, 45.3);
		gerenciador.addDesenho(ret1);
		//ret1.desenha();

		 area = Double.valueOf(JOptionPane.showInputDialog(null, "Digite a área da figura"));
		 perimetro = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o perimetro da figura"));

		// criei segundo retangulo
		Retangulo ret2 = new Retangulo(area, perimetro, 10.2, 5.3);
		gerenciador.addDesenho(ret2);
		//ret2.desenha();

		area = Double.valueOf(JOptionPane.showInputDialog(null, "Digite a área da figura"));
		 perimetro = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o perimetro da figura"));

		// criei circunferencia
		Circunferencia circ1 = new Circunferencia(area, perimetro, 3.1);
		gerenciador.addDesenho(circ1);
		//circ1.desenha();

		area = Double.valueOf(JOptionPane.showInputDialog(null, "Digite a área da figura"));
		 perimetro = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o perimetro da figura"));

		 
		// criei triangulo
		Triangulo tri1 = new Triangulo(area, perimetro, 3.1, 2.0);
		gerenciador.addDesenho(tri1);
		//tri1.desenha();

		gerenciador.atualizarTela();

	}

	public static void verificaSeFazNada(FiguraGeometrica figura) {
		figura.fazNada(true);
	}

}
