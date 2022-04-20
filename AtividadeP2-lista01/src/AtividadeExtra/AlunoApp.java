package AtividadeExtra;
import java.util.*;
/**
 *
 * @author Renato Nunes
 */
public class AlunoApp {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcMenu, qtdFaltas;
        String matricula, nome;
        double media;
        AlunoCadastro alunoCad = new AlunoCadastro();
        do {
            System.out.println("Seja Bem vindo ao Sistema de Cadastro da Turma Intro Prog.");
            System.out.println("MENU");
            System.out.println("Escolha a opção a baixo \n 1 para cadastra aluno 2 exibir alunos 3 ordenar por matricula"
                    + "\n 4 ordenar descrecente por média 5 ordernar crescente por quantidade de faltas"
                    + "\n 6 consultar aluno 0 sair ");
            opcMenu = scanner.nextInt();
            scanner.nextLine();
            switch (opcMenu) {
                case 1:
                    System.out.println("Digite a matricula do aluno");
                    matricula = scanner.nextLine();
                    Aluno a = new Aluno(matricula);
                    System.out.println("Digite o nome do Aluno");
                    nome = scanner.nextLine();
                    a.setNome(nome);
                    System.out.println("Digite a média do Aluno");
                    media = scanner.nextDouble();
                    while (media < 0 || media > 10) {
                        System.err.println("Atenção você digitou errado a media: ");
                        System.out.println("Digite a média do Aluno");
                        media = scanner.nextDouble();

                    }
                    a.setMedia(media);
                    System.out.println("Digite a quantidade de faltas do Aluno");
                    qtdFaltas = scanner.nextInt();
                    while (qtdFaltas < 0) {
                        System.err.println("Atenção você digitou errado a quantidade de faltas");
                        System.out.println("Digite  a quantidade de faltas:");
                        qtdFaltas = scanner.nextInt();
                    }
                    a.setQtdFaltas(qtdFaltas);
                    alunoCad.cadastar(a);
                    System.out.println("");
                    break;
                case 2:
                    alunoCad.exibir();
                    System.out.println("");
                    break;
                case 3:
                    alunoCad.ordernarInsDireta();
                    System.out.println("");
                    
                    break;
                case 4:
                    alunoCad.ordenarBsDescresc();                    
                    System.out.println("");
                    break;
                case 5:
                    alunoCad.ordenarSelDireta();
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Digite a matricula para pesquisar o aluno!");
                    matricula = scanner.nextLine();
                    alunoCad.buscarAluno(matricula);
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
