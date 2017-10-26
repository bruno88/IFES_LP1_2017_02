package Conteudo2;

public class Conta {
	protected int numConta;
	protected double saldo;
	protected static int qtdContas = 1;

	public Conta(double saldo) {
		this.numConta = this.qtdContas;
		this.qtdContas++;
		this.saldo = saldo;
	}

	public void depositar(int numConta, double valor) {
		if (numConta == this.numConta) {
			this.saldo += valor;
		}
	}

	public double obterSaldo() {
		return this.saldo;
	}

	public void sacar(double valor) {
		final double txOperacao = 0.5;

		this.saldo -= valor * (1 + (txOperacao) / 100);
	}

	@Override
	public String toString() {
		return "Conta : " + this.numConta + "\nSaldo: " + saldo;
	}
}
