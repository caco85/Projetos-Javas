package PooProject.ProjetoAP2.Modelo;

public class Funcionario extends Empresa{
	
	
	private String cpf;
	private Endereco end;
	
	public Funcionario() {
		super();
		
	}
	public Funcionario(int codFuncionario,String nomeFuncionario, String cargo, String dataEntrada, String dataSaida, double salario,
			String horario, String dataFerias,String cpf,Endereco end) {
		super(codFuncionario, nomeFuncionario, cargo, dataEntrada, dataSaida, salario, horario, dataFerias);
		this.cpf = cpf;
		this.end = end;
	
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	
	@Override
	public String toString() {
		return "Funcionario [cpf=" + cpf + ", end=" + end + "]";
	}
	
}
