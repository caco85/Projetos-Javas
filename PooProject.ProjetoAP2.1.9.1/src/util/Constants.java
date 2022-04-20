package util;

public class Constants {

	public enum Produtos{
		//ovo Trufados
		OvoTrufadoPMor(1,"Ovo Trufado Pequeno",10.0,"Morango"),
		OvoTrufadoPChoco(2,"Ovo Trufado Pequeno",10.0,"Chocolate"),
		OvoTrufadoPPres(3,"Ovo Trufado Pequeno",10.0,"Prestigo"),
		OvoTrufadoPChoba(4,"Ovo Trufado Pequeno",10.0,"ChocoBanana"),
		OvoTrufadoMMor(5,"Ovo Trufado Medio",15.0,"Morango"),
		OvoTrufadoMChoco(6,"Ovo Trufado Medio",15.0,"Chocolate"),
		OvoTrufadoMPres(7,"Ovo Trufado Medio",15.0,"Prestigio"),
		OvoTrufadoMChoba(8,"Ovo Trufado Pequeno",15.0,"ChocoBanana"),
		OvoTrufadoGMor(9,"Ovo Trufado Grande",20.0,"Morango"),
		OvoTrufadoGChoco(10,"Ovo Trufado Grande",20.0,"Chocolate"),
		OvoTrufadoGPres(11,"Ovo Trufado Grande",20.0,"Prestigio"),
		OvoTrufadoGChoba(12,"Ovo Trufado Grande",20.0,"ChocoBanana"),
		//ovo de colhher
		OvoColherdoPMor(13,"Ovo Colher Pequeno",15.0,"Morango"),
		OvoColherPChoco(14,"Ovo Colher Pequeno",15.0,"Chocolate"),
		OvoColherPPres(15,"Ovo Colher Pequeno",15.0,"Prestigo"),
		OvoColherPChoba(16,"Ovo Colher Pequeno",15.0,"ChocoBanana"),
		OvoColherMMor(17,"Ovo Colher Medio",20.0,"Morango"),
		OvoColherMChoco(18,"Ovo Colher Medio",20.0,"Chocolate"),
		OvoColherMPres(19,"Ovo Colher Medio",20.0,"Prestigio"),
		OvoColherMChoba(20,"Ovo Colher Medio",20.0,"ChocoBanana"),
		OvoColherGMor(21,"Ovo Colher Grande",25.0,"Morango"),
		OvoColherGChoco(22,"Ovo Colher Grande",25.0,"Chocolate"),
		OvoColherGPres(23,"Ovo Colher Grande",25.0,"Prestigio"),
		OvoColherGChoba(24,"Ovo Colher Grande",25.0,"ChocoBanana"),
		
		//trufas
		trufaMor(25,"trufa",2.0,"Morango"),
		trufaChoco(26,"trufa",2.0,"Chocolate"),
		trufaPres(27,"trufa",2.0,"Prestigio"),
		trufaChoba(28,"trufa",2.0,"Chocobanana"),
		trufaMar(29,"trufa",2.0,"Maracuja"),
		trufaBC(30,"trufa",2.0,"Bem Casado");
		
		private int codigo;
		private String nome;
		private double preco;
		private String recheio;
		private Produtos(int codigo, String nome, double preco, String recheio) {
			this.codigo = codigo;
			this.nome = nome;
			this.preco = preco;
			this.recheio = recheio;
		}
		public int getCodigo() {
			return codigo;
		}
		public String getNome() {
			return nome;
		}
		public double getPreco() {
			return preco;
		}
		public String getRecheio() {
			return recheio;
		}		
		
	}
	public enum Funcionarios{
		Vendedor("Vendedor","das 8h as 16h",1000.0),
		Gerente("Gerente","das 8h as 18h",2000.0),
		Entregador("Entregador","das 8h as 18h",1700.0),
		Cozinheiro("Cozinheiro","das 9h as 17h",1500.0);
		
		private String cargo;
		private String horario;
		private double salario;
		private Funcionarios(String cargo, String horario, double salario) {
			this.cargo = cargo;
			this.horario = horario;
			this.salario = salario;
		}
		public String getCargo() {
			return cargo;
		}
		public String getHorario() {
			return horario;
		}
		public double getSalario() {
			return salario;
		}	
	}
}
