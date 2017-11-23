package CorrecaoProva1;

import java.util.ArrayList;

public class Cliente {

	private String nome, sexo;
	private int idade;
	ArrayList<Endereco> enderecos = new ArrayList<Endereco>();

	public Cliente(String nome, int idade, String sexo, 
					Endereco endereco) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.enderecos.add(endereco);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public ArrayList<Endereco> getEnderecos() {
		return this.enderecos;
	}

	public void addEnderecos(Endereco e1) {
		this.enderecos.add(e1);
	}

	public void removeEnderecos(Endereco e1) {
		this.enderecos.remove(e1);
	}

}
