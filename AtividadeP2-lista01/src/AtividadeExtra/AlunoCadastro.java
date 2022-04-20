package AtividadeExtra;

/**
 *
 * @author Renato Nunes
 */
public class AlunoCadastro {

    private Aluno[] alunos;
    private int cont, flagAux = 0;
    private boolean flag = false;
    private int dadoBusca;

    public AlunoCadastro() {
        alunos = new Aluno[60];
    }

    public void cadastar(Aluno a) {
        if (this.cont < this.alunos.length) {
            dadoBusca = buscaSimpleficada(a.getMatricula());
            if (dadoBusca == -1) {
                this.alunos[this.cont] = a;
                this.cont++;
                System.out.println("Cadastro com Sucesso!");
            } else {
                System.out.println("o cadastramento não pode ser efetuado, pois a matrícula"
                        + " já existe!");
            }
        } else {
            System.out.println("Cadastramento não efetuado por falta de espaço!");
        }
    }

    private int buscaSimpleficada(String m) {
        int i, pos = -1;
        for (i = 0; i < this.cont; i++) {
            if (this.alunos[i].getMatricula().equals(m)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    private int buscarAlunoBin(String matricula) {
        int p = 0, inicio = 0, fim = this.cont - 1, meio;
        do {
            meio = (inicio + fim) / 2;
            if (matricula.equalsIgnoreCase(this.alunos[meio].getMatricula()) == true) {
                p = meio;
                break;
            } else if (matricula.compareToIgnoreCase(this.alunos[meio].getMatricula()) < 0) {
                fim = meio - 1;
            } else {
                fim = meio + 1;
            }
        } while (inicio <= fim);
        return p;
    }

    public void buscarAluno(String m) {
        if (flag == true) {
            if (this.cont != 0) {
                dadoBusca = buscarAlunoBin(m);
                if (dadoBusca == -1) {
                    System.out.println("Aluno não encontrado ,matricula inexistente!!");
                    System.out.println("");
                } else {
                    System.out.println("Aluno encotrado! ");
                    System.out.println(this.alunos[dadoBusca]);
                    System.out.println("");
                }
            } else {
                System.out.println("O cadastro ainda esta vazio,por obséquio cadastra alunos.");
                System.out.println("");
            }
        } else {
            if (this.cont != 0) {
                dadoBusca = buscaSimpleficada(m);
                if (dadoBusca == -1) {
                    System.out.println("Aluno não encontrado, matricula inexistente!");
                } else {
                    System.out.println("Aluno encotrado! ");
                    System.out.println(this.alunos[dadoBusca]);
                    System.out.println("");
                }
            } else {
                System.out.println("O cadastro ainda esta vazio,por obséquio cadastra alunos.");
                System.out.println("");
            }
        }
    }

    public void exibir() {
        int i;
        if (cont != 0) {
            if (flag == true) {
                System.out.println("Segue lista de aluno ordenado por matricula: ");
                System.out.println("");
            } else {

                if (flagAux == 1) {
                    System.out.println("Segue lista ordenado descrecente  por media: ");
                    System.out.println("");
                } else if (flagAux == 2) {
                    System.out.println("Segue lista ordenado crescente  por falta: ");
                    System.out.println("");
                } else {
                    System.out.println("Segue lista não ordenado por matricula: ");
                    System.out.println("");
                }
            }
            for (i = 0; i < this.cont; i++) {
                System.out.println(this.alunos[i]);
            }
        } else {
            System.out.println("Ainda não há alunos cadastrados");
        }

    }

    public void ordernarInsDireta() {
        if (cont != 0) {
            int i, j, fim = cont - 1;
            Aluno chave;
            for (i = 1; i <= fim; i++) {
                chave = alunos[i];
                j = i - 1;
                while (j >= 0 && alunos[j].getMatricula().compareToIgnoreCase(chave.getMatricula()) > 0) {
                    alunos[j + 1] = alunos[j];
                    j = j - 1;
                }
                alunos[j + 1] =chave;
            }
            System.out.println("Pronto Ordenado com sucesso,verifique em exibir alunos. ");
            flag = true;
            flagAux = 0;
        } else {
            System.out.println("Ainda não há alunos cadastrados");
        }
    }

    
    
//    	public static void adicionarOrdenadoDEsc(Fracao[] v, int tam, Fracao f) {
//		int i = tam;
//                double chave;
//		while (i > 0 && v[i - 1].compareTo(f) < 0) {
//                        chave = v[i];
//                        v[i] = v[i +1];
//			v[i + 1] = chave;
//			i = i -1;
//		}
//		v[i] = f;
//	}
    public void ordenarBsDescresc() {
        if (cont != 0) {
            int i, fim = cont - 2, pos = 0;
            boolean troca;
            Aluno chave;
            do {
                troca = false;
                for (i = 0; i <= fim; i++) {
                    if (alunos[i].getMedia() < alunos[i + 1].getMedia()) {
                        chave = alunos[i];
                        alunos[i] = alunos[i + 1];
                        alunos[i + 1] = chave;
                        troca = true;
                        pos = i;
                    }
                }
                fim = pos - 1;
            } while (troca == true);
            flag = false;
            flagAux = 1;
            System.out.println("Pronto Ordenado com sucesso,verifique em exibir alunos. ");
        } else {
            System.out.println("Ainda não há alunos cadastrados");
        }

    }

    public void ordenarSelDireta() {
        if (cont != 0) {
            int i, j, menor;
            Aluno aux;
            int fim = cont - 1;
            for (i = 0; i < fim; i++) {
                menor = i;
                for (j = i + 1; j <= fim; j++) {
                    if (alunos[j].getQtdFaltas() < alunos[menor].qtdFaltas) {
                        menor = j;
                    }
                }
                aux = alunos[i];
                alunos[i] = alunos[menor];
                alunos[menor] = aux;
            }
            flag = false;
            flagAux = 2;
            System.out.println("Pronto Ordenado com sucesso,verifique em exibir alunos. ");
        } else {
            System.out.println("Ainda não há alunos cadastrados");
        }

    }
//    public void ordenarBsCresc() {
//        int i, fim = cont - 2, pos = 0;
//        boolean troca;
//        Aluno chave;
//        do {
//            troca = false;
//            for (i = 0; i <= fim; i++) {
//                if (alunos[i].getQtdFaltas() > alunos[i + 1].getQtdFaltas()) {
//                    chave = alunos[i];
//                    alunos[i] = alunos[i + 1];
//                    alunos[i + 1] = chave;
//                    troca = true;
//                    pos = i;
//                }
//            }
//            fim = pos - 1;
//        } while (troca == true);
//        flag = false;
//        flagAux = 2;
//    }

}
