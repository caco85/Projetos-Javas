package exercicioLDEpack1.UI;

import exercicioLDEpack2.Model.Pessoa;
import exercicioLDEpack3.dados.LDEAdv;
import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LDEAdv<Pessoa> lista = new LDEAdv();
        int opcMenu;
        String nome, rg;
        Pessoa p;
        System.out.println("Digite a opção desejada");
        Menu();
        opcMenu = scanner.nextInt();

        switch (opcMenu) {
            case 1:
                System.out.println("Digite o RG");
                rg = scanner.nextLine();
                p = new Pessoa(rg);
                System.out.println("Digite o nome");
                nome = scanner.nextLine();
                p.setNome(nome);
                lista.inserirNoFinal(p);
                break;
            case 2: lista.removerNoFinal();
                break;
            case 3:lista.exibirTodos();
                break;
            case 4:
                System.out.println("Digite o Rg para fazer a busca:");
                rg = scanner.nextLine();
                p = new Pessoa(rg);
                lista.exibirPessoa(p);
                break;
            case 5:
                System.out.println("A quantaidade de Pessoas no predio no momento são: "+ lista.contarPessoas());
                break;
            case 6:lista.removerNoFinal();
                break;
            case 0:lista.sair();
                break;
            default:
                System.err.println("VocÊ digitou uma opção invalida!");
                    
        }

    }

    public static void Menu() {
        System.out.println("1 – Cadastrar: ");
        System.out.println("2 – Cancelar: ");
        System.out.println("3 – Exibir: ");
        System.out.println("4 – Verificar:  ");
        System.out.println("5 – Contagem de pessoas estão no prédio: ");
        System.out.println("6 – Remover: ");
        System.out.println("0 – Sair do programa ");
    }

}
