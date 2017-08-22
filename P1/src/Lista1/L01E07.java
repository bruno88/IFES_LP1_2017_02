package Lista1;

// Faça um programa que leia os lados de um triângulo retângulo e exiba sua hipotenusa.
// Hipotenusa² = Cateto Adjacente² + Cateto Oposto²
// H² = CA² + CO²
// H = raiz de (CA² + CO²)

public class L01E07 {

	public static void main(String[] args) {
		double altura = InOut.leDouble("Digite a altura do triângulo");
		double base = InOut.leDouble("Digite a base do triângulo");

		double hipotenusa = Math.pow(base, 2) + Math.pow(altura, 2);
		hipotenusa = Math.sqrt(hipotenusa);

		InOut.MsgDeInformação("Resultado", "A hipotenusa do triangulo digitado é : " + hipotenusa);
	}

}
// Caso de Teste
// http://alunosonline.uol.com.br/upload/conteudo/images/trigonometria2.JPG
// Base = 4
// Altura = 3
// Hipotenusa = 5