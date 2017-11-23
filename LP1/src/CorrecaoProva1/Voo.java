package CorrecaoProva1;

import java.util.ArrayList;

public class Voo {

	private String dataSaida, dataChegada, 
		horaSaida, horaChegada, cidadeOrigem, 
		cidadeDestino;
	private double preco;
	private Aviao aviao;
	ArrayList<Assento> assentos = new ArrayList<Assento>();

	public Voo(String dataSaida, String dataChegada, 
			String horaSaida, String horaChegada, 
			String cidadeOrigem,
			String cidadeDestino, double preco, 
			Aviao aviao) {
		this.dataSaida = dataSaida;
		this.dataChegada = dataChegada;
		this.horaSaida = horaSaida;
		this.horaChegada = horaChegada;
		this.cidadeOrigem = cidadeOrigem;
		this.cidadeDestino = cidadeDestino;
		this.preco = preco;
		this.aviao = aviao;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(String dataChegada) {
		this.dataChegada = dataChegada;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public String getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(String horaChegada) {
		this.horaChegada = horaChegada;
	}

	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Aviao getAviao() {
		return aviao;
	}

	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}
	
	public void reservarAssento(Assento a1) {
		this.assentos.add(a1);
	}

	public void cancelarAssento(Assento a1) {
		this.assentos.remove(a1);
	}
	
	public Assento ConsultaAssentoPorNomeCliente(String nome) {
		for (Assento assento : this.assentos) {
			if (assento.getCliente().getNome().equalsIgnoreCase(nome)) {
				return assento;
			}
		}
		
		return null;
	}
	
}