package PooProject.ProjetoAP2.Modelo;

public class ClientePJ extends Cliente{
	private String razaoSocial;
	private String CNPJ;
	private String dataFundacao;
	private String nomeFantasia;
	private int inscricaoEstadual;
	
	public ClientePJ(int codCliente, String email, String telefone, Endereco endereco,String razaoSocial, String cNPJ, String dataFundacao,
			String nomeFantasia, int inscricaoEstadual) {
		super(codCliente, email, telefone, endereco);
		this.razaoSocial = razaoSocial;
		this.CNPJ = cNPJ;
		this.dataFundacao = dataFundacao;
		this.nomeFantasia = nomeFantasia;
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public ClientePJ(){
		super();
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public int getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(int inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	@Override
	public String toString() {
		return "ClientePJ [CNPJ=" + CNPJ + ", dataFundacao=" + dataFundacao + ", nomeFantasia=" + nomeFantasia
				+ ", inscricaoEstadual=" + inscricaoEstadual + "]";
	}
	
	
	
	

}
