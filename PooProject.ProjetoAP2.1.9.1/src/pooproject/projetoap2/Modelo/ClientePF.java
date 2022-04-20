package PooProject.ProjetoAP2.Modelo;

public class ClientePF extends Cliente {
	private String nome;
	private String CPF;
	private String dataNascimento;
	
	public ClientePF() {
		super();
	}

	public ClientePF(int codCliente, String email, String telefone, Endereco endereco, String nome, String cPF,
			String dataNascimento) {
		super(codCliente, email, telefone, endereco);
		this.nome = nome;
		this.CPF = cPF;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "ClientePF [nome=" + nome + ", CPF=" + CPF + ", dataNascimento=" + dataNascimento + "]";
	}

}
