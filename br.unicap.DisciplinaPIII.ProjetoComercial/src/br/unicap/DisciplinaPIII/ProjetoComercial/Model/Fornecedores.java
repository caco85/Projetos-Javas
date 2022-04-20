package br.unicap.DisciplinaPIII.ProjetoComercial.Model;

/**
 *
 * @author Renato Nunes
 */
public class Fornecedores {
    private String codFornecedor;
    private String nomeFornecedor;
    private String CNPJ;   
    private String email;
    private String telefone;
    private String tipoFornecimento;
    private int qtdFornecida;
    private double valorPorUnidade;

    public Fornecedores(String codFornecedor, String nomeFornecedor, String CNPJ, String email, String telefone, String tipoFornecimento, int qtdFornecida, double valorPorUnidade) {
        this.codFornecedor = codFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.CNPJ = CNPJ;
        this.email = email;
        this.telefone = telefone;
        this.tipoFornecimento = tipoFornecimento;
        this.qtdFornecida = qtdFornecida;
        this.valorPorUnidade = valorPorUnidade;
    }

    public Fornecedores(String codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public String getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(String codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }
    
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
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

    public String getTipoFornecimento() {
        return tipoFornecimento;
    }

    public void setTipoFornecimento(String tipoFornecimento) {
        this.tipoFornecimento = tipoFornecimento;
    }

    public int getQtdFornecida() {
        return qtdFornecida;
    }

    public void setQtdFornecida(int qtdFornecida) {
        this.qtdFornecida = qtdFornecida;
    }

    public double getValorPorUnidade() {
        return valorPorUnidade;
    }

    public void setValorPorUnidade(double valorPorUnidade) {
        this.valorPorUnidade = valorPorUnidade;
    }

    @Override
    public String toString() {
        return "Fornecedores{" + "codFornecedor=" + codFornecedor + ", nomeFornecedor=" + nomeFornecedor + ", CNPJ=" + CNPJ + ", email=" + email + ", telefone=" + telefone + ", tipoFornecimento=" + tipoFornecimento + ", qtdFornecida=" + qtdFornecida + ", valorPorUnidade=" + valorPorUnidade + '}';
    }

  
}
