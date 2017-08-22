package Lista2;
/* Uma empresa decide dar um aumento de 30% aos funcionários cujo salário 
 * é inferior a 500 reais. Escreva uma Programa que receba o salário 
 * de um funcionário e imprima o valor do salário reajustado ou 
 * uma mensagem caso o funcionário não tenha direito ao aumento. 
 */

public class L02E03 {
	public static void main(String[] args) {
		double salarioBruto;
		final double criterioSal = 500;
		final double ajuste = 0.3;

		salarioBruto = InOut.leDouble("Informe o salário bruto do funcionário");

		if (salarioBruto <= criterioSal) {
			InOut.MsgDeInformação("", "O funcionário receberá um ajuste de 30% " + "e o novo valor será de : "
					+ salarioBruto * (1 + ajuste));
		} else
			InOut.MsgDeInformação("",
					"O funcionário não receberá ajustes. O novo valor será de : " + salarioBruto);

	}
}
