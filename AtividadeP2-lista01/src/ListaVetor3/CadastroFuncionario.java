package ListaVetor3;
import java.util.Scanner;
/**
 *
 * @author Renato Nunes
 */
public class CadastroFuncionario {
    private Funcionario[] funcionarios;
    int cont;
    final int tam = 100;
    public static Scanner scanner = new Scanner(System.in);
    public CadastroFuncionario() {
        funcionarios = new Funcionario[tam];
    }
    public void cadastrar(Funcionario f) {
        int i;
        String matricula;
        System.out.println("Digite a matricula do funcionario");
        matricula = scanner.nextLine();
        scanner.nextLine();
        f = new Funcionario(matricula);
        System.out.println("Digite o nome do funcionario");
        f.nome = scanner.nextLine();
        System.out.println("Digite o cargo do funcionario");
        f.cargo = scanner.nextLine();
        System.out.println("Digite o salario do funcionario");
        f.salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a data de entrada do funcionario");
        f.dataContratacao = scanner.nextLine();
        cont = cont + 1;
        if (cont > 0) {
            for (i = 0; i < cont; i++) {
                if (funcionarios[i] != null && funcionarios[i].getMatricula().equals(matricula)) {
                    System.out.println("Ja existe funcionario cadastrado com esta matricula informada! ");
                    cont = cont - 1;
                    break;
                } else if (funcionarios[i] == null) {
                    funcionarios[i] = f;
                    System.out.println("Funcionario cadastrado! ");
                    break;
                }
            }
        }
    }

    public void cadastrarFuncOrdenado(Funcionario f) {
        int i, j, pos = 0;
        String m1, m2;
        
        System.out.println("Digite o nome do funcionario");
        f.nome = scanner.nextLine();
        System.out.println("Digite o cargo do funcionario");
        f.cargo = scanner.nextLine();
        System.out.println("Digite o salario do funcionario");
        f.salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a data de entrada do funcionario");
        f.dataContratacao = scanner.nextLine();
        if (this.cont == 0) {
            this.funcionarios[this.cont] = f;
            this.cont++;
            System.out.println(" cadastrado com sucesso!");
        } else if (this.cont < this.funcionarios.length) {
            m1 = f.getMatricula();
            m2 = this.funcionarios[this.cont - 1].getMatricula();
            if (m1.compareToIgnoreCase(m2) > 0) {
                this.funcionarios[this.cont] = f;
                this.cont++;
                System.out.println(" cadastrado com sucesso!");
            } else {
                for (i = 0; i < this.cont; i++) {
                    m2 = this.funcionarios[i].getMatricula();
                    if (m2.equalsIgnoreCase(m1) == true) {
                        System.out.println("Funcionario ja cadastrado com esta matricula");
                        return;
                    } else if (m2.compareToIgnoreCase(m1) > 0) {
                        pos = i;
                        break;
                    }
                }
                for (j = this.cont - 1; j > pos; j--) {
                    this.funcionarios[j + 1] = this.funcionarios[j];
                }
                this.funcionarios[pos] = f;
                this.cont++;
                System.out.println("cadastrado com sucesso");
            }
        } else {
            System.out.println("Não há espaço pra cadastra mais funcionarios");
        }
    }
    public void exibirTodosFuncionarios() {
        int i;
        System.out.println("Abaixo segue a lista dos funcionarios cadastrados:");
        for (i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null) {
                System.out.println(funcionarios[i]);
            }
        }
    }

    public int exibirFuncPelaMatricula(String matricula) {
        int i, pos = -1;
        for (i = 0; i < cont; i++) {
            if (funcionarios[i].getMatricula().equals(matricula)) {
              //  System.out.println("Funcionario encontrado"+funcionarios[i]);
                pos = i;
                break;
            }
        }
        return pos;
    }
    public void aumentarSalario(String m, double aumento) {
        int i;
        double novoSalario;
        for (i = 0; i < cont; i++) {
            if (funcionarios[i].getMatricula().equals(m)) {
                novoSalario = funcionarios[i].getSalario() + aumento;
                funcionarios[i].setSalario(novoSalario);
                System.out.println("Novo salario é R$" + novoSalario);
                System.out.println("");
                break;
            } else {
                System.out.println("Não exite funcionario com esta matricula");
                System.out.println("");
            }
        }
    }

    public void removerFuncionario(String matricula) {
        int i;
        if (exibirFuncPelaMatricula(matricula) != -1) {
            for ( i = 0; i < cont; i++) {
                if (funcionarios[i].getMatricula().equals(matricula)) {
                    funcionarios[i] = null;
                    System.out.println("Funcionario Excluido");
                    System.out.println("");
                    break; 
                }
            }
        } else {
            System.out.println("Matricula não encontrada");
            System.out.println("");
        }
    }
    public int buscarFuncBin(String m) {
        int inicio = 0,meio, fim = funcionarios.length - 1;
        
        boolean achou = false;
        do {
            meio = (inicio + fim) / 2;
            if(funcionarios[meio].getMatricula().compareToIgnoreCase(m)<0){
                achou = true;
                break;
            }else if(funcionarios[meio].getMatricula().compareToIgnoreCase(m)>0){
		fim=meio-1;
            }else { 
		inicio=meio+1;
            }
        } while (inicio <= fim);
        if (achou == true) {
            System.out.println("Achou"+funcionarios[meio]);
            return meio;
        } else {
            return - 1;
        }
    }
}
