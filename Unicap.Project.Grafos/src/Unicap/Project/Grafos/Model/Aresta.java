package Unicap.Project.Grafos.Model;

public class Aresta {
	int Id;
	int origem;
	int destino;
	int peso;
	Adjacente[] verticeAdjacente;

	public Aresta(int id, int origem, int destino, int peso) {
		this.Id = id;
		this.origem = origem;
		this.destino = destino;
		this.peso = destino;
		this.verticeAdjacente = new Adjacente[0];
		
	}

	public int getId(){
        return this.Id;
    }

	public int getOrigem() {
		return this.origem;
	}

	public int getDestino() {
		return this.destino;
	}

	public int getPeso() {
		return this.peso;
	}
	public Adjacente[] getAdjacent(){
        return this.verticeAdjacente;
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
