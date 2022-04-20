package Provap12GQ;

import java.util.Scanner;

/**
 * 6.
 *
 */
public class Provap12gq {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int continuacao = 1, filho, categoria, f, cont = 0;
        double media1 = 0, media2 = 0, media3 = 0, salario = 0, total = 0, valor = 0, descFalta = 0, addFilho = 0;
        while (continuacao != 0) {
            System.out.println("Digite o tipo  do professor");
            categoria = entrada.nextInt();
            System.out.println("Digite a quantidade de faltas");
            f = entrada.nextInt();
            System.out.println("Digite a quantidade de filhos");
            filho = entrada.nextInt();

            if (categoria == 1) {
                valor = ((4 * 15) * 5.25);
                descFalta = ((15/2) * f);
                salario = valor - descFalta;
                media1 = media1 + salario;
            } else if (categoria == 2) {
                valor = ((4 * 18) * 5.25);
                descFalta = ((18/2)* f);
                salario = valor - descFalta;
                media2 = media2 + salario;
            } else {
                valor = ((4 * 23) * 5.25);
                descFalta = ((23 / 2) * f);
                salario = valor - descFalta;
                media3 = media3 + salario;
            }

            if (salario < 1400) {
                addFilho = (48.62 * filho);
                salario = salario + addFilho;
            }

            System.out.println("O salario do professor neste més foi: " + salario);
            System.out.println("Sendo o total de horas/aula " + valor + " Desconto: " + descFalta + " Adicional por filhos: " + addFilho);

            cont = cont + 1;
            total = total + salario;
            System.out.println("Deseja continuar ? 1 para sim ou 0 para não");
            continuacao = entrada.nextInt();
          
        }
        System.out.println("a media da categoria 1 foi: " + (media1 / cont));
        System.out.println("a media  da categoria 2 foi: " + (media2 / cont));
        System.out.println("a media da caategoria 3 foi: " + (media3 / cont));
        System.out.println("Total pago : " + total);
    }

}
