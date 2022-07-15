
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Unicap.grafos.vertArest.*;

public class geraGrafo {

	private ArrayList<Vertice> vertices;
	private ArrayList<Aresta> arestas;

	List<Vertice> menorCaminho = new ArrayList<Vertice>();

	List<Vertice> verticesNaoVisitados = new ArrayList<Vertice>();

	Vertice caminho;
	Vertice atual;
	Vertice vizinho;

	public geraGrafo() {

		this.vertices = new ArrayList<Vertice>();
		this.arestas = new ArrayList<Aresta>();
	}

	public void adicionarVertice(int id, String nome) {
		Vertice novoVertice = new Vertice(id, nome);
		this.vertices.add(novoVertice);
	}

	public void adicionarAresta(int id, int verticeInicioId, int verticeFimId, int peso) {
		Vertice verticeInicial = this.getVertice(verticeInicioId);

		Vertice verticeFinal = this.getVertice(verticeFimId);
		Aresta aresta = new Aresta(id, verticeInicial, verticeFinal, peso);
		verticeInicial.adicionarArestaSaida(aresta);
		verticeInicial.adicionarVerticeSaida(verticeFinal);
		verticeFinal.adicionarArestaEntrada(aresta);
		verticeFinal.adicionarVerticeEntrada(verticeInicial);
		this.arestas.add(aresta);
	}

	public Vertice getVertice(int id) {
		Vertice verticeProcurado = null;
		for (int i = 0; i < this.vertices.size(); i = i + 1) {
			if (this.vertices.get(i).getId() == id) {
				verticeProcurado = this.vertices.get(i);
				break;
			}
		}
		return verticeProcurado;
	}

	public void imprimeListaAdj() {
		int i;
		System.out.println("--- LISTA DE ADJACÊNCIA ---");
		for (i = 0; i < vertices.size(); i = i + 1) {
			System.out.println("adj " + "[" + vertices.get(i) + "]" + ": " + vertices.get(i).getVerticeSaida());
		}
	}

	public void buscaEmLargura(int verticePartida, int verticeChegada) {
		System.out.println("---BUSCA EM LARGURA ---");
		ArrayList<Vertice> marcados = new ArrayList<Vertice>();
		ArrayList<Vertice> fila = new ArrayList<Vertice>();
		Vertice verticeAtual = this.vertices.get(verticePartida - 1);
		marcados.add(verticeAtual);
		System.out
				.println("id do Vértice Atual Inicial: " + verticeAtual.getId() + ", Nome: " + verticeAtual.getNome());
		fila.add(verticeAtual);
		while (fila.size() > 0) {
			Vertice visitado = fila.get(0);
			for (int i = 0; i < visitado.getArestasSaida().size(); i = i + 1) {
				Vertice proximoVertice = visitado.getArestasSaida().get(i).getVerticeFim();
				if (!marcados.contains(proximoVertice)) {
					marcados.add(proximoVertice);

					System.out.println("Visita " + proximoVertice.getId() + ", Nome: " + proximoVertice.getNome());
					fila.add(proximoVertice);
				}
			}
			if (visitado.getId() == verticeChegada - 1) {
				break;
			}
			fila.remove(0);
		}
	}

	public List<Vertice> encontrarMenorCaminhoDijkstra(int idVertice1, int idVertice2) {
		Vertice v1 = getVertice(idVertice1);
		Vertice v2 = getVertice(idVertice2);

		menorCaminho.add(v1);

		for (int i = 0; i < this.vertices.size(); i++) {
			if (this.vertices.get(i).getId() == v1.getId()) {
				this.vertices.get(i).setDistancia(0);

			} else {
				this.vertices.get(i).setDistancia(99999);
			}

			this.verticesNaoVisitados.add(this.vertices.get(i));
		}
		Collections.sort(verticesNaoVisitados);

		while (!this.verticesNaoVisitados.isEmpty()) {

			atual = this.verticesNaoVisitados.get(0);

			for (int i = 0; i < atual.getArestasSaida().size(); i++) {
				vizinho = atual.getArestasSaida().get(i).getVerticeFim();

				if (!vizinho.verificarVisita()) {
					if (vizinho.getDistancia() > (atual.getDistancia() + atual.getArestasSaida().get(i).getPeso())) {
						vizinho.setDistancia(atual.getDistancia() + atual.getArestasSaida().get(i).getPeso());
						vizinho.setPai(atual);

						if (vizinho.equals(v2)) {
							menorCaminho.clear();
							caminho = vizinho;
							menorCaminho.add(vizinho);
							while (caminho.getPai() != null) {
								menorCaminho.add(caminho.getPai());
								caminho = caminho.getPai();
							}

							Collections.sort(menorCaminho);
						}
					}
				}
			}
			atual.visitar();
			this.verticesNaoVisitados.remove(atual);

			Collections.sort(verticesNaoVisitados);
		}

		System.out.println("--- ALGORITMO DE DJIKSTRA ---");
		System.out.println("Para obter a menor rota você deve andar pelos vértices:" + " " + menorCaminho);
		System.out.println("Distância do Percurso: " + menorCaminho.get(menorCaminho.size() - 1).getDistancia() + "m");
		return menorCaminho;
	}

}