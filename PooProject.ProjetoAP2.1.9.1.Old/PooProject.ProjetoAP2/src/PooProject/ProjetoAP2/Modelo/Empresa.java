package PooProject.ProjetoAP2.Modelo;

public class Empresa {
	
	private int codEmpresa;
	private String razaoSocial;
	private String CNPJ;
	private String dataFundacao;
	private String nomeFantasia;
	private int inscricaoEstadual;
	private Endereco endereco;
	private String login;
	private Financeiro financeiro;
	
	private int codFuncionario;
	private String nomeFuncionario;
	private String cargo;
	private String dataEntrada;
	private String dataSaida;
	private double salario;
	private String horario;
	private String dataFerias ;
	
	public Empresa(int codEmpresa, String razaoSocial, String cNPJ, String dataFundacao, String nomeFantasia,
			int inscricaoEstadual, Endereco endereco,String login,Financeiro financeiro) {
		super();
		this.codEmpresa = codEmpresa;
		this.razaoSocial = razaoSocial;
		this.CNPJ = cNPJ;
		this.dataFundacao = dataFundacao;
		this.nomeFantasia = nomeFantasia;
		this.inscricaoEstadual = inscricaoEstadual;
		this.endereco = endereco;
		this.login = login;
		this.financeiro = financeiro;
	}
	public Empresa() {
		super();
	}
	
	

	public Empresa(int codFuncionario,String nomeFuncionario, String cargo, String dataEntrada, String dataSaida, double salario,
			String horario, String dataFerias) {
		super();
		this.codFuncionario = codFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.cargo = cargo;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.salario = salario;
		this.horario = horario;
		this.dataFerias = dataFerias;
	}

	public int getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(int codEmpresa) {
		this.codEmpresa = codEmpresa;
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
		this.CNPJ = cNPJ;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public Financeiro getFinanceiro() {
		return financeiro;
	}
	public void setFinanceiro(Financeiro financeiro) {
		this.financeiro = financeiro;
	}
	//Funcionario
	public int getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getDataFerias() {
		return dataFerias;
	}

	public void setDataFerias(String dataFerias) {
		this.dataFerias = dataFerias;
	}
	@Override
	public String toString() {
		return "Empresa [codEmpresa=" + codEmpresa + ", razaoSocial=" + razaoSocial + ", CNPJ=" + CNPJ
				+ ", dataFundacao=" + dataFundacao + ", nomeFantasia=" + nomeFantasia + ", inscricaoEstadual="
				+ inscricaoEstadual + ", endereco=" + endereco + ", login=" + login + ", financeiro=" + financeiro
				+ ", codFuncionario=" + codFuncionario + ", nomeFuncionario=" + nomeFuncionario + ", cargo=" + cargo
				+ ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", salario=" + salario + ", horario="
				+ horario + ", dataFerias=" + dataFerias + "]";
	}
	
	
}
