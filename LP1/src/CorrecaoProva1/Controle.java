package CorrecaoProva1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Controle {

	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
	ArrayList<Aviao> avioes = new ArrayList<Aviao>();
	ArrayList<Voo> voos = new ArrayList<Voo>();

	public Cliente addClientes() {
		String nome, sexo;
		int idade;
		
		// Lê dados essenciais para cliente
		nome = JOptionPane.showInputDialog(null, "Digite o nome:");
		sexo = JOptionPane.showInputDialog(null, "Digite o sexo:");
		idade = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite idade:"));
		
		// Lê dados para o Endereço
		JOptionPane.showMessageDialog(null, "Digite o endereço do cliente:");
		Endereco endereco = addEnderecos();
		
		Cliente c1 = new Cliente(nome, idade, sexo, endereco);
		this.clientes.add(c1);	
		return c1;
	}
	
	public Cliente ConsultaClientePorNome(String nome) {
		for (Cliente c1 : this.clientes) {
			if (c1.getNome().equalsIgnoreCase(nome)) {
				return c1;
			}
		}
		
		return null;
	}
	
	public void removeCliente(Cliente c1) {
		this.clientes.remove(c1);
	}

	public Endereco addEnderecos() {
		String rua, logradouro, bairro, cidade, estado, CEP;

		rua = JOptionPane.showInputDialog(null, "Digite o nome da rua:");
		logradouro = JOptionPane.showInputDialog(null, "Digite o logradouro:");
		bairro = JOptionPane.showInputDialog(null, "Digite o bairro:");
		cidade = JOptionPane.showInputDialog(null, "Digite a cidade:");
		estado = JOptionPane.showInputDialog(null, "Digite o estado:");
		CEP = String.valueOf(JOptionPane.showInputDialog(null, "Digite o CEP:"));

		Endereco endereco = new Endereco(rua, logradouro, bairro, 
				cidade, estado, CEP);
		this.enderecos.add(endereco);
		return endereco;

	}

	public Endereco consultaEnderecosPorCEP(String CEP) {
		for (Endereco e1 : this.enderecos) {
			if (e1.getCEP().equalsIgnoreCase(CEP)) {
				return e1;

			}
		}
		return null;
	}
	
	public void removeEndereco(Endereco e1) {
		this.enderecos.remove(e1);
	}

	public Aviao addAvioes() {
		String modelo;
		double peso, velocidadeMedia;

		modelo = JOptionPane.showInputDialog(null, "Digite o modelo:");
		peso = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o peso:"));
		velocidadeMedia = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o a velocidade media:"));

		Aviao aviao = new Aviao(modelo, peso, velocidadeMedia);
		this.avioes.add(aviao);
		return aviao;
	}

	public Aviao consultaAvioesPorModelo (String modelo) {
		for (Aviao a1 : this.avioes) {
			if (a1.getModelo().equalsIgnoreCase(modelo)) {
				return a1;
			}
		}
		return null;
	}
	
	public void removeAviao(Aviao a1) {
		this.avioes.remove(a1);
	}

	public void addVoos() {
		String dataSaida, dataChegada, horaSaida, horaChegada, cidadeOrigem, cidadeDestino;
		double preco;
		
		// Lendo dados do Vôo
		dataSaida = JOptionPane.showInputDialog(null, "Digite a Data de saída do Vôo:");
		dataChegada = JOptionPane.showInputDialog(null, "Digite a Data de chegada do Vôo:");
		horaSaida = JOptionPane.showInputDialog(null, "Digite a Hora de Saida:");
		horaChegada = JOptionPane.showInputDialog(null, "Digite a hora de Chegada:");
		cidadeOrigem = JOptionPane.showInputDialog(null, "Digite a Cidade de Origem:");
		cidadeDestino = JOptionPane.showInputDialog(null, "Digite a Cidade de Destino:");
		preco = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o Preço da Passagem:"));
		
		// Lendo dados do Avião
		Aviao aviao = addAvioes();
		Voo voo = new Voo(dataSaida, dataChegada, horaSaida, horaChegada, 
				cidadeOrigem, cidadeDestino, preco, aviao);
		this.voos.add(voo);
	}
	
	public Voo consultaVooPorDatas (String dataSaida, String dataChegada) {
		for (Voo v1 : this.voos) {
			if (v1.getDataSaida().equalsIgnoreCase(dataSaida)
					&& v1.getDataChegada().equalsIgnoreCase(dataChegada)) {
				return v1;
			}
		}
		return null;
	}
}
