/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2pack3;

import exercicio2pack1.LSE;
import java.util.*;

/**
 *
 * @author Renato Nunes
 */
public class TestaListApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LSE<Integer> lista = new LSE();   // cria lista de inteiros
        int opcMenu, num,newNum;
        do {
            menuOpcoes();
            System.out.println("Informe a opção: ");
            opcMenu = scanner.nextInt();
            switch (opcMenu) {
                case 1:
                    System.out.println("Informe o valor: ");
                    num = scanner.nextInt();
                    lista.inserirNoInicio(num);
                    break;
                case 2:
                    System.out.println("Informe o valor: ");
                    num = scanner.nextInt();
                    lista.inserirNoFinal(num);
                    break;
                case 3:
                    lista.exibirTodos();
                    break;
                case 4:
                    System.out.println("Digite o numero que deseja alterar");
                    num = scanner.nextInt();
                    System.out.println("Digite o novo numero que deseja alterar");
                    newNum = scanner.nextInt();
                    lista.atualizarNoLista(num, newNum);
                    break;
                case 5:
                    lista.removerNoFinal();
                    break;
                case 0:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcMenu != 0);
    }

    public static void menuOpcoes() {
        System.out.println("1 - Inserir valor no início da lista");
        System.out.println("2 - Inserir valor no final da lista");
        System.out.println("3 - Exibir todos os valores da lista");
        System.out.println("4 - alterar um valor da lista");
        System.out.println("5 - remover o nó situado no final da lista");
        System.out.println("0 - Sair do programa");
    }

}
