package exercicioLSECpack1.UI;

import exercicioLSECpack2.Dados.LSEC;
import exercicioLSECpack3.Modelo.Aluno;
import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class appTurma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        LSEC <Aluno> lista = new LSEC(); 
        int opcMenu, qtd;
        Aluno al;
        String matricula,nome;
        double media;
        do {
          
            System.out.println("Informe a opção desejada: ");
            menuAluno();
            opcMenu = scanner.nextInt(); scanner.nextLine();
            switch (opcMenu) {
                case 1: 
                        System.out.println("Digite a matricula  do aluno: ");
                        matricula =scanner.nextLine();
                        System.out.println("Digite o nome do aluno: ");
                        nome = scanner.nextLine();
                        System.out.println("Digite a media do aluno: ");
                        media = scanner.nextDouble(); scanner.nextLine();
                        System.out.println("Digite a quantaide de faltas do aluno: ");
                        qtd = scanner.nextInt();
                        al = new Aluno (matricula);
                        al.setMediaFinal(media);
                        al.setQtdFaltas(qtd);
                        lista.inserirNoFinal(al);
                        break;
                case 2:  lista.exibirTodos();
                        break;
                case 3: System.out.println("Digite a matricula  do aluno para pequisar: ");
                        matricula =scanner.nextLine();
                        al = new Aluno(matricula);
                        System.out.println("Informe a nova media do aluno: ");
                        media = scanner.nextDouble();
                        al.setMediaFinal(media);
                        lista.alterar(al);                      
                        break;
                case 4: System.out.println("Digite a matricula  do aluno para pequisar: ");
                        matricula =scanner.nextLine();
                        al = new Aluno(matricula);
                        System.out.println("Informe a nova quantaidade de faltas do aluno: ");
                        qtd = scanner.nextInt();
                        al.setQtdFaltas(qtd);
                        lista.alterar(al); 
                        break;
                case 5: System.out.println("Digite a matricula  do aluno para pequisar: ");
                        matricula =scanner.nextLine();
                        al = new Aluno(matricula);
                        lista.buscarAluno(al);
                        break;
                 case 6: System.out.println("Digite o nome do aluno: ");
                        nome = scanner.nextLine();
                        al = new Aluno (nome);
                        lista.removerNoFinal();
                        break;
                case 0: lista.sair();
                        break;
                default: System.out.println("Você digitou algo errado! ");
            }
        } while (opcMenu != 0);   

    }

    public static void menuAluno() {
        System.out.println("1 - Cadastra Aluno: ");
        System.out.println("2 - Listar todos Alunos: ");
        System.out.println("3 - Alterar media final do aluno: ");
        System.out.println("4 - Alterar quantidade de faltas");
        System.out.println("5 - Exibir media media e faltas");
        System.out.println("6 - Remover Aluno");
        System.out.println("0 - Sair do programa");
    }
}
