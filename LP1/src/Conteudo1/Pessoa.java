package Conteudo1;

public class Pessoa {
	private String nome, RG, telefone, email;

	public Pessoa(String nome, String RG, String telefone, String email) {
		this.nome = nome;
		this.RG = RG;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", RG=" + RG + ", telefone=" + telefone + ", email=" + email + "]";
		//return nome + ":\n" + "RG: " + RG + "\nTelefone: " + telefone + "\nE-Mail: " + email + "\n";
	}

}
