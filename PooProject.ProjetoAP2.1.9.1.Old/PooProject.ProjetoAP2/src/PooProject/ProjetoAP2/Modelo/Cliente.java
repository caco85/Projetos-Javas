package PooProject.ProjetoAP2.Modelo;

public class Cliente {
	
	
	private int codCliente;
	private String email;
	private String telefone;
	private Endereco endereco;
	
	public Cliente(int codCliente, String email, String telefone, Endereco endereco) {
		super();
		this.codCliente = codCliente;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	

	public Cliente() {
		super();
	}



	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	@Override
	public String toString() {
		return "Cliente [codCliente=" + codCliente + ", email=" + email + ", telefone=" + telefone + ", endereco="
				+ endereco + "]";
	}
	
	

	

}
