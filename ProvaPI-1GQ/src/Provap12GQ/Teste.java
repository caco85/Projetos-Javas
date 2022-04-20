package Provap12GQ;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class Teste {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        double salario, valorImposto, valorInss, salarioLiquido, baseCalculoIrrf;

        System.out.print("Por favor, digite o seu salário bruto mensal: ");
        salario = entrada.nextDouble();

        valorInss = (inss(salario));

        baseCalculoIrrf = salario - valorInss;

        valorImposto = (impostoRenda(baseCalculoIrrf));

        salarioLiquido = salario - valorInss - valorImposto;

        System.out.printf("O VALOR DO INSS É DE %.2f %n", valorInss);

        System.out.printf("O VALOR DO SALÁRIO DEDUZIDO DO INSS É DE %.2f %n", baseCalculoIrrf);

        System.out.printf("O VALOR DO IMPOSTO DE RENDA É DE %.2f %n", valorImposto);

        System.out.printf("O SALARIO LIQUIDO É DE %.2f %n", salarioLiquido);

    }

    public static double inss(double salario) {
        double inss = 0;

        if ((salario > 0) && (salario == 1045.00)) {
            inss = (salario * 7.5 / 100);
            System.out.println("A aliquota do inss para esta faixa de salário é de 7,5 por cento");

        } else if ((salario >= 1045.01) && (salario <= 2089.60)) {
            inss = (salario * 9 / 100);
            System.out.println("A aliquota do inss para esta faixa de salário é de 9 por cento");

        } else if ((salario >= 2089.61) && (salario <= 3134.40)) {
            inss = (salario * 12 / 100);
            System.out.println("A aliquota do inss para esta faixa de salário é de 12 por cento");

        } else if ((salario >= 3134.41) && (salario <= 6101.06)) {
            inss = (salario * 14 / 100);
            System.out.println("A aliquota do inss para esta faixa de salário é de 14 por cento");
        }

        return inss;
    }

    public static double impostoRenda(double baseCalculoIrrf) {
        double impostoRenda = 0;

        if (baseCalculoIrrf <= 1903.98) {
            impostoRenda = 0;
            System.out.println("Isento do imposto de renda");

        }
        if (baseCalculoIrrf >= 1903.99 && baseCalculoIrrf <= 2826.65) {
            impostoRenda = (baseCalculoIrrf * 7.5 / 100 - 142.80);
            System.out.println("A aliquota do imposto de renda para esta faixa de salário é de 7,5 por cento");

        }
        if ((baseCalculoIrrf >= 2826.66) && (baseCalculoIrrf <= 3751.05)) {
            impostoRenda = (baseCalculoIrrf * 15 / 100 - 354.80);
            System.out.println("A aliquota do imposto de renda para esta faixa de salário é de 15 por cento");

        }
        if ((baseCalculoIrrf >= 3751.06) && (baseCalculoIrrf <= 4664.68)) {
            impostoRenda = (baseCalculoIrrf * 22.5 / 100 - 636.13);
            System.out.println("A aliquota do imposto de renda para esta faixa de salário é de 22,5 por cento");

        }
        if (baseCalculoIrrf > 4664.68) {
            impostoRenda = (baseCalculoIrrf * 27.5 / 100 - 869.36);
            System.out.println("A aliquota do imposto de renda para esta faixa de salário acima de R$ 4,664,68 é de 27,5 por cento");
        }

        return impostoRenda;

    }
}
