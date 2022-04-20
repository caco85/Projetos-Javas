package provapi.pkg1gq;

import java.util.Scanner;

/**
 * 07/06/1983 2019206411
 *
 * @author Adriano
 */
public class ProvaPI1GQ {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int diaPag, diaVenc = 07, contPag = 0, difDia;
        double valorPag, valorFat, totalFats = 0, mediaPg, m = 0.02, j = 0.01;
        char rep;
        do {
            System.out.println("Bem vindo ao NuBank");
            System.out.print("Digite o valor da fatura: ");
            valorFat = entrada.nextDouble();
            System.out.print("Digite o dia do pagamento da fatura: ");
            diaPag = entrada.nextInt();

            while (valorFat < 0 || diaPag < 0 || diaPag > 31) {
                System.out.println("Você digitou errado o dia do Vencimento ou valor a ser pago digite novamente");
                System.out.print("Digite o valor da fatura: maior que 0: ");
                valorFat = entrada.nextDouble();
                System.out.print("Digite o dia do pagamento da fatura: de 1 ate 31:  ");
                diaPag = entrada.nextInt();
            }
            if (diaPag > diaVenc) {
                contPag++;
                difDia = diaPag - diaVenc;
                //aqui pegando  a diferença de dia e multiplicado o juros ,depois calcula o juros exemplo 3 dias vai da 3% e joga no valor pra saber o valor do juros exemplo 3% e 100 é R$3 
                //soma o valor da multa 2% de 100 é R$2 reais 
                // no final pega tudo e soma no valor final se foi digitado R$100 vai somar 2+5 q vai da R$105
                valorPag = valorFat + (valorFat * m) + (valorFat * (difDia * j));
                totalFats = totalFats + valorFat;
                System.out.println("Houve acrescimento e  valor da fatura" + valorPag);
                System.out.println("");
            } else if (diaPag < diaVenc) {
                contPag++;
                //retirando 5% do valor pago ,vai calcula o desconto e subtrair do valor exemplo se for $100 vai calculca 5% de $100 e retira ficando $95
                valorPag = valorFat - (valorFat * 0.05);
                totalFats = totalFats + valorPag;
                System.out.println("Parabéns por ter pago antecipado você ganhou 5% de desconto o valor pago foi" + valorPag);
                System.out.println("");
            } else {
                contPag++;
                totalFats = totalFats + valorFat;
                System.out.println("Não houve acrescimento ou desconto e você pagou o  valor da fatura normal" + valorFat);
                System.out.println("");
            }
            System.out.println("Voce deseja pagar outra fatura ? responda s ou S");
            rep = entrada.next().charAt(0);
            rep = Character.toUpperCase(rep);
            System.out.println("");
        } while (rep == 'S');
        System.out.println("Obrigado por fazer seus pagamentos juntos com a NuBank");
        mediaPg = totalFats / contPag;
        System.out.println("");
        System.out.println("Media de Pagamento foi: " + mediaPg);
        System.out.println("");

        if (contPag > 1000) {
            System.out.println("Meta ótima Atigida: ");
        } else if (contPag >= 500 && contPag < 1000) {
            System.out.println("Meta intermediaria Alcançada: ");
        } else if (contPag >= 100 && contPag < 500) {
            System.out.println("Abaixo da meta: ");
        } else {
            System.out.println("Progama descontinuado: ");
        }

    }

}
