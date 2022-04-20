
package Arvore;

/**
 *
 * @author Renato Nunes
 */
public class Pessoa implements Comparable <Pessoa>{
    private final String nome;
    private int idade;
    private char genero;
    private double peso, altura;
    
    public Pessoa (String nome) {
        this.nome = nome;
    }
    
    public void setIdade (int idade) {
        this.idade = idade;
    }
    
    public void setGenero (char genero) {
        this.genero = genero;
    }
    public void setPeso (double peso) {
        this.peso = peso;
    }
    
    public void setAltura (double altura) {
        this.altura = altura;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public int getIdade () {
        return this.idade;
    }
    
    public char getGenero () {
        return this.genero;
    }
    
    public double getPeso () {
        return this.peso;
    }
    
    public double getAltura () {
        return this.altura;
    }
    
    public String toString () {
        return this.nome + " " + this.idade + " " + this.genero + " " + this.peso + " " + this.altura;
    }
    
    public int compareTo (Pessoa p){
        return this.nome.compareTo(p.nome);
    }
}
