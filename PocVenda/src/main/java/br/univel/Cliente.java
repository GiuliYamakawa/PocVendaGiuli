package br.univel;

/**
 * Cliente (Entidade cliente com as informações dos clientes do sistema)
 * Data: 04-11-2015 21:30
 * @author ggsgyamakawa
 */

public class Cliente {
	
	private int id;
	private String nome;
	private String telefone;
	private String cidade;
	private Estado estado;
	private String email;
	private Genero genero;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", telefone="
				+ telefone + ", cidade=" + cidade + ", estado=" + estado
				+ ", email=" + email + ", genero=" + genero + "]";
	}
	
	
	
	
	

}
