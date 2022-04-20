
//import List.adjacente;
import List.aresta;
import List.vertice;
import java.util.LinkedList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class geraGrafo {
	public static void main(String[] args) throws Exception {
		File repositorio;
		Scanner leitorGrafo;

		LinkedList<aresta> listaArestas = new LinkedList<aresta>();
		LinkedList<vertice> listEdges = new LinkedList<vertice>();

		try {
			repositorio = new File("src/File/arestas.txt");
			leitorGrafo = new Scanner(repositorio);
			while (leitorGrafo.hasNextLine()) {
				String data = leitorGrafo.nextLine();
				String[] split = data.split(",");
				int id = Integer.parseInt(split[0]);
				int origem = Integer.parseInt(split[1]);
				int destino = Integer.parseInt(split[2]);
				double peso = Double.parseDouble(split[3]);
				vertice vert = new vertice(id, origem, destino, peso);
				listEdges.add(vert);
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
				aresta node = new aresta(id, name);
				listaArestas.add(node);
			}
			leitorGrafo.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro ao ler o 'vertices.txt'");
			e.printStackTrace();
		}
		eNoAdjacente(listaArestas, listEdges);
		mostraAdjacentes(listaArestas);
		System.out.println("");

	}

	public static void eNoAdjacente(LinkedList<aresta> vertice, LinkedList<vertice> aresta) {
		System.out.println("N�s lidos a partir do txt" + "\n");
		for (int i = 0; i < vertice.size(); i++) {
			aresta n = (aresta) vertice.get(i);
			for (int j = 0; j < aresta.size(); j++) {
				vertice e = (vertice) aresta.get(j);
				
				if (e.getOriginNode() == n.getId()) {
					n.adicionaNoAdjacente(e.getDestinationNode(), e.getWeight());
					
					System.out.println("N� Adjacente" + n.getName());
				}
			}
		}
	}

	public static void mostraAdjacentes(LinkedList<aresta> vertice) {
		int i;
		for (i = 0; i < vertice.size(); i++) {
			aresta n = (aresta) vertice.get(i);
			System.out.println("\n");
			System.out.println(" - " + "O V�rtice " + n.getName() + " possui os seguintes v�rtices adjacentes: ");
			System.out.println("\n");
			for (int j = 0; j < n.getAdjacent().length; j++) {
				
				System.out.println("O V�rtice adjacente: " 
			+ n.getAdjacent()[j].getId() + " " + "tem o seguinte " 
						+ "peso: " + n.getAdjacent()[j].getPeso());
			}
		}
	}
	/*
	 * public static void adjacentNodes(LinkedList<Nodes> node, LinkedList<Edges>
	 * edge){ // Parse Nodes for(int i = 0; i < node.size(); i++) { Nodes n =
	 * (Nodes)node.get(i); System.out.println("O vértice " + n.getName() +
	 * " possui os seguintes vértices adjacentes: "); // Parse Edges for(int j = 0;
	 * j < edge.size(); j++) { Edges e = (Edges)edge.get(j); // If the id is equal
	 * to the current node if(e.getOriginNode() == n.getId()) {
	 * System.out.println("-> Ligação para o vértice " + e.getDestinationNode() +
	 * " com peso " + e.getWeight()); } else if(e.getDestinationNode()==n.getId()) {
	 * System.out.println("-> Ligação do vértice " + e.getOriginNode() +
	 * " com peso " + e.getWeight()); } } } }
	 */

}
