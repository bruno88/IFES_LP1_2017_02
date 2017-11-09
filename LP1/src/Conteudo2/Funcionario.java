package Conteudo2;

public abstract class Funcionario {
	String dataContrato;
	double salario;
	int matricula;
	String nome;
	
	public String getNome() {
		return this.nome;
	}
	
	protected void setNome(String nome) {
		// TODO Auto-generated method stub
		this.nome = nome;

	}
	
}
