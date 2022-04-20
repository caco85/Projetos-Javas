
public class Fornecedor {
	
	private String CNPJ ;
	private String nome ;
	private String nomeFantasia;
	private String dataFundacao;
	private String email;
	private String tipoServico;
	private Endereco End;
	
	public Fornecedor() {
		super();
	}

	public Fornecedor(String cNPJ, String nome, String nomeFantasia,
			String dataFundacao, String email, String tipoServico, Endereco end) {
		super();
		this.CNPJ = cNPJ;
		this.nome = nome;
		this.nomeFantasia = nomeFantasia;
		this.dataFundacao = dataFundacao;
		this.email = email;
		this.tipoServico = tipoServico;
		this.End = end;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	public Endereco getEnd() {
		return End;
	}

	public void setEnd(Endereco end) {
		End = end;
	}

	@Override
	public String toString() {
		return "Fornecedor [CNPJ=" + CNPJ + ", nome=" + nome
				+ ", nomeFantasia=" + nomeFantasia + ", dataFundacao="
				+ dataFundacao + ", email=" + email + ", tipoServico="
				+ tipoServico + ", End=" + End + "]";
	}
	
	
	
	
	
	
	

}
