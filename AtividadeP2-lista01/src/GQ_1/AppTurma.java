package GQ_1;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class AppTurma {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Turma turma = new Turma();
        double nota1, nota2;
        int opcMenu;
        String matricula;
           do {
            System.out.println("Bem vindo ao Portal Academico Unicap Turma PII 2020.1 ");
            System.out.println("MENU");
            System.out.println("Escolha uma opção desejada: \n 1 cadastrar Alunos:  2 exibir todos Alunos: "
                    + "3 exibir  um aluno pela matricula: \n 4 para atualizar media  e/ou  quantidade de faltas:  "
                    + "\n 5 remover um aluno:  0 sair: ");
            opcMenu = scanner.nextInt();scanner.nextLine();
            switch (opcMenu) {
                case 1:
                    System.out.println("Digite a matricula do aluno");
                    matricula = scanner.nextLine();
                    Aluno a = new Aluno(matricula);
                    System.out.println("Digite o nome do Aluno");
                    a.nome = scanner.nextLine();
                    System.out.println("Digite a primeira nota do Aluno");
                    nota1 = scanner.nextDouble();scanner.nextLine();
                    System.out.println("Digite a segunda nota  do Aluno");
                    nota2 = scanner.nextDouble(); scanner.nextLine();
                    while (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
                        System.err.println("Atenção você digitou errado a nota 1 ou nota 2");
                        System.out.println("Digite a primeira nota do Aluno");
                        nota1 = scanner.nextDouble();
                        System.out.println("Digite a segunda nota  do Aluno");
                        nota2 = scanner.nextDouble();
                    }
                    a.media = turma.calcMedia(nota1, nota2);
                    System.out.println("Digite a quantidade de faltas do Aluno");
                    a.qtdFaltas = scanner.nextInt();
                    while (a.qtdFaltas < 0) {
                        System.err.println("Atenção você digitou errado a quantidade de faltas");
                        System.out.println("Digite  a quantidade de faltas:");
                        a.qtdFaltas = scanner.nextInt();
                    }
                    turma.cadastrarAlunoOrden(a);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Abaixo segue a lista dos Alunos cadastrados:");
                    turma.exibirTodosAlunos();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Digite a matricula  do  Aluno pesquisado");
                    matricula = scanner.nextLine();
                    turma.buscarAlunoPelaMatricula(matricula);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Digite a matricula  do Aluno para atualizar");
                    matricula = scanner.nextLine();
                    turma.atualizarAluno(matricula);
                    break;
                case 5:
                    System.out.println("Digite a matricula para remover o Aluno");
                    matricula = scanner.nextLine();
                    turma.remover(matricula);
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("Você escolheu a opção sair obrigado e volte sempre !");
                    break;
                default:
                    System.err.println("Você escolheu uma opção invalida!");
                    System.out.println("");
            }
        } while (opcMenu != 0);
        
    }
    
}
