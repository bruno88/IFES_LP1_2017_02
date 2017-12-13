package Conteudo4;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TabelaAlunos extends AbstractTableModel {

	ArrayList<Aluno> alunos = new ArrayList<Aluno>();

	public TabelaAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	@Override
	public int getColumnCount() {
		// nome, cpf, idade, matricula
		return 4;
	}

	@Override
	public int getRowCount() {

		return alunos.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Aluno a1 = alunos.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return a1.getNome();
		case 1:
			return a1.getCPF();
		case 2:
			return a1.getIdade();
		case 3:
			return a1.getMatricula();
		}
		return null;
	}
	
	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0:
			return "Nome";
		case 1:
			return "CPF";
		case 2:
			return "Idade";
		case 3:
			return "Matrícula";
		}
		return "";
	}

}
