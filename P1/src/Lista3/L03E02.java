package Lista3;

public class L03E02 {
	public static void main(String[] args) {
		double altura, pesoIdeal = 0;
		String sexo;
		String saida = "";
		
		altura = InOut.leDouble("Informe sua altura");
		sexo = InOut.leString("Informe: \nM - Masculino" + " \nF - Feminino");
		
		if (sexo.equalsIgnoreCase("M") || 
				sexo.equalsIgnoreCase("masculino")) {
			pesoIdeal = 72.7 * altura - 58;
			saida += pesoIdeal;
			
		} else if (sexo.equalsIgnoreCase("F") || 
				sexo.equalsIgnoreCase("feminino")) {
			pesoIdeal = 62.1 * altura - 44.7;
			saida += pesoIdeal;
		} else
		{
			saida = "Entrada Inválida";
		}
		InOut.MsgDeInformação("", saida);
	}
}
