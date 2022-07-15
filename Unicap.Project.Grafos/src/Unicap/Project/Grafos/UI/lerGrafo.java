package Unicap.Project.Grafos.UI;

import Unicap.Project.Grafos.Model.*;
import java.util.LinkedList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lerGrafo {
	public static void main(String[] args) throws Exception {
		File repositorio;
		Scanner leitorGrafo;

		LinkedList<Aresta> listaArestas = new LinkedList<Aresta>();
		LinkedList<Vertice> vertices = new LinkedList<Vertice>();

		try {
			repositorio = new File("src/File/arestas.txt");
			leitorGrafo = new Scanner(repositorio);
			while (leitorGrafo.hasNextLine()) {
				String data = leitorGrafo.nextLine();
				String[] split = data.split(",");
				int id = Integer.parseInt(split[0]);
				int origem = Integer.parseInt(split[1]);
				int destino = Integer.parseInt(split[2]);
				int peso = Integer.parseInt(split[3]);
				Aresta ares = new Aresta(id, origem, destino, peso);
				listaArestas.add(ares);
			}
			leitorGrafo.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured reading 'arestas.txt'");
			e.printStackTrace();
		}

		try {
			repositorio = new File("src/File/vertices.txt");
			leitorGrafo = new Scanner(repositorio);
			while (leitorGrafo.hasNextLine()) {
				String data = leitorGrafo.nextLine();
				String[] split = data.split(",");
				int id = Integer.parseInt(split[0]);
				String name = split[1];
				Vertice node = new Vertice(id, name);
				vertices.add(node);
			}
			leitorGrafo.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro ao ler o 'vertices.txt'");
			e.printStackTrace();
		}
		imprimeVertices(listaArestas, vertices);
		mostraAdjacentes(listaArestas);
		System.out.println("");

	}

	public static void imprimeVertices(LinkedList<Aresta> aresta, LinkedList<Vertice> vertice) {
		System.out.println("Nós lidos a partir do txt" + "\n");
		for (int i = 0; i < vertice.size(); i++) {
			Vertice n = (Vertice) vertice.get(i);
			for (int j = 0; j < aresta.size(); j++) {
				Aresta e = (Aresta) aresta.get(j);

				if (e.getOrigem() == n.getId()) {
					n.adicionaNoAdjacente(e.getDestino(), e.getPeso());

					System.out.println("Vertice: " + n.getId() 
					+ " " + n.getNome());
				}
			}
		}
	}

	public static void mostraAdjacentes(LinkedList<Aresta> aresta) {
		int i;
		for (i = 0; i < aresta.size(); i++) {
			Aresta n = (Aresta) aresta.get(i);
			System.out.println("\n");
			System.out.println(" - " + "Aresta: " + " "  + n.getId() + " ");
			//if(n.getOrigem() == -1) {
				//System.out.println("Não possui adjacente");
			//
			
			//for (int j = 0; j < n.getAdjacent().length; j++) {

				//System.out.println("O Vértice adjacente: " + n.getAdjacent()[j].getVertex() + " " + "tem o seguinte "
						//+ "peso: " + n.getAdjacent()[j].getPesoAdj());
			}
		}
	}
	/*
	 * public static void adjacentNodes(LinkedList<Nodes> node, LinkedList<Edges>
	 * edge){ // Parse Nodes for(int i = 0; i < node.size(); i++) { Nodes n =
	 * (Nodes)node.get(i); System.out.println("O vÃ©rtice " + n.getName() +
	 * " possui os seguintes vÃ©rtices adjacentes: "); // Parse Edges for(int j = 0;
	 * j < edge.size(); j++) { Edges e = (Edges)edge.get(j); // If the id is equal
	 * to the current node if(e.getOriginNode() == n.getId()) {
	 * System.out.println("-> LigaÃ§Ã£o para o vÃ©rtice " + e.getDestinationNode() +
	 * " com peso " + e.getWeight()); } else if(e.getDestinationNode()==n.getId()) {
	 * System.out.println("-> LigaÃ§Ã£o do vÃ©rtice " + e.getOriginNode() +
	 * " com peso " + e.getWeight()); } } } }
	 */


