package Lista1;

/* Faça um programa para calcular o salário de um funcionário, o usuário deve informar o
salário base, o numero de horas extras trabalhadas e o numero de faltas. O programa deve
mostrar na tela o salario liquido do funcionário seguindo os critérios abaixo.
* Para cada hora extra trabalhada há um acréscimo igual ao valor do salário base
dividido por 88.
* Para cada falta do funcionário há um desconto igual ao valor do salario base dividido
por 22.
* Despois desses valores calculados há um acréscimo de 6% de insalubridade.
* Em cima apenas do salário base a um desconto de 8% de previdência privada */

public class L01E09 {

	public static void main(String[] args) {
		final double percentInsal = 0.06;
		final double percentPrevP = 0.08;
		final int baseCalcHrExtra = 88;
		final int baseCalcFaltas = 22;

		double salarioBase = InOut.leDouble("Digite o salário base");
		int horasExtras = InOut.leInt("Digite o número de horas extras");
		int numFaltas = InOut.leInt("Digite o número de faltas");

		// Recebe o salário Base
		double salarioLiq = salarioBase;

		// Adiciona a bonificação por Horas Extras trabalhadas
		salarioLiq += horasExtras * (salarioBase / baseCalcHrExtra);

		// Desconta as faltas
		salarioLiq -= numFaltas * (salarioBase / baseCalcFaltas);

		// Adiciona a bonificação por Insalubridade
		salarioLiq *= (1 + percentInsal);

		// Desconta a previdência privada
		salarioLiq -= (salarioBase * percentPrevP);

		InOut.MsgDeInformação("Resultado", "O Salário Liquido é : R$ " + salarioLiq);
	}

}
// Caso de Teste
// Entradas:
// Salario Base = 2000
// Horas extras = 8
// Faltas = 3
// Saídas:
// Salario Liq = 2000 + 181,8181 - 272,7272
// Salario Liq = 1909,0909 * 1,06 = 2023,6363
// Salario Liq = 2023,6363 - (2000 * 0,08) = 2023,6363 - 160 = 1863,6363