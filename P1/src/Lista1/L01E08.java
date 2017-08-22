package Lista1;

// Calcule a distância entre dois pontos

public class L01E08 {

	public static void main(String[] args) {
		double ponto1X = InOut.leDouble("Digite o X do ponto 1");
		double ponto1Y = InOut.leDouble("Digite o Y do ponto 1");

		double ponto2X = InOut.leDouble("Digite o X do ponto 2");
		double ponto2Y = InOut.leDouble("Digite o Y do ponto 2");

		double distancia = Math.pow((ponto1X - ponto2X), 2) + Math.pow((ponto1Y - ponto2Y), 2);
		
		distancia = Math.sqrt(distancia);

		InOut.MsgDeInformação("Resultado", "A distância entre os pontos digitados é : " + distancia);
	}

}
// Caso de Teste
// http://brasilescola.uol.com.br/matematica/distancia-entre-dois-pontos.htm
// Ponto1 = (4,5)
// Ponto2 = (1,1)
// distancia = 5