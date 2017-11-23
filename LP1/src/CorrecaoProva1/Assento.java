package CorrecaoProva1;

public class Assento {
	
	private int numAssento;
	private Cliente cliente;
	
	public Assento(Cliente c1, int numAssento) {
		this.cliente = c1;
		this.numAssento = numAssento;
	}
	
	public int getNumAssento() {
		return numAssento;
	}
	public void setNumAssento(int numAssento) {
		this.numAssento = numAssento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
