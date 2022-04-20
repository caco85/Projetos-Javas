package AtividadeMatrizes;
import java.util.*;

/**
 *
 * @author Renato Nunes
 */
public class ListaMatrizesAPP {

        public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
        int opcMenu;
        double mediaT;
        String[] nomes = new String[20];
        double[][] matrizNotasMedia = new double[20][3];
        do {
            System.out.println("Digite a opção de teste dos exercicio  escolha de 1 a 6 ou 0 para sair");
            opcMenu = scanner.nextInt();
            switch (opcMenu) {
                case 1://questão 1

                    String[] notaMedia = {"Primeira Nota", "Segunda Nota", "Media"};
                    FuncoesMatrizes.preencherNomeMedia(nomes, matrizNotasMedia, notaMedia);
                    FuncoesMatrizes.exibirNomeMedia(nomes, matrizNotasMedia);
                    break;
                case 2://questão 2
                    mediaT = FuncoesMatrizes.mediaTurma(matrizNotasMedia);
                    //System.out.println("A media da turma foi: "+ mediaT);
                    System.out.println("A quantidade de alunos abaixo da media: " + mediaT + " Foram: "
                            + FuncoesMatrizes.qtdAbaixoMedia(matrizNotasMedia, mediaT));
                    System.out.println("");
                    FuncoesMatrizes.imprimeMenoreMaiorMedia(matrizNotasMedia);
                    break;
                case 3: //questão 3
                    int maiorInt;
                    int[][] mat1 = new int[5][5];
                    int[][] mat2 = new int[5][5];
                    FuncoesMatrizes.preencherMatriz(mat1);
                    maiorInt = FuncoesMatrizes.maiorIntMatriz(mat1);
                    FuncoesMatrizes.preencherMatrizMultMaior(mat1, mat2, maiorInt);
                    FuncoesMatrizes.exibirMatriz(mat1);
                    System.out.println("");
                    FuncoesMatrizes.exibirMatriz(mat2);
                    System.out.println("");
                    break;
                case 4: //questão 4
                    String[] nomes2 = new String[5];
                    double[][] matrizNotas = new double[5][5];
                    FuncoesMatrizes.preencherNomeNotas(nomes2, matrizNotas);
                    FuncoesMatrizes.exibirNomeNota(nomes2, matrizNotas);
                    break;
                case 5: //questão 5
                    int[][] a = new int[3][4];
                    int[][] b = new int[4][3];
                    System.out.println("Preenchimento da matriz A");
                    FuncoesMatrizes.preencherMatriz(a);
                    FuncoesMatrizes.calcularTransposta(a, b);
                    break;
                case 6:        //questão 6
                    int subMenu;
                    String nomeFruta,
                     mesInf;
                    double[][] tabela = new double[9][13];
                    String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
                    String[] frutas = {"abacaxi", "banana", "maça", "mamão", "melancia", "melão", "tangerina", "uva"};

                    do {
                        System.out.println("Digite a opção desejada:  1 preencher a tabela 2 faturamente medio mensal"
                                + "\n 3 valor anual da fruta 4 valor arrecado no mes "
                                + "\n 5 valor anual e  0 para sair ");
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println("Preenchimento da tabela de vendas");
                                FuncoesMatrizes.preencherTabela(tabela, meses, frutas);
                                break;
                            case 2:
                                System.out.println("o faturamento medio mensal é: " + FuncoesMatrizes.fatMediaMes(tabela));
                                System.out.println();
                                break;
                            case 3:
                                System.err.println("Digite o nome da fruta que quer saber o valor arrecado anual dela: ");
                                nomeFruta = scanner.nextLine();
                                System.out.println("O valor anual da Fruta" + nomeFruta + FuncoesMatrizes.valorAnualFruta(tabela, frutas, nomeFruta));
                                System.out.println();
                                break;
                            case 4:
                                System.err.println("Digite o nome do mes que quer saber o valor arrecado neste mes: ");
                                mesInf = scanner.nextLine();
                                System.out.println("O valor arrecado no mes " + mesInf + FuncoesMatrizes.valorMes(tabela, meses, mesInf));

                                break;
                            case 5:
                                System.out.println("O valor anual foi: " + FuncoesMatrizes.valorAnual(tabela));
                                System.out.println();

                                break;
                            case 0:
                                System.out.println("Você escolheu a opção sair, Obrigado! ");
                                break;
                            default:
                                System.err.println("Você escolheu uma opção invalida");

                        }
                    } while (subMenu != 0);
                    break;
                case 0:
                    System.out.println("Você escolheu a opção sair obrigado!: ");
                    break;
                default:
                    System.err.println("Você esoclheu uma opção invalida: ");
            }

        } while (opcMenu != 0);

    }
}
