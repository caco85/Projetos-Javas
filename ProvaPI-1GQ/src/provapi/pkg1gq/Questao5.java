/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapi.pkg1gq;

import java.util.Scanner;

/**
 *
 * @author Renat
 */
public class Questao5 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        long num, num2 = 0;

        System.out.print("Digite um número inteiro maior que 1000: ");

        num = entrada.nextInt();
        while (num < 1000) {
            System.out.println("Digitação invalida, digite um valor maior que 1000: ");
            num = entrada.nextInt();
        }

        System.out.println();

        
       int i = 0;
       while ( num < num2){
     
          num2 = num2 + fatorial(i);
        //  num = num - num2;
          System.out.printf("Você digitou %d%n", num);
          

        }

    }

    public static long fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);

    }

    //questão 4
//        double peso = 0, mediaPeso, mediaIdade, soma = 0;
//        int idade = 0, qtd, num = 0; 
// 
// 
//        System.out.print("Digite a quantidade de times: ");
//        qtd = entrada.nextInt();
// 
//        for (int i = 1; i <= qtd; i++){
//          System.out.printf("TIME %d%n ", i);  
// 
//          for (int a = 1; a <= 2; a++){
//              System.out.printf("ATLETA %d%n", a);
// 
//              System.out.print("Digite seu peso: ");
//              peso = entrada.nextDouble();
//              System.out.print("Digite sua idade: ");
//              idade = entrada.nextInt();
// 
//              System.out.println();
// 
// 
//          }
// 
//              mediaPeso = calculoMediaPeso(peso, soma, qtd);
//              mediaIdade = calculoMediaIdade(idade, soma, qtd);
// 
//              System.out.println("a média de idade é de " + mediaIdade + " anos"); 
//              System.out.println("O peso médio é " + mediaPeso + " kg");
// 
//        }
// 
// 
// 
//    }
// 
// 
//    public static double calculoMediaPeso (double peso, double soma, double qtd){
//        double mediaPeso;
//            soma = soma + peso;
//              qtd = qtd + 1;
// 
//                mediaPeso = soma / qtd;
//                return mediaPeso;
// 
// 
// 
//    }
// 
//    public static double calculoMediaIdade (int idade, double soma, double qtd){
//        double media;
//          soma = soma + idade;
//          qtd = qtd + 1;         
// 
//          media = soma / qtd;
//          return media;  
//    }
    //questão 5
//    public static Scanner entrada = new Scanner(System.in);
//    public static void main(String[] args) {
// 
//        double KWh,KWhTotal = 0, residencial, comercial, industrial, valor1 = 0, valor2 = 0, valor3 = 0, consumoMensal,valorT = 0,mediaE =0 ,mediaR =0;
//        int cliente, num, opcao = 0,cont =0;
// 
//        do{
// 
//            System.out.println("Digite o tipo de cliente: ");
//            System.out.println();
//            System.out.print("Digite:  1 p/ residêncial, 2 p/ comercial e 3 p/ industrial: ");
//            cliente = entrada.nextInt();
//            while (cliente < 1 || cliente > 3){
//                System.out.println("Invalido, digite corretamente");
//                System.out.println("Digite:  1 p/ residêncial, 2 p/ comercial e 3 p/ industrial: ");
//                cliente = entrada.nextInt();
//            }
// 
//            System.out.print("Digite a quatidade de KWh consumida: ");
//            KWh = entrada.nextDouble(); 
//            
//            while (KWh <= 0){
//                System.out.print("Impossível calcular com valores nulos, digite novamente: ");
//                KWh = entrada.nextDouble();
//            }
// 
//            
// 
//           System.out.print("Se tem mais algo pra adicionar aparte 1 se não, digite -1 para sair: ");
//           num = entrada.nextInt();
//           while (num < -1 || num > 1){
//               System.out.println("valor incorreto, digite -1 para sair ou 1 para continuar: ");
//               num = entrada.nextInt();
//            }
//            if (cliente == 1 || cliente == 2) {
//                mediaR = mediaR + KWh;
//                
//            }
//            if(cliente == 3){
//                mediaE = mediaE + KWh;
//            }
//            
//           KWhTotal = KWhTotal + KWh;
//           cont = cont + 1;
//        }while(num == 1);   
// 
// 
// 
// 
//        residencial = resultResidencial(KWh);
//        System.out.printf("O consumo residencial é de R$ %.2f%n", residencial);
// 
//        comercial = valorComercial(KWh);
//        System.out.printf("O consumo comercial é de R$ %.2f%n", comercial);
// 
//        industrial = valorIndustrial(KWh);
//        System.out.printf("O consumo industrial é de R$ %.2f%n", industrial);  
//        valorT = residencial + comercial + industrial + valorT;
//        System.out.println("O valor total é de R$ %.2f%n"+valorT);
//        System.out.println("O consumo total de KWh no mes é: "+KWhTotal);
//        mediaR = mediaR / cont;
//        mediaE = mediaE / cont;
//        System.out.println("O consumo medio dos clientes 1 e 2 são: "+mediaR);
//        System.out.println("O consumo medio dos clientes 1 3 são: "+mediaE);
// 
//    }
// 
//    public static double resultResidencial(double KWh){
//        double valor;
//         valor = (KWh * 0.10);
//         return valor;        
//    }
// 
//    public static double valorComercial (double KWh){
//        double valor2;
//        valor2 = (KWh * 0.20);
//        return valor2;
//    }
// 
//     public static double valorIndustrial (double KWh){
//        double valor3;
//         valor3 = (KWh * 0.30);
//        return valor3;
//    }
}
     
