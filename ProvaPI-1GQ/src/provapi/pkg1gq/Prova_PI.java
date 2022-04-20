package provapi.pkg1gq;

import java.util.Scanner;

/**
 *
 * @author Ademir JR
 */
public class Prova_PI {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
//        int i,j,num1,num2,result1, result2;
//        
//        for ( i = 0; i < 1000000000; i = 1+1) {
//             num1 = i;
//             num2 = i+1;
//             if (i%2 !=0 && i%3!=0 && i%10 != 5 && i%7!=0) {
//                 for (j = 0; j < i/2; j = 1+1) {
//                     
//                 }
//             }
//        }
            
        

//        //Questão 2
//        int qtdTurma ;
//        double nota1,nota2 ,mediaAluno,mediaTurma = 0;
//        
//        System.out.println("Digite a quantidade da turma: ");
//        qtdTurma = entrada.nextInt();
//        
//        for (int i = 1; i <= qtdTurma; i=i+1) {
//            System.out.println("Digite primeria nota do aluno: ");
//            nota1= entrada.nextDouble();
//            System.out.println("Digite segunda nota do aluno: ");
//            nota2= entrada.nextDouble();
//            
//            mediaAluno = (nota1 + nota2) /2;
//            mediaTurma = mediaTurma + mediaAluno;
//            System.out.println("A media do aluno foi: "+mediaAluno);
//            System.out.println("");
//        }
//        mediaTurma = mediaTurma / qtdTurma;
//        System.out.println("A media da turma é:  "+ mediaTurma);
        //Questão 4 
//        int i, numInverso,num;
//        for (i = 1; i <= 100000; i = i+1) {
//            num = i;
//            numInverso = 0;
//            while (num != 0) {                
//                numInverso = 10 * numInverso + num % 10;
//                num = num /10;
//            }
//            if (i == numInverso) {
//                System.out.println(i);
//            }
//        }
        int num, num2, resto, restodoResto;
        String numExt = "", numExt2 = "";
        System.out.println();
        System.out.println("Digite um numero entre 1 a 999");
        num = entrada.nextInt();

