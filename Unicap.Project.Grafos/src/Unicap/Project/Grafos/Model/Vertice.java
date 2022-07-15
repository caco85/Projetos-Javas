package Unicap.Project.Grafos.Model;


//import java.util.ArrayList;

public class Vertice {

	int id;
	String nome;
	Adjacente[] verticeAdjacente;

	public Vertice(int id, String nome){
	        this.id = id;
	        this.nome = nome;
	        this.verticeAdjacente = new Adjacente[0];
	    }

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}
	public void adicionaNoAdjacente(int id, int peso){
        Adjacente[] noAdjacente = new Adjacente[this.verticeAdjacente.length + 1];
        for(int i = 0; i < this.verticeAdjacente.length; i++){
        	noAdjacente[i] = this.verticeAdjacente[i];
        }
        noAdjacente[this.verticeAdjacente.length] = new Adjacente(id, peso);
        this.verticeAdjacente = noAdjacente;
    }

}
