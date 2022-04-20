package GQ_2;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        int[][] tabela = new int[3][4];
        String[] lojas = new String[3];
        String[] produtos = new String[4];

        Scanner in = new Scanner(System.in);
        int menu;
        do {
            Menu();
            menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Informe as lojas que fazem parte do estabelicimento !");
                    System.out.println();
                    lojas(lojas);

                    System.out.println("Informe os produtos ofertados nas lojas ");
                    System.out.println();
                    produtos(produtos);

                    System.out.println();
                    preencherTabela(tabela, produtos, lojas);
                    break;

                case 2:
                    totalPorEstabelecimento(tabela, lojas);
                    break;
                case 3:
                    total2(tabela, produtos);

            }

        } while (menu != 0);
    }

    public static void produtos(String[] P) {
        int i;
        Scanner in = new Scanner(System.in);
        for (i = 0; i < P.length ; i++) {
            System.out.print("produto " + (i + 1) + " :");
            P[i] = in.nextLine();
        }
    }

    public static void lojas(String[] L) {
        int i;
        Scanner in = new Scanner(System.in);
        for (i = 0; i < L.length ; i++) {
            System.out.print("loja " + (i + 1) + " :");
            L[i] = in.nextLine();
        }
    }

    public static void preencherTabela(int[][] tabela, String[] produto, String[] loja) {
        int l, c;
        Scanner in = new Scanner(System.in);
        for (c = 0; c < loja.length ; c++) {
            for (l = 0; l < produto.length ; l++) {
                System.out.print("Informe a quantidade  estocada na loja " + loja[c]);
                System.out.print(" do produto " + produto[l] + ": ");
                tabela[c][l] = in.nextInt();
            }
        }
    }

    public static void totalPorEstabelecimento(int[][] tabela, String[] loja) {
        int l, c;
        int soma = 0;
        for (l = 0; l < tabela.length ; l++) {
            soma = 0;
            for (c = 0; c < tabela[0].length ; c++) {
                soma = soma + tabela[l][c];
            }
            tabela[l][3] = soma;
            System.out.println("total de produtos estocados na loja " + loja[l] + " é de " + soma);
        }
    }

    public static void total2(int[][] tabela, String[] produto) {
        int l, c;
        int soma = 0;
        for (l = 0; l < tabela.length ; l++) {
            soma = 0;
            for (c = 0; c < tabela[l].length ; c++) {
                soma = soma + tabela[l][c];
            }
            tabela[l][3] = soma;
            System.out.println("total de produtos estocados na loja " + produto[l] + " é de " + soma);
        }
    }

    public static void Menu() {
        System.out.println("");
        System.out.println("           MENU");
        System.out.println("1: preencher tabela  ");
        System.out.println("2: Quantidade total de produtos etocados nas lojas");
        System.out.println("3:  soma das colunas");
        System.out.println("0: Finalizar  ");
        System.out.println("");
    }

}
