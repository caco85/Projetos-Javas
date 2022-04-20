package br.unicap.DisciplinaPIII.ProjetoComercial.Model;

/**
 *
 * @author Renato Nunes
 */
public class Empresa {
    private String codigoEmpresa;
    private String razaoSocial;
    private String CNPJ;
    private String nomeFantasia;
    private int inscricaoEstadual;
    private Endereco endereco;

    public Empresa(String codigoEmpresa, String razaoSocial, String CNPJ, String nomeFantasia, int inscricaoEstadual, Endereco endereco) {
        this.codigoEmpresa = codigoEmpresa;
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoEstadual = inscricaoEstadual;
        this.endereco = endereco;
    }
    public Empresa() {
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
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

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
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

    @Override
    public String toString() {
        return "Empresa{" + "codigoEmpresa=" + codigoEmpresa + ", razaoSocial=" + razaoSocial + ", CNPJ=" + CNPJ + ", nomeFantasia=" + nomeFantasia + ", inscricaoEstadual=" + inscricaoEstadual + ", endereco=" + endereco + '}';
    }   
}
