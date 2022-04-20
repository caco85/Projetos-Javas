/*

 */
package Provap12GQ;

import java.util.Scanner;

public class FinalP1 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int qtdMaria = 0, qtdJose = 0, qtdMarcos = 0, qtdBranco = 0, qtdNulos = 0, voto, cont = 0;
        char eleicao;
        double percBranco, percNulo;
        do {
            System.out.println("Digite seu voto, abaixo segue a lista de candidatos ");
            System.out.println("1-Maria: \n 2-José: \n 3-Marcos: \n 0-Branco \n ou qualquer outro numero para votar nulo ");
            voto = entrada.nextInt();

            switch (voto) {
                case 1:
                    qtdMaria = qtdMaria + 1;
                    break;
                case 2:
                    qtdJose = qtdJose + 1;
                    break;
                case 3:
                    qtdMarcos = qtdMarcos + 1;
                case 0:
                    qtdBranco = qtdBranco + 1;
                default:
                    qtdNulos = qtdNulos + 1;
            }
            cont = cont + 1;
            System.out.println("Ainda tem eleitor pra votar? s-sim ou n-não");
            eleicao = entrada.next().charAt(0);
            eleicao = Character.toLowerCase(eleicao);
            if (eleicao == 'n' && cont < 10) {
                System.out.println("Atenção ainda não tivermos a quantidade de votos para ser uma eleição valida"
                        + "\n deseja mesmo  finalizar? responda n-para finalizar ou s- para continuar ");
                eleicao = entrada.next().charAt(0);
                eleicao = Character.toLowerCase(eleicao);
            }
        } while (eleicao != 'n');
        if (cont >= 10) {
            computarVoto(qtdMaria, qtdJose, qtdJose);
            System.out.println();
            imprimirVotoCand(1,qtdMaria);
            imprimirVotoCand(2,qtdJose);
            imprimirVotoCand(3,qtdMarcos);
            percBranco = ((double) qtdBranco / (double) cont) * 100;
            percNulo = ((double) qtdNulos / (double) cont) * 100;

            System.out.println("Este foi o percentual de votos Brancos: " + truncarDuasCasas(percBranco) + "%" + " e Nulos: " + truncarDuasCasas(percNulo) + "%");
        } else {
            System.out.println("ATenção a eleição não foi valida,pois não houve a quantidade necessaria para validar a eleição!");
        }

    }

    public static void computarVoto(int v1, int v2, int v3) {
        if (v1 != v2 && v1 != v3 && v2 != v3) {
            if (v1 > v2 && v1 > v3) {
                System.out.println("O candidato Maria foi a vencedora da eleição: ");
            } else if (v2 > v1 && v2 > v3) {
                System.out.println("O candidato José foi a vencedora da eleição: ");
            } else {
                System.out.println("O candidato Marcos foi a vencedora da eleição: ");
            }
        } else {
            if (v1 == v2 && v1 > v3) {
                System.out.println("Houve um empate entre os candidatos Maria e José: ");
            } else if (v2 == v3 && v2 > v1) {
                System.out.println("Houve um empate entre os candidatos José e Marcos: ");
            } else if (v1 == v3 && v1 > v2) {
                System.out.println("Houve um empate entre os candidatos Maria e Marcos: ");
            }else if (v1 == v2 && v3 > v1){
                 System.out.println("O candidato Marcos foi a vencedora da eleição: ");
            }
            else if (v1 == v3 && v2 > v1){
                 System.out.println("O candidato José foi a vencedora da eleição: ");
            }
            else if (v3 == v2 && v1 > v2){
                 System.out.println("O candidato Maria foi a vencedora da eleição: ");
            }
        }
    }

    public static void imprimirVotoCand(int n,int qtd) {
        switch (n) {
            case 1:
                System.out.println("O candidato Maria recebeu o total de votos: " + qtd);
                break;
            case 2:
                System.out.println("O candidato José recebeu o total de votos: " + qtd);
                break;
            case 3:
                System.out.println("O candidato Marcos recebeu o total de votos: " + qtd);
                break;

        }

    }

    public static double truncarDuasCasas(double valor) {
        int valorInteiro = (int) (valor * 100);
        double resultado = valorInteiro / 100.0;
        return resultado;
    }
}

