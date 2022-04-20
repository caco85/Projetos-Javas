
public class Cliente {
	
	private int codigo;
	private String nome;
	private int idade;
	private String email ;
	private String cpf;
	private String dataNascimento;
	private Endereco end;
	
	public Cliente() {
		super();
	}

	public Cliente(int codigo, String nome, int idade, String email,String cpf, String dataNascimento, Endereco end) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.end = end;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", idade="
				+ idade + ", email=" + email + ", cpf=" + cpf
				+ ", dataNascimento=" + dataNascimento + ", end=" + end + "]";
	}
	
	
	

}
