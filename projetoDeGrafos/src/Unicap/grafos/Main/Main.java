package Unicap.grafos.Main;

import java.util.Scanner;

import Unicap.grafos.geraGrafo.*;

public class Main {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int idVerticeIda;
			int idVerticeFimm;

			geraGrafo grafo = new geraGrafo();
			// ##ADICIONAR V�RTICES## (id: int, nome: String)

			grafo.adicionarVertice(1, "Bloco A");
			grafo.adicionarVertice(2, "Centro Cultural");
			grafo.adicionarVertice(3, "Bloco G");
			grafo.adicionarVertice(4, "Blogo G4");
			grafo.adicionarVertice(5, "Bloco B");
			grafo.adicionarVertice(6, "Bloco D");
			grafo.adicionarVertice(7, "Bloco R");
			grafo.adicionarVertice(8, "Salão Receptivo");
			grafo.adicionarVertice(9, "Jardim");
			grafo.adicionarVertice(10, "Biblioteca Central");
			grafo.adicionarVertice(11, "Quadra de Esportes");
			grafo.adicionarVertice(12, "Fase Gráfica");
			grafo.adicionarVertice(13, "Residência dos Jesuitas");
			grafo.adicionarVertice(14, "Capela");
			grafo.adicionarVertice(15, "Posto Médico");
			grafo.adicionarVertice(16, "Entrada estacionamento");
			grafo.adicionarVertice(17, "Entrada Rua Gen. José Semeão");
			grafo.adicionarVertice(18, "Entrada 2");
			grafo.adicionarVertice(19, "Ponto Médio fase gráfica/BlocoA");
			grafo.adicionarVertice(20, "Ponto Médio quadra Bloco A");
			grafo.adicionarVertice(21, "Ponto Médio Resid�ncia dos Jesu�tas/Lanchonete");
			grafo.adicionarVertice(22, "Lanchonete");
			grafo.adicionarVertice(23, "Ponto Médio Quadra/BlocoA");
			grafo.adicionarVertice(24, "Ponto Médio Residência dos Jesuítas/Lanchonete");
			grafo.adicionarVertice(25, "Lanchonete");
			grafo.adicionarVertice(26, "Entrada 1 Rua Bernardo Guimarães");
			grafo.adicionarVertice(27, "Lanchonete Externa");
			grafo.adicionarVertice(28, "Quioesques 1");
			grafo.adicionarVertice(29, "Entrada 2 Rua Bernardo Guimarães");
			grafo.adicionarVertice(30, "Quioesques 2");
			grafo.adicionarVertice(31, "Entrada 3 Rua Bernardo Guimarães");
			grafo.adicionarVertice(32, "Entrada 2");
			grafo.adicionarVertice(33, "Ponto Médio Jardim/Salão Receptivo");
			grafo.adicionarVertice(34, "Ponto Médio Sal�o Receptivo/Entrada Bloco G");
			grafo.adicionarVertice(35, "Ponto Médio Biblioteca Central/Entrada Bloco G");
			grafo.adicionarVertice(36, "Entrada Rua Almeira Cunha");
			grafo.adicionarVertice(37, "Saída Bloco G");
			grafo.adicionarVertice(38, "Entrada 2 Rua Almeira Cunha");
			grafo.adicionarVertice(39, "Ponto Médio Rua Bernardo Guimarães");

			// ##ADICIONAR ARESTAS## (id: int, idVerticeOrigem: int, idVerticeFinal: int,
			// peso: int)

