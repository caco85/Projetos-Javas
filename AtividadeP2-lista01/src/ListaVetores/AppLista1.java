package ListaVetores;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class AppLista1 {
    public static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        int opcMenu ,i,voto,total = 0;
        char encerrar    = 0;
        double [] vetorGanhos = new double [12];
        double [] vetorGastos = new double [12];
        double [] vetorLucros = new double [12];
        int [] votos = new int[6];
        
        do {            
           System.out.print("MENU: \n"+"Escolha a Opção para Aplicação: \n 1-Empresa: 2- votação: 3-Sair: ");
           opcMenu = scanner.nextInt();
           
            if (opcMenu== 1){
                System.out.println("Bem vindo a Jhon Entrepise");
                System.out.println();
                System.out.println("Informe os ganhos de 2019 ");
                JhonEntrepise.receberValor(vetorGanhos);
                System.out.println("Informe os gastos  de 2019");
                JhonEntrepise.receberValor (vetorGastos);
                JhonEntrepise.calcLucros (vetorGanhos, vetorGastos, vetorLucros);
                System.out.println("Ganhos da empresa");
                JhonEntrepise.exibirValores (vetorGanhos);
                System.out.println("Gastos da empresa");
                JhonEntrepise.exibirValores (vetorGastos);
                System.out.println("Lucros da empresa  em 2019");
                JhonEntrepise.exibirValores (vetorLucros);
            }else if (opcMenu == 2) {
                do {                    
                     System.out.println("Bem vindo a Votação \n logo baixo escolha os Candidatos a sua escolha \n"
                        + "0  votar em Branco \n 1 votar em João \n 2 votar em Maria \n 3 votar em Pedro \n 4 votar em Luís ");
                    voto = scanner.nextInt();
                
                    switch (voto){
                        case 0:
                            votos[0] = votos[0]+1; 
                            break;
                        case 1:
                            votos[1] = votos[1]+1; 
                            break;    
                        case 2:
                            votos[2] = votos[2]+1; 
                            break;
                        case 3:
                            votos[3] = votos[3]+1; 
                            break;   
                        case 4:
                            votos[4] = votos[4]+1; 
                            break;    

                        default:
                            votos[5] = votos[5]+1;
                    }
                    
                    System.out.println("Deseja encerrar a votação? digite s ou n ");
                    encerrar = scanner.next().charAt(0);
                    encerrar = Character.toUpperCase(encerrar);
                    while (encerrar != 'S' && encerrar != 'N') {                        
                        System.out.println("Deseja encerrar a votação? digite s ou n ");
                        encerrar = scanner.next().charAt(0);
                        encerrar = Character.toUpperCase(encerrar);
                    }
                } while (encerrar != 'S');
                total =  Votacao.calcVotos(votos);
                Votacao.exibirVotos(votos,total);
                System.out.println("");
                System.out.println("Total de votos foram: " + total);
                
            }else if (opcMenu == 3) {
                System.out.println("Aplicação encerreda");
            }else{
               System.out.println("Escolha uma opção correta"); 
            }         
        } while (opcMenu != 3);
    }
}
