
public class Endereco {
	
	private String rua;
	private String bairro;
	private int numeroCasa;
	private String Complemento;
	private String cep;
	
	public Endereco() {
		super();
	}

	public Endereco(String rua, String bairro, int numeroCasa,
			String complemento, String cep) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.numeroCasa = numeroCasa;
		this.Complemento = complemento;
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", numeroCasa="
				+ numeroCasa + ", Complemento=" + Complemento + ", cep=" + cep
				+ "]";
	}
	
	
	

}
