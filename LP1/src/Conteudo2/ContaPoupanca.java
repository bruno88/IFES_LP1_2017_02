package Conteudo2;

public class ContaPoupanca extends Conta {
	private String dtaAniv;

	public ContaPoupanca(double saldo, String dtaAniv) {
		super(saldo);
		this.dtaAniv = dtaAniv;
	}

	@Override
	public String toString() {
		return "Conta : " + this.numConta 
				+ "\nSaldo: " + this.saldo
				+ "\nData de Aniversário: " 
				+ this.dtaAniv;
	}
}
