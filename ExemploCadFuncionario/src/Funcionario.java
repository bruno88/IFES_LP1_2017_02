
public class Funcionario {

	private int codigo;
	private String nome;
	private String funcao; 
	private int idade;
	private double salario;
	
	public Funcionario(String nome, String funcao, int idade, double salario) {
		this.nome = nome;
		this.funcao = funcao;
		this.idade = idade;
		this.salario = salario;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
