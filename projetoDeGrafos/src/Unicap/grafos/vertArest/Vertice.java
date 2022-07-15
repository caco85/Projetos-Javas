package Unicap.grafos.vertArest;

import java.util.ArrayList;

public class Vertice implements Comparable<Vertice> {

	private int id;
	private int distancia;
	private boolean visitado = false;
	private Vertice pai;
	private String nome;
	private ArrayList<Aresta> arestasEntrada;
	private ArrayList<Aresta> arestasSaida;
	private ArrayList<Vertice> verticeEntrada;
	private ArrayList<Vertice> verticeSaida;

	public Vertice(int id, String nome) {
		this.id = id;
		this.nome = nome;
		this.arestasEntrada = new ArrayList<Aresta>();
		this.arestasSaida = new ArrayList<Aresta>();

		this.verticeEntrada = new ArrayList<Vertice>();
		this.verticeSaida = new ArrayList<Vertice>();
		this.distancia = 0;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getDistancia() {
		return this.distancia;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

	public boolean getVisitado() {
		return this.visitado;
	}

	public void setPai(Vertice pai) {
		this.pai = pai;
	}

	public Vertice getPai() {
		return this.pai;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public ArrayList<Aresta> getArestasEntrada() {
		return arestasEntrada;
	}

	public ArrayList<Aresta> getArestasSaida() {
		return arestasSaida;
	}

	public ArrayList<Vertice> getVerticeEntrada() {
		return verticeEntrada;
	}

	public ArrayList<Vertice> getVerticeSaida() {
		return verticeSaida;
	}

	public void adicionarArestaEntrada(Aresta verticeAntecessor) {
		this.arestasEntrada.add(verticeAntecessor);
	}

	public void adicionarArestaSaida(Aresta verticeSucessor) {
		this.arestasSaida.add(verticeSucessor);
	}

	public void adicionarVerticeEntrada(Vertice verticeAntecessor) {
		this.verticeEntrada.add(verticeAntecessor);
	}

	public void adicionarVerticeSaida(Vertice verticeSucessor) {
		this.verticeSaida.add(verticeSucessor);
	}

	public void visitar() {
		this.visitado = true;
	}

	public boolean verificarVisita() {
		return visitado;
	}

	@Override
	public String toString() {
		if (this.id > 61) {
			return this.id + "-" + this.nome;
		} else {
			return this.id + ""; //
		}
	}

	public int compareTo(Vertice outroVertice) {
		if (this.getDistancia() < outroVertice.getDistancia()) {
			return -1;
		} else if (this.getDistancia() == outroVertice.getDistancia()) {
			return 0;
		}
		return 1;
	}
}
