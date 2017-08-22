package Lista2;
/*
 * Faça uma Programa que receba o código correspondente ao cargo 
 * de um funcionário e o seu salário base. O programa deve imprima seu cargo 
 * e o seu salário liquido seguindo o percentual de aumento 
 * a qual este funcionário tem direito conforme a tabela abaixo: 

Código		Cargo 		Percentual
0l 		Escriturário 	50%
02 		Secretário 	35%
03 		Caixa 		20%
04 		Gerente 	10%
05 		Diretor 		Não tem aumento 
*/

public class L02E08 {
	public static void main(String[] args) {
		int codCargo;
		double salario;

		codCargo = InOut.leInt("Informe o codigo do cargo");
		salario = InOut.leDouble("Digite seu Salario Base");

		String saida = "Seu cargo é : ";

		if (codCargo == 1) {
			saida += "Escrituário";
			salario *= 1.5;
			saida += "\nSeu novo salário é: " + salario;
		} else if (codCargo == 2) {
			saida += "Secretário";
			salario *= 1.35;
			saida += "\nSeu novo salário é: " + salario;
		} else if (codCargo == 3) {
			saida += "Caixa";
			salario *= 1.2;
			saida += "\nSeu novo salário é: " + salario;
		} else if (codCargo == 4) {
			saida += "Gerente";
			salario *= 1.1;
			saida += "\nSeu novo salário é: " + salario;
		} else {
			saida += "Diretor";
			saida += "\nSeu salário se manteve em : " + salario;
		}
		InOut.MsgDeInformação("", saida);
	}
}
