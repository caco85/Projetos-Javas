package PooProject.ProjetoAP2.Modelo;

public class Financeiro {
	private double patrimonio;
	private double gastoMensalFuncionario;
	private double gastoMensalProduto;
	private double gastoDispesasMensais;
	private double gastoMensalPropaganda;
	private double ganhoMensalVendas;
	private int codigo;
	
	public Financeiro(double patrimonio, double gastoMensalFuncionario, double gastoMensalProduto,
			double gastoDispesasMensais, double gastoMensalPropaganda, double ganhoMensalVendas,int codigo) {
		super();
		this.patrimonio = patrimonio;
		this.gastoMensalFuncionario = gastoMensalFuncionario;
		this.gastoMensalProduto = gastoMensalProduto;
		this.gastoDispesasMensais = gastoDispesasMensais;
		this.gastoMensalPropaganda = gastoMensalPropaganda;
		this.ganhoMensalVendas = ganhoMensalVendas;
		this.codigo = codigo;
	}

	public Financeiro() {
		super();
	}

	public double getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(double patrimonio) {
		this.patrimonio = patrimonio;
	}

	public double getGastoMensalFuncionario() {
		return gastoMensalFuncionario;
	}

	public void setGastoMensalFuncionario(double gastoMensalFuncionario) {
		this.gastoMensalFuncionario = gastoMensalFuncionario;
	}

	public double getGastoMensalProduto() {
		return gastoMensalProduto;
	}

	public void setGastoMensalProduto(double gastoMensalProduto) {
		this.gastoMensalProduto = gastoMensalProduto;
	}

	public double getGastoDispesasMensais() {
		return gastoDispesasMensais;
	}

	public void setGastoDispesasMensais(double gastoDispesasMensais) {
		this.gastoDispesasMensais = gastoDispesasMensais;
	}

	public double getGastoMensalPropaganda() {
		return gastoMensalPropaganda;
	}

	public void setGastoMensalPropaganda(double gastoMensalPropaganda) {
		this.gastoMensalPropaganda = gastoMensalPropaganda;
	}

	public double getGanhoMensalVendas() {
		return ganhoMensalVendas;
	}

	public void setGanhoMensalVendas(double ganhoMensalVendas) {
		this.ganhoMensalVendas = ganhoMensalVendas;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Financeiro [patrimonio=" + patrimonio + ", gastoMensalFuncionario=" + gastoMensalFuncionario
				+ ", gastoMensalProduto=" + gastoMensalProduto + ", gastoDispesasMensais=" + gastoDispesasMensais
				+ ", gastoMensalPropaganda=" + gastoMensalPropaganda + ", ganhoMensalVendas=" + ganhoMensalVendas
				+ ", codigo=" + codigo + "]";
	}


	
	
	
}
