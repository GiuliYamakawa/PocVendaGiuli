package br.univel.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericDAO<T> {

	protected final String tableName;
	protected Connection con;
	protected List<T> lista = new ArrayList<T>();
	
	
	public GenericDAO(Connection con, String tableName){
		this.tableName = tableName;
		this.con = con;
		this.listar();
	}
	
	public abstract void inserir(T t);
	public abstract void deletar(T t);
	public abstract void atualizar(T t);
	public abstract T buscar(int id);
	public abstract void listar();
	
}
