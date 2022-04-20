package PooProject.ProjetoAP2.Modelo;

public class Venda extends Produto {

	private int codVenda;
	private int tipoPagamento;
	private double valorRecebido;
	private int qtdVenda;
	
	public Venda(int codProduto, String nomeProduto, String tipoProduto ,int qtdProduto, double preco, int codVenda, int tipoPagamento,
			double valorRecebido, int qtdVenda) {
		super(codProduto, nomeProduto, tipoProduto, qtdProduto, preco);
		this.codVenda = codVenda;
		this.tipoPagamento = tipoPagamento;
		this.valorRecebido = valorRecebido;
		this.qtdVenda = qtdVenda;
	}
	
	public Venda(){
		super();
	}
	
	public Venda(int codProduto, String nomeProduto,String tipoProduto, int qtdProduto, double preco, int codVenda, int tipoPagamento,
			double valorRecebido) {
		super(codProduto, nomeProduto, tipoProduto,qtdProduto, preco);
		this.codVenda = codVenda;
		this.tipoPagamento = tipoPagamento;
		this.valorRecebido = valorRecebido;
		
	}
	public int getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}

	public int getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(int tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public double getValorRecebido() {
		return valorRecebido;
	}

	public void setValorRecebido(double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}

	public int getQtdVenda() {
		return qtdVenda;
	}

	public void setQtdVenda(int qtdVenda) {
		this.qtdVenda = qtdVenda;
	}

	@Override
	public String toString() {
		return "Venda [codVenda=" + codVenda + ", tipoPagamento=" + tipoPagamento + ", valorRecebido=" + valorRecebido
				+ ", qtdVenda=" + qtdVenda + "]";
	}

	
}
