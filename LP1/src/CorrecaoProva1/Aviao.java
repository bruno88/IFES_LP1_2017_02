package CorrecaoProva1;

public class Aviao {
	
	private String modelo;
	private double peso, velocidadeMedia;
	
	public Aviao(String modelo, double peso, double velocidadeMedia) {
		this.modelo = modelo;
		this.peso = peso;
		this.velocidadeMedia = velocidadeMedia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
}
