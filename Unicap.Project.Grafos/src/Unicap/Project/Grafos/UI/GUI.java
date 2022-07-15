package Unicap.Project.Grafos.UI;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.LinkedList;
//import java.util.List;
import java.util.PriorityQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Unicap.Project.Grafos.Model.Adjacente;
import Unicap.Project.Grafos.Model.Aresta;
import Unicap.Project.Grafos.Model.Vertice;
import Unicap.Project.Grafos.distancia.calculaDistancia;

public class GUI {
	public static void main(String[] args) throws Exception {

		File file;
		Scanner leitorGrafo;
		// Lists
		LinkedList<Vertice> listaVertices = new LinkedList<Vertice>();
		LinkedList<Aresta> listaArestas = new LinkedList<Aresta>();
		// Read the file, Edges
		try {
			file = new File("src/File/arestas.txt");
			leitorGrafo = new Scanner(file);
			while (leitorGrafo.hasNextLine()) {
				String data = leitorGrafo.nextLine();
				String[] split = data.split(",");
				int id = Integer.parseInt(split[0]);
				int ori = Integer.parseInt(split[1]);
				int dest = Integer.parseInt(split[2]);
				int pes = Integer.parseInt(split[3]);
				Aresta aresta = new Aresta(id, ori, dest, pes);
				listaArestas.add(aresta);
			}
			leitorGrafo.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured reading 'arestas.txt'");
			e.printStackTrace();
		}
		// Read the file, Nodes
		try {
			file = new File("src/File/vertices.txt");
			leitorGrafo = new Scanner(file);
			while (leitorGrafo.hasNextLine()) {
				String data = leitorGrafo.nextLine();
				String[] split = data.split(",");
				int id = Integer.parseInt(split[0]);
				String name = split[1];
				Vertice node = new Vertice(id, name);
				listaVertices.add(node);
			}
			leitorGrafo.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured reading 'vertices.txt'");
			e.printStackTrace();
		}

		int tamanho = listaVertices.size();
		ArrayList<ArrayList<Adjacente>> graph = new ArrayList<>();
		for (int i = 0; i < tamanho; i++) {
			graph.add(new ArrayList<>());
		}

		setAdjacentNodes(listaVertices, listaArestas, graph);
		int verticeProcurado = 2;
		calculaDistancia resultDijkstra = dijkstra(tamanho, graph, verticeProcurado);
		int[] distanceDijkstra = resultDijkstra.getDistance();
		int[] antDijkstra = resultDijkstra.getAnt();

		for (int i = 0; i < tamanho; i++) {  //
			System.out.println("");

			if (distanceDijkstra[i] == Integer.MAX_VALUE) {

				System.out.println("Distancia do vertice " + listaVertices.get(i).getId() + " para o vertice "
						+ verticeProcurado + ": INFINITO (inacessível)");
				System.out.println("Caminho: " + "Não existe caminho");
			}

			else if (listaVertices.get(i).getId() == verticeProcurado) {
				System.out.println("Distancia do vertice " + listaVertices.get(i).getId() + " para o vertice "
						+ verticeProcurado + " : 0m " + " ");
			}

			else if (listaVertices.get(i).getId() == verticeProcurado + 1) {
				System.out.println("Distancia do vertice " + listaVertices.get(i).getId() + " para o vertice "
						+ verticeProcurado + ": " + "[" + (distanceDijkstra[i] + Integer.MAX_VALUE) + "m] "
						+ "Caminho: " + antDijkstra[i] + "m ");
			}

			else {
				System.out.println("Distancia do vertice " + listaVertices.get(i).getId() + " para o vertice "
						+ verticeProcurado + ": " + "[" + (distanceDijkstra[i] + Integer.MAX_VALUE + 2) + "m] "
						+ "Caminho: " + antDijkstra[i] + "m ");
				System.out.println();
			}
		}

		System.out.println("");

	}

	public static calculaDistancia dijkstra(int Vert, ArrayList<ArrayList<Adjacente>> grafo, int source) {
		int[] distancia = new int[Vert];
		int[] ant = new int[Vert];

		for (int i = 0; i < Vert; i++)
			distancia[i] = Integer.MAX_VALUE;

		PriorityQueue<Adjacente> lista = new PriorityQueue<>((v1, v2) -> v1.getPesoAdj() - v2.getPesoAdj());
		lista.add(new Adjacente(source, 0));

		while (lista.size() > 0) {

			Adjacente atual = lista.poll();
			ArrayList<Adjacente> listaDoVertice = grafo.get(atual.getVertex() - 1);

			for (Adjacente n : listaDoVertice) {

				if (distancia[atual.getVertex() - 1] + n.getPesoAdj() < distancia[n.getVertex() - 1]) {
					ant[n.getVertex() - 1] = atual.getVertex();
					distancia[n.getVertex() - 1] = n.getPesoAdj() + distancia[atual.getVertex() - 1];
					lista.add(new Adjacente(n.getVertex(), distancia[n.getVertex() - 1]));

				}
			}

		}
		distancia[source - 1] = 0;
		ant[source - 1] = 0;
		calculaDistancia res = new calculaDistancia(distancia, ant);
		return res;
	}

	public static void setAdjacentNodes(LinkedList<Vertice> listaVertices, LinkedList<Aresta> listaArestas,
			ArrayList<ArrayList<Adjacente>> grafo) {
		for (int i = 0; i < listaVertices.size(); i++) {
			Vertice node = listaVertices.get(i);

			for (int j = 0; j < listaArestas.size(); j++) {
				Aresta aresta = listaArestas.get(j);

				if (aresta.getOrigem() == node.getId()) {
					int id = aresta.getDestino();
					int peso = aresta.getPeso();
					grafo.get(i).add(new Adjacente(id, peso));

				} else if (aresta.getDestino() == node.getId()) {
					int id = aresta.getOrigem();
					int peso = aresta.getPeso();
					grafo.get(i).add(new Adjacente(id, peso));
				}

			}
		}
	}
}
