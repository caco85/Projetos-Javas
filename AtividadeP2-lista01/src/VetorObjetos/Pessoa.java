
package VetorObjetos;

/**
 *
 * @author Renato Nunes 
 */
public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private double peso;
    private double altura;
    private double pesoIdeal;
    
    public Pessoa(String n,int i,char s,double p,double a,double pIdeal){
        this.nome = n;
        this.idade = i;
        this.sexo = s;
        this.peso=p;
        this.altura =a;
        this.pesoIdeal = pIdeal;
    }
    public Pessoa(){
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(double pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }
    
    public static double CalcPeso(double a,char s){
        double result;
        if (s == 'M') {
            result = (72.7*a)-58;
        }else{
            result = (62.1*a)-44.7;
        }

        return result;
    }
    public static void   exibirPessoa(Pessoa [] p){
        int i;
        for ( i = 0; i < p.length; i=i+1) {
          System.out.println( p[i]);
        }
    }
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade 
                + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", pesoIdeal=" + pesoIdeal + '}';
    }
    
    
}
    