//        int cont = 0;
//        char escolhaCliente;
//        double valorPG, totalarrecado = 0, media = 0, media2 = 0, KWh = 0, totalkwMes = 0;
//        do {
//            System.out.println("MENu");
//            System.out.println("Bem Vindo");
//            System.out.println("Digite  a opção do cliente ");
//            System.out.println("R = Residencial C Comercial I = Industral:");
//            escolhaCliente = entrada.next().charAt(0);
//            escolhaCliente = Character.toLowerCase(escolhaCliente);
//            System.out.println("Digite a Quantidade de KWh:");
//            KWh = entrada.nextDouble();
//            if (KWh > 0) {
//                valorPG = calcularValor(escolhaCliente, KWh);
//               
//                if (escolhaCliente == 'r' || escolhaCliente == 'c') {
//                    media = media + KWh;
//                } else {
//                    media2 = media2 + KWh;
//                }
//
//                System.out.println("O valor pago foi: " + valorPG);
//                cont = cont + 1;
//                totalarrecado = totalarrecado + valorPG;
//                totalkwMes = totalkwMes + KWh;
//            } else {
//                System.out.println("A quantidade digita foi  menor que zero, ate mais");
//            }
//        } while (KWh > 0);
//        media = media / cont;
//        media2 = media2 / cont;
//
//        System.out.println("Consumo total foi: " + totalkwMes);
//        System.out.println("A media dos clientes Residencial e Comercial foi: " + media     + "A media dos clientes Industrial foi: " + media2);
//        System.out.println("o Faturamento total foi: " + totalarrecado);
//
//    }
//     public static double calcularValor(char tipoCliente, double KWh) {
//        double calcular = 0;
//        if (tipoCliente == 'r') {
//            calcular = (KWh * 0.10);
//        } else if (tipoCliente == 'c') {
//            calcular = (KWh * 0.20);
//        } else {
//            calcular =( KWh * 0.40);
//        }
//        return calcular;
//    }


      //questão 4
// public static Scanner entrada = new Scanner(System.in);
//    public static void main(String[] args) {
//        int  i,j,peso,peso2 = 0,idade = 0,menorPeso = 0,maiorId = 0,menorIdade = 0,maiorPeso = 0,idade2 = 0,t1= 0,t2 = 0,idade3 = 0,peso3 = 0,atletas =4 ,times=4;
//        double mediaPeso = 0,mediaIdade = 0,mediaIdadeGeral = 0,mediaPesoGeral = 0;
//        for ( i = 0; i < times; i= i+1) {
//            for (j = 0; j < atletas; j = j+1) {
//                System.out.println("Time numero: "+(i+1));
//                System.out.println("Digite a idade do jogador: " + (j+1));
//                idade = entrada.nextInt();
//                System.out.println("Digite o peso do jogardor: "+(j+1));
//                peso = entrada.nextInt();
//                
//                mediaIdade = mediaIdade + idade;
//                mediaPeso = mediaPeso + peso;
//            
//                
//                if (peso < menorPeso) {
//                    menorPeso = peso;
//                    idade2 = idade;
//                    
//                    
//                }
//                if (maiorId < idade) {
//                    maiorId = idade;
//                    peso2 = peso;
//                    
//                }
//                if (maiorPeso < peso) {
//                    maiorPeso = peso;
//                    idade3 = idade;
//                    t2 = (j+1);
//                    
//                }
//                if ( menorIdade > idade) {
//                    menorIdade = idade;
//                     peso3 = peso;
//                    t1 = (j+1);
//                }
//            }
//           
//            
//            mediaIdade = calculaMedia(mediaIdade,atletas);
//            mediaPeso = calculaMedia (mediaPeso ,atletas);
//            mediaIdadeGeral =mediaIdadeGeral + mediaIdade;
//            mediaPesoGeral = mediaPesoGeral + mediaPeso;
//            System.out.println("O peso medio e a idade media do time:"+(i+1)+" é: "+mediaIdade+" e "+mediaPeso);
//            System.out.println("O peso e a idade do jogador mais velho é:" + maiorId+" e " +peso2 );
//            System.out.println("O peso e a idade do jogador mais leve é:" + idade2+" e " +menorPeso );
//            
//        }
//        mediaIdadeGeral =calculaMedia(mediaIdadeGeral ,times);
//        mediaPesoGeral = calculaMedia(mediaPesoGeral ,times);
//        System.out.println("A media geral de idade do campeonato é: " + mediaIdadeGeral);
//        System.out.println("A media geral de peso do campeonato é: "+ mediaPesoGeral);
//        System.out.println("A idade e peso do jogador mais novo é: " + menorIdade + " e "+peso3 + " e pertence ao time :"+t1);
//        System.out.println("A idade e peso do jogador mais pesado é: " + idade3 + " e "+maiorPeso + " e pertence ao time :"+t2);
//    }
//    public static double calculaMedia(double m,int qtd){
//        double result;
//        return result = m /qtd;
//    
//    }

        //questáo 6
