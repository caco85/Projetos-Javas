package GQ_2;

/**
 *
 * @author Renato Nunes
 */
public class CadastroFuncionario {

    private Funcionario[] funcionarios;
    private int cont = 0;
    private boolean flag = false;
    private int dadoBusca;

    public CadastroFuncionario() {
        funcionarios = new Funcionario[300];
    }

    public void cadastar(Funcionario f) {
        if (this.cont < this.funcionarios.length) {
            dadoBusca = buscaSimpleficada(f.getMatricula());
            if (dadoBusca == -1) {
                this.funcionarios[this.cont] = f;
                this.cont++;
                System.out.println("Cadastro com Sucesso!");
            } else {
                System.out.println("o cadastramento não pode ser efetuado, pois a matrícula"
                        + " já existe!");
            }
        } else {
            System.out.println("Cadastramento não efetuado por falta de espaço!");
        }
        flag = false;
    }

    private int buscaSimpleficada(String m) {
        int i, pos = -1;
        for (i = 0; i < this.cont; i++) {
            if (this.funcionarios[i].getMatricula().equals(m)) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    public void ordenarSelDiretaDesc() {
        if (cont != 0) {
            int i, j, menor;
            Funcionario aux;
            int fim = cont - 1;
            for (i = 0; i < fim; i++) {
                menor = i;
                for (j = i + 1; j <= fim; j++) {
                    if (funcionarios[i].getMatricula().compareToIgnoreCase(funcionarios[i + 1].getMatricula()) < 0) {
                        menor = j;
                    }
                }
                aux = funcionarios[i];
                funcionarios[i] = funcionarios[menor];
                funcionarios[menor] = aux;
            }
            flag = true;
            System.out.println("Pronto Ordenado com sucesso! ");
        } else {
            System.out.println("Ainda não há funcionarios cadastrados");
        }

    }
    private int buscarBin(String matricula) {
        int p = 0, inicio = 0, fim = this.cont - 1, meio;
        do {
            meio = (inicio + fim) / 2;
            if (matricula.equalsIgnoreCase(this.funcionarios[meio].getMatricula()) == true) {
                p = meio;
                break;
            } else if (matricula.compareToIgnoreCase(this.funcionarios[meio].getMatricula()) < 0) {
                fim = meio - 1;
            } else {
                fim = meio + 1;
            }
        } while (inicio <= fim);
        return p;
    }

    public void buscarFuncionario(String m) {
        if (flag == true) {
            if (this.cont != 0) {
                dadoBusca = buscarBin(m);
                if (dadoBusca == -1) {
                    System.out.println("Funcionario não encontrado ,matricula inexistente!!");
                    System.out.println("");
                } else {
                    System.out.println("Aluno encotrado! ");
                    System.out.println(this.funcionarios[dadoBusca]);
                    System.out.println("");
                }
            } else {
                System.out.println("O cadastro ainda esta vazio,por obséquio cadastrar novos funcionários.");
                System.out.println("");
            }
        } else {
            if (this.cont != 0) {
                dadoBusca = buscaSimpleficada(m);
                if (dadoBusca == -1) {
                    System.out.println("Funcionario não encontrado, matricula inexistente!");
                } else {
                    System.out.println("Funcionario encotrado! ");
                    System.out.println(this.funcionarios[dadoBusca]);
                    System.out.println("");
                }
            } else {
                System.out.println("O cadastro ainda esta vazio,por obséquio cadastrar novos funcionários.");
                System.out.println("");
            }
        }
    }

}
