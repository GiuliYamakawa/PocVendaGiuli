package br.univel.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.univel.enums.Estados;
import br.univel.enums.Genero;
import br.univel.model.Cliente;
import br.univel.util.Banco;

public class ClienteDAO extends GenericDAO<Cliente> {

	private Statement stmt;

	public ClienteDAO() {
		super(Banco.conectar(), "Cliente");
	}

	@Override
	public void inserir(Cliente t) {
		String query = "INSERT INTO Cliente (nome, telefone, cidade, estado, email, genero) "+
						"VALUES ("+t.getNome()+","+t.getTelefone()+","+t.getCidade() + "," + t.getEstado().name() + "," + t.getEmail() + "," + t.getGenero().name() +");";
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deletar(Cliente t) {
		String query = "DELETE FROM Cliente WHERE id = " + t.getId();
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void atualizar(Cliente t) {
		String query = "UPDATE Cliente SET nome = "+t.getNome()+", telefone = "+t.getTelefone()+", cidade = "+t.getCidade()+", estado = "+t.getEstado().name()+", email = "+t.getEmail()+", genero = "+t.getGenero().name()+" WHERE id = " + t.getId();
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Cliente buscar(int id) {
		for(Cliente c : lista){
			if(c.getId() == id)
				return c;
		}
		return null;
	}
	
	public void listar(){
		String query = "SELECT * FROM Cliente";
		try {
			stmt = con.createStatement();
			ResultSet result = stmt.executeQuery(query);
			
			while(result.next()){
				Cliente c = new Cliente();
				c.setId(result.getInt("id"));
				c.setCidade(result.getString("cidade"));
				c.setEstado(Estados.valueOf(result.getString("estado")));
				c.setGenero(Genero.valueOf(result.getString("genero")));
				c.setEmail(result.getString("email"));
				c.setTelefone(result.getString("telefone"));
				lista.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
