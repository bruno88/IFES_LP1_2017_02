package Conteudo1;

public class Conta {
	private String nomeTitular, numero;
	private double saldo, limite;
	public static int qtdContas = 0;
	public Pessoa titular;
	
	public Conta(String nomeTitular) {
		this.qtdContas++;

		// Nome do Títular
		this.nomeTitular = nomeTitular;
		// Número da conta
		this.numero = String.valueOf(qtdContas);
		// Saldo
		this.saldo = 0;
		// Limite
		this.limite = 500;
	}

	public Conta(String nomeTitular, double saldo) {
		this.qtdContas++;

		// Nome do Títular
		this.nomeTitular = nomeTitular;
		// Número da conta
		this.numero = String.valueOf(qtdContas);
		// Saldo
		this.saldo = saldo;
		// Limite
		this.limite = saldo * 2;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
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
				+ "\nTítular: " + this.nomeTitular
				+ "\nSaldo: " + this.saldo
				+ "\nLimite: " + this.limite;
	}

}
