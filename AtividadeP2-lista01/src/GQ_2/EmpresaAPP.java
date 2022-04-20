/*
1 cad func
2 orderna desc por matricu
3 consulta func
0 sair
 */
package GQ_2;

import java.util.*;

/**
 *
 * @author Renato Nunes
 */
public class EmpresaAPP {
    public static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
         int opcMenu, ano;
        String matricula, nome;
        double salario;
        CadastroFuncionario cadFunc = new CadastroFuncionario();
        do {
            System.out.println("Seja Bem vindo a S.A Entreprise.");
            System.out.println("MENU");
            System.out.println("Escolha a opção a baixo \n 1 para cadastra um Novo funcionario 2 ordenar por Matricula descrecente"
                    + "\n 3 consultar um funcionario 0 sair ");
            opcMenu = scanner.nextInt();
            scanner.nextLine();
            switch (opcMenu) {
                case 1:
                    System.out.println("Digite a matricula do funcionario");
                    matricula = scanner.nextLine();
                    Funcionario f = new Funcionario(matricula);
                    System.out.println("Digite o nome do funcionario");
                    nome = scanner.nextLine();
                    f.setNome(nome);
                    System.out.println("Digite o salario do funcionario");
                    salario = scanner.nextDouble();
                    while (salario < 0) {
                        System.err.println("Atenção você digitou errado,digite um salario valido: ");
                        System.out.println("Digite salario do funcionario");
                        salario = scanner.nextDouble();

                    }
                    f.setSalario(salario);
                    System.out.println("Digite o ano de contratação");
                    ano = scanner.nextInt();
                    while (ano < 1930 || ano > 2020) {
                        System.err.println("Atenção você digitou errado o ano de contratação");
                        System.out.println("Digite  a ano de contratação novamente:");
                        ano = scanner.nextInt();
                    }
                    f.setAnoContracao(ano);
                    cadFunc.cadastar(f);
                    System.out.println("");
                    break;
                case 2:
                    cadFunc.ordenarSelDiretaDesc();
                    System.out.println("");
                    break;
                case 3: 
                    System.out.println("Digite a matricula do funcionario que deseja pesquisar");
                    matricula = scanner.nextLine();
                    cadFunc.buscarFuncionario(matricula);
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
