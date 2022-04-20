package atividadep2.lista01;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class GUI {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int d, m, a, qtdDia;
//        System.out.print("Digite o ano ");
//        a = scanner.nextInt();
//        System.out.print("Digite o mes ");
//        m = scanner.nextInt();
//        System.out.print("Digite o dia ");
//        d = scanner.nextInt();

        Data d1 = new Data(15, 3, 1985);
        Data d2 = new Data(20, 10, 1988);
        Data d3 = new Data(20,12,2000);

        d1.imprimirData();
        d2.imprimirDataExtenso();
//        System.out.print("Digite a quantidade de dias");
//        qtdDia = scanner.nextInt();
        d3.imprimirNovaData(70);

        d1.imprimirDiferencaData(d2);
    }

}
