package Conteudo1;

public class Conta {
	private String numero;
	private double saldo, limite;
	private Pessoa titular;
	public static int qtdContas = 0;
	
	public Conta(Pessoa titular) {
		this.qtdContas++;

		// Nome do Títular
		this.titular = titular;
		
		// Número da conta
		this.numero = String.valueOf(qtdContas);
		// Saldo
		this.saldo = 0;
		// Limite
		this.limite = 500;
	}

	public Conta(Pessoa titular, double saldo) {
		this.qtdContas++;

		// Nome do Títular
		this.titular = titular;
		// Número da conta
		this.numero = String.valueOf(qtdContas);
		// Saldo
		this.saldo = saldo;
		// Limite
		this.limite = saldo * 2;
	}

	public Pessoa getTitular() {
		return titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double consultarSaldo() {
		return this.saldo;
	}

	public boolean realizarSaque(double valor) {
		if (this.saldo - valor < 0) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	public boolean realizarDeposito(double valor) {
		this.saldo += valor;
		return true;
	}
	
	@Override
	public String toString() {
		return "Conta numero=" + this.numero
				+ "\nTítular: " + this.titular.getNome()
				+ "\nSaldo: " + this.saldo
				+ "\nLimite: " + this.limite;
	}

}
