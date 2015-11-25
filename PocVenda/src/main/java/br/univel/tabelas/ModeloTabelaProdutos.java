package br.univel.tabelas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.univel.model.Produto;

public class ModeloTabelaProdutos extends AbstractTableModel {

	private static final long serialVersionUID = -2852110972924777966L;
	private List<Produto> lista = new ArrayList<Produto>();

	public ModeloTabelaProdutos(List<Produto> lista) {
		this.lista = lista;
	}

	public List<Produto> getLista() {
		return lista;
	}

	public void setLista(List<Produto> lista) {
		this.lista = lista;
	}

	public int getColumnCount() {
		return 6;
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
				return "Código de barra";
			case 2:
				return "Categoria";
			case 3:
				return "Descrição";
			case 4:
				return "Unidade";
			default:
				return "Custo";
		}
	}
}
