package br.univel.tabelas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.univel.model.Cliente;

public class ModeloTabelaClientes extends AbstractTableModel {

	private static final long serialVersionUID = -2852110972924777966L;
	private List<Cliente> lista = new ArrayList<Cliente>();

	public ModeloTabelaClientes(List<Cliente> lista) {
		this.lista = lista;
	}

	public List<Cliente> getLista() {
		return lista;
	}

	public void setLista(List<Cliente> lista) {
		this.lista = lista;
	}

	public int getColumnCount() {
		return 8;
	}

	public int getRowCount() {
		return lista.size();
	}

	public Object getValueAt(int row, int column) {
		return lista.get(row);
	}
	
	@Override
	public String getColumnName(int column) {
		switch(column){
			case 0:
				return "ID";
			case 1:
				return "Nome";
			case 2:
				return "Telefone";
			case 3:
				return "Endereço";
			case 4:
				return "Cidade";
			case 5:
				return "Estado";
			case 6:
				return "E-mail";
			default:
				return "Genero";
		}
	}

}
