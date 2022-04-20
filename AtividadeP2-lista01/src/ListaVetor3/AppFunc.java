package ListaVetor3;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class AppFunc {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CadastroFuncionario cadastroFunc = new CadastroFuncionario();
        int opcMenu;
        String matricula;
        double salario;
           do {
            System.out.println("Bem vindo ao controle de funcionarios");
            System.out.println("MENU");
            System.out.println("Escolha uma opção desejada \n 1 cadastrar funcionarios  2 exibir todos funcionarios "
                    + "3 exibir  um  funcionario especifico \n 4 para aumentar o  salario  5 remover um funcionario "
                    + "6 sair: ");
            opcMenu = scanner.nextInt();scanner.nextLine();
            switch (opcMenu) {
                case 1:
                    System.out.println("Digite a matricula do funcionario");
                    matricula = scanner.nextLine();
                    Funcionario f  = new Funcionario(matricula);
                    cadastroFunc.cadastrarFuncOrdenado(f);
                    System.out.println("");
                    break;
                case 2:
                    cadastroFunc.exibirTodosFuncionarios();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Digite a matricula  do funcionario");
                    matricula = scanner.nextLine();
                    cadastroFunc.buscarFuncBin(matricula);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Digite a matricula  do funcionario");
                    matricula = scanner.nextLine();
                    System.out.println("Digite o valor de aumento no salario  do funcionario");
                    salario = scanner.nextDouble();
                    cadastroFunc.aumentarSalario(matricula, salario);
                    break;
                case 5:
                    System.out.println("Digite a matricula para remover o funcionario");
                    matricula = scanner.nextLine();
                    cadastroFunc.removerFuncionario(matricula);
                    break;
                case 6:
                    System.out.println("Você escolheu a opção sair obrigado e volte sempre !");
                    break;
                    
                default:
                    System.err.println("Você escolheu uma opção invalida!");
                    System.out.println("");
            }
        } while (opcMenu != 6);
    }
}