//questão 1
//    int i, maior = Integer.MIN_VALUE, qtd3e5 = 0, tam = 10, num,par = 0, impar = 0, qtd4e8 = 0;
//        double mediaPar,mediaImpar,media4e8;
//        for (i = 0; i < tam; i = i + 1) {
//            System.out.println("Digite um numero entre 1 e 1000");
//            num = entrada.nextInt();
//            while (num < 0 || num > 1000) {
//                System.out.println("Atenção! Digite um numero entre 1 e 1000");
//                num = entrada.nextInt();
//            }
//            if (maior < num) {
//                maior = num;
//            }
//            if (num % 2 == 0) {
//                par = par + 1;
//            } else {
//                impar = impar + 1;
//            }
//            if (num % 3 == 0 || num % 5 == 0) {
//                qtd3e5 = qtd3e5 + 1;
//            }
//            if (num % 10 == 4 || num % 10 == 8) {
//                qtd4e8 = qtd4e8 + 1;
//            }
//        }
//        if (maior != Integer.MIN_VALUE) {
//            System.out.println("O maior numero digitado foi: " + maior);
//        } else {
//            System.out.println("Não houve maior digitado");
//        }
//        if (par > 0) {
//            mediaPar = (double) par / (double)tam;
//            System.out.println("A pocentagem de numeros pares foi: " + mediaPar + "%");
//        } else {
//            System.out.println("Não houve numeros pares");
//        }
//        if (impar > 0) {
//            mediaImpar = (double) impar / (double)tam;
//            System.out.println("A pocentagem de numeros ímpares foi: " + mediaImpar + "%");
//        } else {
//            System.out.println("Não houve numeros ímpares");
//        }
//        if (qtd3e5 > 0) {
//            System.out.println("A quantidade de numeros multiplos de 3 ou 5 foi: " + qtd3e5);
//
//        } else {
//            System.out.println("Não houve nenhum numeros multiplos de 3 ou 5 digitado:");
//        }
//        if (qtd4e8 > 0) {
//            media4e8 = (double)qtd4e8 / (double)tam ;
//            System.out.println("A pocentagem de numeros terminandos em 4 ou 8  foi: " + media4e8 + "%");
//        } else {
//            System.out.println("Não houve numeros terminados em 4 ou 8: ");
//
//        }
//questão 2
//public static Scanner entrada = new Scanner(System.in);
// 
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		double salario;
//		System.out.println("Digite o seu salário: ");
//		salario = entrada.nextDouble();
//		while (salario < 1045.0) {
//			System.out.println("Salário não pode ser menor que o mínimo. "+
//				"Digite o seu salário: ");
//			salario = entrada.nextDouble();
//		}
// 
//		calcularImprimirInss(salario);
//	}
// 
//	public static void calcularImprimirInss(double salario) {
//		double salContr, aliquota, inss, parcDed;
// 
//		if (salario > 6101.06) {
//			salContr = 6101.06;
//		} else {
//			salContr = salario;
//		}
// 
//		if (salContr < 1045.01) {
//			aliquota = 7.5;
//			parcDed = 0.00;
//		} else if (salContr < 2089.61) {
//			aliquota = 9.0;
//			parcDed = 15.68;
//		} else if (salContr < 3134.41) {
//			aliquota = 12.0;
//			parcDed = 78.37;
//		} else {
//			aliquota = 14.0;
//			parcDed = 141.06;
//		}
// 
//		System.out.printf("A alíquota é %.1f%%.%n", aliquota);
//		System.out.printf("O seu salário de contribuição é %.2f.%n", salContr);
//		System.out.printf("Parcela a deduzir = %.2f.%n", parcDed);
// 
//		inss = truncarDuasCasas(salContr * aliquota / 100 - parcDed);
//		System.out.printf("Você irá contribuir para o INSS com %.2f%n.", inss);
//	}
// 
//	public static double truncarDuasCasas(double valor) {
//		int valorInteiro = (int) (valor * 100);
//		double resultado = valorInteiro / 100.0;
//		return resultado;
//	}
//}