			grafo.adicionarAresta(1, 18, 12, 28);
			grafo.adicionarAresta(2, 18, 19, 55);
			grafo.adicionarAresta(3, 19, 12, 28);
			grafo.adicionarAresta(4, 19, 20, 20);
			grafo.adicionarAresta(5, 19, 2, 27);
			grafo.adicionarAresta(6, 20, 1, 27);
			grafo.adicionarAresta(7, 20, 11, 24);
			grafo.adicionarAresta(8, 20, 2, 27);
			grafo.adicionarAresta(9, 11, 23, 5);
			grafo.adicionarAresta(10, 23, 1, 5);
			grafo.adicionarAresta(11, 23, 6, 40);
			grafo.adicionarAresta(12, 23, 25, 44);
			grafo.adicionarAresta(13, 6, 25, 10);
			grafo.adicionarAresta(14, 1, 25, 26);
			grafo.adicionarAresta(15, 1, 22, 35);
			grafo.adicionarAresta(16, 2, 16, 16);
			grafo.adicionarAresta(17, 2, 21, 10);
			grafo.adicionarAresta(18, 16, 18, 50);
			grafo.adicionarAresta(19, 16, 21, 20);
			grafo.adicionarAresta(20, 16, 17, 37);
			grafo.adicionarAresta(21, 16, 15, 25);
			grafo.adicionarAresta(22, 17, 26, 135);
			grafo.adicionarAresta(23, 21, 15, 20);
			grafo.adicionarAresta(24, 21, 22, 22);
			grafo.adicionarAresta(25, 15, 14, 22);
			grafo.adicionarAresta(26, 14, 22, 14);
			grafo.adicionarAresta(27, 22, 24, 15);
			grafo.adicionarAresta(28, 24, 14, 20);
			grafo.adicionarAresta(29, 24, 13, 14);
			grafo.adicionarAresta(30, 24, 5, 32);
			grafo.adicionarAresta(31, 24, 25, 35);
			grafo.adicionarAresta(32, 13, 5, 32);
			grafo.adicionarAresta(33, 5, 25, 25);
			grafo.adicionarAresta(34, 5, 29, 25);
			grafo.adicionarAresta(35, 29, 25, 42);
			grafo.adicionarAresta(36, 29, 30, 16);
			grafo.adicionarAresta(37, 30, 31, 46);
			grafo.adicionarAresta(38, 31, 39, 95);
			grafo.adicionarAresta(40, 29, 28, 35);
			grafo.adicionarAresta(41, 28, 27, 36);
			grafo.adicionarAresta(42, 27, 26, 26);
			grafo.adicionarAresta(43, 29, 32, 23);
			grafo.adicionarAresta(44, 12, 18, 28);
			grafo.adicionarAresta(45, 19, 18, 55);
			grafo.adicionarAresta(46, 12, 19, 28);
			grafo.adicionarAresta(47, 20, 19, 20);
			grafo.adicionarAresta(48, 2, 19, 27);
			grafo.adicionarAresta(49, 1, 20, 27);
			grafo.adicionarAresta(50, 11, 20, 24);
			grafo.adicionarAresta(51, 2, 20, 27);
			grafo.adicionarAresta(52, 23, 11, 5);
			grafo.adicionarAresta(53, 1, 23, 5);
			grafo.adicionarAresta(54, 6, 23, 40);
			grafo.adicionarAresta(55, 25, 23, 44);
			grafo.adicionarAresta(56, 25, 6, 10);
			grafo.adicionarAresta(57, 25, 1, 26);
			grafo.adicionarAresta(58, 2, 1, 35);
			grafo.adicionarAresta(59, 16, 2, 16);
			grafo.adicionarAresta(60, 21, 2, 10);
			grafo.adicionarAresta(61, 18, 16, 50);
			grafo.adicionarAresta(62, 21, 16, 20);
			grafo.adicionarAresta(63, 17, 16, 37);
			grafo.adicionarAresta(64, 15, 16, 25);
			grafo.adicionarAresta(65, 26, 17, 135);
			grafo.adicionarAresta(66, 15, 21, 20);
			grafo.adicionarAresta(67, 22, 21, 22);
			grafo.adicionarAresta(68, 14, 15, 22);
			grafo.adicionarAresta(69, 22, 14, 14);
			grafo.adicionarAresta(70, 24, 22, 15);
			grafo.adicionarAresta(71, 14, 24, 20);
			grafo.adicionarAresta(72, 13, 24, 14);
			grafo.adicionarAresta(73, 5, 24, 32);
			grafo.adicionarAresta(74, 25, 24, 35);
			grafo.adicionarAresta(75, 5, 13, 32);
			grafo.adicionarAresta(76, 25, 5, 25);
			grafo.adicionarAresta(77, 29, 5, 25);
			grafo.adicionarAresta(78, 25, 29, 42);
			grafo.adicionarAresta(79, 30, 29, 16);
			grafo.adicionarAresta(80, 31, 30, 46);
			grafo.adicionarAresta(81, 39, 31, 95);
			grafo.adicionarAresta(82, 18, 39, 57);
			grafo.adicionarAresta(83, 28, 29, 35);
			grafo.adicionarAresta(84, 27, 28, 36);
			grafo.adicionarAresta(85, 26, 27, 26);
			grafo.adicionarAresta(86, 32, 29, 23);
			grafo.adicionarAresta(87, 32, 9, 39);
			grafo.adicionarAresta(88, 9, 32, 39);
			grafo.adicionarAresta(89, 32, 8, 12);
			grafo.adicionarAresta(90, 8, 32, 12);
			grafo.adicionarAresta(91, 9, 10, 28);
			grafo.adicionarAresta(92, 10, 9, 28);
			grafo.adicionarAresta(93, 9, 33, 22);
			grafo.adicionarAresta(94, 33, 9, 22);
			grafo.adicionarAresta(95, 9, 35, 17);
			grafo.adicionarAresta(96, 35, 9, 17);
			grafo.adicionarAresta(97, 10, 35, 20);
			grafo.adicionarAresta(98, 35, 10, 20);
			grafo.adicionarAresta(99, 10, 4, 38);
			grafo.adicionarAresta(100, 4, 10, 38);
			grafo.adicionarAresta(101, 4, 35, 70);
			grafo.adicionarAresta(102, 35, 4, 70);
			grafo.adicionarAresta(103, 4, 3, 85);
			grafo.adicionarAresta(104, 3, 4, 85);
			grafo.adicionarAresta(105, 35, 3, 20);
			grafo.adicionarAresta(106, 3, 35, 20);
			grafo.adicionarAresta(107, 35, 33, 25);
			grafo.adicionarAresta(108, 33, 35, 25);
			grafo.adicionarAresta(109, 35, 34, 31);
			grafo.adicionarAresta(110, 34, 35, 31);
			grafo.adicionarAresta(111, 34, 3, 31);
			grafo.adicionarAresta(112, 3, 34, 31);
			grafo.adicionarAresta(113, 33, 8, 12);
			grafo.adicionarAresta(114, 8, 33, 12);
			grafo.adicionarAresta(115, 34, 8, 12);
			grafo.adicionarAresta(116, 8, 34, 12);
			grafo.adicionarAresta(117, 34, 7, 28);
			grafo.adicionarAresta(118, 7, 34, 28);
			grafo.adicionarAresta(119, 7, 3, 57);
			grafo.adicionarAresta(120, 3, 7, 57);
			grafo.adicionarAresta(121, 3, 37, 24);
			grafo.adicionarAresta(122, 37, 3, 24);
			grafo.adicionarAresta(123, 37, 38, 83);
			grafo.adicionarAresta(124, 38, 37, 83);
			grafo.adicionarAresta(125, 38, 31, 86);
			grafo.adicionarAresta(126, 31, 38, 86);
			grafo.adicionarAresta(127, 37, 36, 103);
			grafo.adicionarAresta(128, 36, 37, 103);
			grafo.adicionarAresta(129, 36, 26, 77);
			grafo.adicionarAresta(130, 26, 36, 77);

//----------------------------------------------------------------------------------------------//
			System.out.print("Vértice de partida do percurso: ");
			idVerticeIda = entrada.nextInt();
			System.out.print("Vértice de chegada do percurso: ");
			idVerticeFimm = entrada.nextInt();
			System.out.println("");

			grafo.imprimeListaAdj();// ---> Imprime a Lista de Adjac�ncia
			grafo.buscaEmLargura(idVerticeIda, idVerticeFimm); // ---> Fazer a Busca em Largura

			grafo.encontrarMenorCaminhoDijkstra(idVerticeIda, idVerticeFimm); // ---> Aplica o Algor�timo de Dijkstra
		}
	}
}