//char menu ;
//        int filhoQuantidade,categoria,faltas,cont = 0;
//        double salario,totalPago = 0,mediaCategoria = 0,mediaCategoria2 = 0,mediaCategoria3 = 0;       
//        do {            
//            System.out.println("Digite a categoria do professor");
//            categoria = entrada.nextInt();
//            System.out.println("Digite a quantidade de filhos");
//            filhoQuantidade = entrada.nextInt();
//            System.out.println("Digite a quantidade de faltas");
//            faltas = entrada.nextInt();
//            salario = calcSalario(categoria, filhoQuantidade, faltas);
//            
//            if (categoria == 1) {
//                mediaCategoria = mediaCategoria+ salario;
//            }else if (categoria == 2) {
//                mediaCategoria2 = mediaCategoria2+ salario;
//            }else {
//                mediaCategoria3 = mediaCategoria3+ salario;
//            }
//            
//            totalPago = totalPago+salario;
//            System.out.println("Ainda tem professor? s para sim ou n para não");
//            menu = entrada.next().charAt(0);
//            menu = Character.toLowerCase(menu);
//            cont = cont+1;
//            
//        } while (menu != 'n');
//        System.out.println("1 foi: " + calcularMedia( mediaCategoria,cont));
//        System.out.println("2 foi: " + calcularMedia(mediaCategoria2,cont));
//        System.out.println("3 foi: " + calcularMedia( mediaCategoria3, cont));
//       System.out.println("O valor total pago aos professores foi: "+ totalPago);
//    }   
//    public static double calcSalario(int cat,int filho,int falta){
//        double calcular  = 0,valorAula = 0,descFalta = 0,addFilho = 0;
//        
//        if (cat == 1) {
//            valorAula = ((4*15) * 5.25);
//            descFalta = (7.50*falta);
//            calcular = valorAula - descFalta;
//        }else if(cat == 2){
//            valorAula = ((4*18) * 5.25);
//            descFalta = (9*falta);
//            calcular = valorAula - descFalta;
//        }else {
//            valorAula = ((4*23 )* 5.25);
//            descFalta = (11.50*falta);
//            calcular = valorAula - descFalta;
//  
//        }
//
//        if (calcular < 1400) {
//            addFilho = (48.62 * filho);
//            calcular = calcular + addFilho;
//        }
//        System.out.println("O salario do professor neste més foi: "+ calcular);
//        System.out.println("Sendo o total de horas/aula "+ valorAula +" Desconto: " +descFalta + " Adicional por filhos: " +addFilho);
//        return calcular ;              
//    }
//    public static double calcularMedia(double m, int c){
//        double media;
//        return media = m /c;
//
//              //questão 1
//       int num, i, numAux = 0;
//        System.out.println("Digite um numero maior que 1000");
//        num = entrada.nextInt();
//        while (num < 1000) {
//            System.out.println("Atenção! Digite um numero maior que 1000");
//            num = entrada.nextInt();
//        }
//        for (i = 0; i < num; i = i + 1) {
//            numAux = numAux + fatorialRecursiva(i);
//            if (numAux <= num) {
//                System.out.println(numAux);
//            } else {
//                break;
//            }
//
//        }
//
//    }
//
//    public static int fatorialRecursiva(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        return n * fatorialRecursiva(n - 1);


////     questão 2
//
//public static void main(String[] args) {
//        int num,numInvertido;
//        System.out.println("Digite um numero ");
//        num = entrada.nextInt();
//        while (num < 100 ) {            
//            System.out.println("Atenção! Digite um numero com preferencia maior que 100 ");
//            num = entrada.nextInt(); 
//        }
//        
//        for (int i = 0; i < num; i++) {
//            numInvertido = numInvertido(i);
//            System.out.println("Sequencia IccanobiF:"+ fibonacci(numInvertido));
//        }
//
//    }
//
//    public static int fibonacci(int n) {
//        int i, numAnterior = 0, num = 0;
//        for (i = 1; i <= n; i = i + 1) {
//            if (i == 1) {
//                num = 1;
//                numAnterior = 0;
//            } else {
//                num = num + numAnterior;
//                numAnterior = num - numAnterior;
//            }
//        }
//        return num;
//    }
//    public static int numInvertido(int num) 
//    { 
//        int numInv = 0; 
// 
//        while (num != 0) { 
//            numInv = numInv * 10 + (num % 10); 
//            num = num / 10; 
//        } 
// 
//        return numInv; 
//    } 