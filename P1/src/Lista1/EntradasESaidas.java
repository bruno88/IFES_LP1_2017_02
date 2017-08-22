package Lista1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradasESaidas {

	public static void main(String[] args) {
		// Exemplos de Leitura e Escrita de dados

		// Via Scanner

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite um número");
		int aux = sc1.nextInt();
		System.out.println("Você digitou o número: " + aux);
		sc1.close();

		// Via InOut

		int aux2 = InOut.leInt("Digite um número");
		InOut.MsgDeInformação("Resultado", "Você digitou o número: " + aux2);

		// via JOptionPane

		String aux3 = JOptionPane.showInputDialog("digite um número");
		JOptionPane.showMessageDialog(null, "Você digitou o número: " + aux3);

	}
}