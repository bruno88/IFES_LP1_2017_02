package Lista2;
/* Elabore um algoritmo que verifique se um dado número informado pelo 
 * usuário é PAR ou ÍMPAR.
 */

public class L02E01 {
	public static void main(String[] args) {
		int numero;

		numero = InOut.leInt("Informe o número");

		if (numero % 2 == 0) {
			InOut.MsgDeInformação("", "O Número é PAR");
		} else {
			InOut.MsgDeInformação("", "O Número é IMPAR");
		}

	}
}
