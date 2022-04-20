package exercicio2pack3;
import exercicio2pack1.LSESemRepetidos;
import exercicio2pack2.Aluno;
import java.util.Scanner;
/**
 *
 * @author Renato Nunes
 */

public class TestaLista {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        LSESemRepetidos <Aluno> lista = new LSESemRepetidos (); 
        int op, num;
        Aluno al;
        String nome;
        double nota;
        do {
            menuOpcoes ();
            System.out.println("Informe a opção: ");
            op = in.nextInt(); in.nextLine();
            switch (op) {
                case 1: System.out.println("Informe o nome do aluno: ");
                        nome = in.nextLine();
                        System.out.println("Informe a nota do aluno: ");
                        nota = in.nextDouble(); in.nextLine();
                        al = new Aluno (nome);
                        al.setNota (nota);
                        lista.inserirNoInicio(al);
                        break;
                case 2: System.out.println("Informe o nome do aluno: ");
                        nome = in.nextLine();
                        System.out.println("Informe a nota do aluno: ");
                        nota = in.nextDouble(); in.nextLine();
                        al = new Aluno (nome);
                        al.setNota (nota);
                        lista.inserirNoFinal(al);
                        break;
                case 3: lista.exibirTodos();
                        break;
                case 4: lista.removerNoInicio();
                        break;
                case 5: lista.removerNoFinal();
                        break;
                 case 6: System.out.println("Informe o nome do aluno: ");
                        nome = in.nextLine();
                        al = new Aluno (nome);
                        lista.exibirUm(al);
                        break;
                case 7: System.out.println("Informe o nome do aluno: ");
                        nome = in.nextLine();
                        System.out.println("Informe a nova nota: ");
                        nota = in.nextDouble();
                        al = new Aluno (nome);
                        al.setNota(nota);
                        lista.alterar(al);
                        break;                                

                case 0: System.out.println("Fim do programa!");
                        break;
                default: System.out.println("Opção inválida!");
            }
        } while (op != 0);   
    } 
    
    public static void menuOpcoes () {
        System.out.println("1 - Inserir valor no início da lista");
        System.out.println("2 - Inserir valor no final da lista");
        System.out.println("3 - Exibir todos os valores da lista");
        System.out.println("4 - Remover valor no início da lista");
        System.out.println("5 - Remover valor no final da lista");
        System.out.println("0 - Sair do programa");
    }
}
