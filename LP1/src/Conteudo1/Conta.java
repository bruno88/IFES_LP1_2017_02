package Conteudo1;

public class Conta {
	private double saldo;
	private double limite = 100;

	public Conta() {
		this.limite = 100;

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		} else {
			// msgerro
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void Sacar(double valor) {

	}

	public void Depositar(double valor) {

	}

	public double Saldo() {
		return this.saldo;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", limite=" + limite + "]";
	}

}