        if (num > 100) {
            resto = num % 100;
            num = num / 100;
            switch (num) {
                case 1:
                    numExt = "Cento ";
                    break;
                case 2:
                    numExt = "Duzentos ";
                    break;
                case 3:
                    numExt = "Trezentos ";
                    break;
                case 4:
                    numExt = "Quatrocentos ";
                    break;
                case 5:
                    numExt = "Quinhentos ";
                    break;
                case 6:
                    numExt = "Seiscentos ";
                    break;
                case 7:
                    numExt = "Setecentos ";
                    break;
                case 8:
                    numExt = "Oitocentos";
                    break;
                case 9:
                    numExt = "Novecentos";
                    break;
            }
            if (resto < 20) {
                switch (resto) {
                    case 1:
                        System.out.println(numExt + " e " + "Um");
                        break;
                    case 2:
                        System.out.println(numExt + " e " + "Dois");
                        break;
                    case 3:
                        System.out.println(numExt + " e " + "Três");
                        break;
                    case 4:
                        System.out.println(numExt + " e " + "Quatro");
                        break;
                    case 5:
                        System.out.println(numExt + " e " + "Cinco");
                        break;
                    case 6:
                        System.out.println(numExt + " e " + "Seis");
                        break;
                    case 7:
                        System.out.println(numExt + " e " + "Sete");
                        break;
                    case 8:
                        System.out.println(numExt + " e " + "Oito");
                        break;
                    case 9:
                        System.out.println(numExt + " e " + "Nove");
                        break;
                    case 10:
                        System.out.println(numExt + " e " + "Dez");
                        break;
                    case 11:
                        System.out.println(numExt + " e " + "Onze");
                        break;
                    case 12:
                        System.out.println(numExt + " e " + "Doze");
                        break;
                    case 13:
                        System.out.println(numExt + " e " + "treze");
                        break;
                    case 14:
                        System.out.println(numExt + " e " + "Quartoze");
                        break;
                    case 15:
                        System.out.println(numExt + " e " + "Quinze");
                        break;
                    case 16:
                        System.out.println(numExt + " e " + "Dezesseis");
                        break;
                    case 17:
                        System.out.println(numExt + " e " + "Dezessete");
                        break;
                    case 18:
                        System.out.println(numExt + " e " + "Dezoito");
                        break;
                    case 19:
                        System.out.println(numExt + " e " + "Dezenove");
                        break;
                }
            } else if (resto > 19 && resto < 100) {
                num2 = resto / 10;
                restodoResto = resto % 10;
                switch (num2) {
                    case 2:
                        numExt2 = "Vinte";
                        break;
                    case 3:
                        numExt2 = "Trinta";
                        break;
                    case 4:
                        numExt2 = "Quarenta";
                        break;
                    case 5:
                        numExt2 = "Ciquenta";
                        break;
                    case 6:
                        numExt2 = "Sessenta";
                        break;
                    case 7:
                        numExt2 = "Setenta";
                        break;
                    case 8:
                        numExt2 = "Oitenta";
                        break;
                    case 9:
                        numExt2 = "Noventa";
                        break;
                }
                switch (restodoResto) {
                    case 1:
                        System.out.println(numExt + " e " + numExt2 + " e " + "Um");
                        break;
                    case 2:
                        System.out.println(numExt + " e " + numExt2 + " e " + "Dois");
                        break;
                    case 3:
                        System.out.println(numExt + " e " + numExt2 + " e " + "Três");
                        break;
                    case 4:
                        System.out.println(numExt + " e " + numExt2 + " e " + "Quatro");
                        break;
                    case 5:
                        System.out.println(numExt + " e " + numExt2 + " e " + "Cinco");
                        break;
                    case 6:
                        System.out.println(numExt + " e " + numExt2 + " e " + "Seis");
                        break;
                    case 7:
                        System.out.println(numExt + " e " + numExt2 + " e " + "Sete");
                        break;
                    case 8:
                        System.out.println(numExt + " e " + numExt2 + " e " + "Oito");
                        break;
                    case 9:
                        System.out.println(numExt + " e " + numExt2 + " e " + "Nove");
                        break;
                    default:
                        System.out.println(numExt + " e " + numExt2);
                }
            }
        } else if (num == 100) {
            System.out.println("Cem");
        } else if (num > 19 && num < 100) {
            resto = num % 10;
            num = num / 10;
           
            switch (num) {
                case 2:
                    numExt2 = "Vinte";
                    break;
                case 3:
                    numExt2 = "Trinta";
                    break;
                case 4:
                    numExt2 = "Quarenta";
                    break;
                case 5:
                    numExt2 = "Ciquenta";
                    break;
                case 6:
                    numExt2 = "Sessenta";
                    break;
                case 7:
                    numExt2 = "Setenta";
                    break;
                case 8:
                    numExt2 = "Oitenta";
                    break;
                case 9:
                    numExt2 = "Noventa";
                    break;
            }
            switch (resto) {
                case 1:
                    System.out.println(numExt2 + " e " + "Um");
                    break;
                case 2:
                    System.out.println(numExt2 + " e " + "Dois");
                    break;
                case 3:
                    System.out.println(numExt2 + " e " + "Três");
                    break;
                case 4:
                    System.out.println(numExt2 + " e " + "Quatro");
                    break;
                case 5:
                    System.out.println(numExt2 + " e " + "Cinco");
                    break;
                case 6:
                    System.out.println(numExt2 + " e " + "Seis");
                    break;
                case 7:
                    System.out.println(numExt2 + " e " + "Sete");
                    break;
                case 8:
                    System.out.println(numExt2 + " e " + "Oito");
                    break;
                case 9:
                    System.out.println(numExt2 + " e " + "Nove");
                    break;
                default:
                    System.out.println(numExt2);
            }

        } else {
            switch (num) {
                case 1:
                    System.out.println("Um");
                    break;
                case 2:
                    System.out.println("Dois");
                    break;
                case 3:
                    System.out.println("Três");
                    break;
                case 4:
                    System.out.println("Quatro");
                    break;
                case 5:
                    System.out.println("Cinco");
                    break;
                case 6:
                    System.out.println("Seis");
                    break;
                case 7:
                    System.out.println("Sete");
                    break;
                case 8:
                    System.out.println("Oito");
                    break;
                case 9:
                    System.out.println("Nove");
                    break;
                case 10:
                    System.out.println("Dez");
                    break;
                case 11:
                    System.out.println("Onze");
                    break;
                case 12:
                    System.out.println("Doze");
                    break;
                case 13:
                    System.out.println("treze");
                    break;
                case 14:
                    System.out.println("Quartoze");
                    break;
                case 15:
                    System.out.println("Quinze");
                    break;
                case 16:
                    System.out.println("Dezesseis");
                    break;
                case 17:
                    System.out.println("Dezessete");
                    break;
                case 18:
                    System.out.println("Dezoito");
                    break;
                case 19:
                    System.out.println("Dezenove");
                    break;
            }
        }

    }

}
