package Lista3;
public class L03E01 {
	public static void main (String[] args) {
		int varA = InOut.leInt("Informe o valor de A");
		int varB = InOut.leInt("Informe o valor de B");
		int varC = InOut.leInt("Informe o valor de C");
		String saida;
		
		if(varA<=varB && varB<=varC){
			saida = varA+" - "+varB+" - "+varC;
		}else if(varA<=varC && varC<=varB){
			saida = varA+" - "+varC+" - "+varB;
		}else if(varB<=varA && varA<=varC){
			saida = varB+" - "+varA+" - "+varC;
		}else if(varB<=varC && varC<=varA){
			saida = varB+" - "+varC+" - "+varA;
		}else if(varC<=varA && varA<=varB){
			saida = varC+" - "+varA+" - "+varB;
		}else{
			saida = varC+" - "+varB+" - "+varA;
		}
		
		InOut.MsgDeInformação("", saida);
	}
}
