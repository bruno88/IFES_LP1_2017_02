package Lista1;
/* 01 -  Faça um algoritmo que receba o salário-base de um funcionário,
 * calcule e mostre o salário a receber, sabendo-se que esse funcionário
 * tem gratificação de 5% sobre o salário-base e paga imposto de 7%
 * sobre o total.
 */

public class L01E01 {
	public static void main(String[] args) {		
		final double gratificacao = 0.05;
		final double imposto = 0.07;

		double salBase, salLiquido;

		salBase = InOut.leDouble("Informe o valor do seu salário base");
		salLiquido = (salBase + (salBase * gratificacao)) * (1 - imposto);
		InOut.MsgDeInformação("", "O salario liquido de R$" + salLiquido);

	}
}
