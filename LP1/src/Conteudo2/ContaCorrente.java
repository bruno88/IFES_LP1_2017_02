package Conteudo2;

public class ContaCorrente extends Conta {
	private double limiteConta;

	public ContaCorrente(double saldo, double limiteConta, boolean ativo) {
		super(saldo, ativo);
		this.limiteConta = limiteConta;
	}

	@Override
	public String toString() {
		return "Conta : " + this.numConta 
				+ "\nSaldo: " + this.saldo
				+ "\nLimite da Conta: " 
				+ this.limiteConta;
	}
}
