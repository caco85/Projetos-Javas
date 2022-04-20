package GQ_1;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class Turma {
    private Aluno[] alunos;
    private int cont;
    public static Scanner scanner = new Scanner(System.in);

    public Turma() {
        alunos = new Aluno[60];
    }

    public void cadastrarAlunoOrden(Aluno a) {
        String m1, m2;
        int i, j, pos = 0;
        if (this.cont == 0) {
            this.alunos[this.cont] = a;
            this.cont++;
            System.out.println(" Aluno cadastrado com sucesso!");
        } else if (this.cont < this.alunos.length) {
            m1 = a.getMatricula();
            m2 = this.alunos[this.cont - 1].getMatricula();
            if (m1.compareToIgnoreCase(m2) > 0) {
                this.alunos[this.cont] = a;
                this.cont++;
                System.out.println("Aluno cadastrado com sucesso!");
            } else {
                for (i = 0; i < this.cont; i++) {
                    m2 = this.alunos[i].getMatricula();
                    if (m2.equalsIgnoreCase(m1) == true) {
                        System.out.println("Aluno não cadastrado,pois  já exite aluno com esta matricula");
                        return;
                    } else if (m2.compareToIgnoreCase(m1) > 0) {
                        pos = i;
                        break;
                    }
                }
                for (j = this.cont - 1; j > pos; j--) {
                    this.alunos[j + 1] = this.alunos[j];
                }
                this.alunos[pos] = a;
                this.cont++;
                System.out.println("Aluno cadastrado com sucesso");
            }
        } else {
            System.out.println("Não há espaço pra cadastra mais Alunos");
        }
    }

    public double calcMedia(double n1, double n2) {
        double media;
        return media = ((n1 * 2) + (n2 * 3)) / 5;
    }

    public void exibirTodosAlunos() {
        int i;
        for (i = 0; i < cont; i++) {
            if (alunos[i] != null) {
                System.out.println(alunos[i]);
            }
        }
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

    public void buscarAlunoPelaMatricula(String m) {
        int dado;
        if (this.cont != 0) {
            dado = buscarAlunoBin(m);
            if (dado == -1) {
                System.out.println("Aluno não encontrado!");
            } else {
                System.out.println("Aluno encotrado!");
                System.out.println(this.alunos[dado]);
            }
        } else {
            System.out.println("O cadastro ainda esta vazio,por obséquio cadastra alunos.");
        }
    }

    public void atualizarAluno(String m) {
        int dado, subMenu,novaQtdFaltas;
        double nota1,nota2,novaMedia;
        if (this.cont != 0) {
            dado = buscarAlunoBin(m);
            if (dado == -1) {
                System.out.println("Aluno não encontrado!");
            } else {
                do {
                    System.out.println("Aluno encotrado! \n SubMenu");
                    System.out.println("Escolha a opção desejada para: \n 1 atualizar Media: 2 atualizar faltas 0 Sair ");
                    subMenu = scanner.nextInt();
                    switch (subMenu) {
                        case 1:
                            System.out.println("Digite a primeira nota do Aluno");
                            nota1 = scanner.nextDouble();
                            System.out.println("Digite a segunda nota  do Aluno");
                            nota2 = scanner.nextDouble();
                            while (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 >10) {    
                                System.err.println("Atenção você digitou errado a nota 1 ou nota 2");
                                System.out.println("Digite a primeira nota do Aluno");
                                nota1 = scanner.nextDouble();
                                System.out.println("Digite a segunda nota  do Aluno");
                                nota2 = scanner.nextDouble();
                            }
                            novaMedia = calcMedia(nota1, nota2);
                            this.alunos[dado].setMedia(novaMedia);
                            System.out.println("Media Atualizada com Sucesso! Nova media"+this.alunos[dado].getMedia());
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("Digite  a quantidade de faltas:");
                            novaQtdFaltas = scanner.nextInt();
                            while (novaQtdFaltas < 0) {
                                System.err.println("Atenção você digitou errado a quantidade de faltas");
                                System.out.println("Digite  a quantidade de faltas:");
                                novaQtdFaltas = scanner.nextInt();
                            }
                            this.alunos[dado].setQtdFaltas(novaQtdFaltas);
                            System.out.println("Quantidade de faltas atualizada com sucesso!"
                                              +" Nova quantidade: "+this.alunos[dado].getQtdFaltas());
                            System.out.println("");
                            break;
                        case 0:
                            System.out.println("Você escolheu a opção sair obrigado e ira voltar pro Menu Principal !");
                            break;
                        default:
                            System.err.println("Você escolheu uma opção invalida!");
                            System.out.println("");
                    }

                } while (subMenu != 0);
            }
        } else {
            System.out.println("O cadastro ainda esta vazio,por obséquio cadastra alunos.");
        }
    }
    public void remover(String matricula){
        int i,dado;
        if (this.cont == 0) {
            System.out.println("O cadastro ainda esta vazio");
        }else{
            dado = buscarAlunoBin(matricula);
            if (dado == -1) {
                System.out.println("Matricula do aluno informado não encontrado!");
            }
            else {
                for (i = dado; i < cont -1; i++) {
                    this.alunos[i]= this.alunos[i+1];
                }
                this.alunos[i] =null;
                this.cont--;
                System.out.println("Aluno Removido com Sucesso!");
            }
        }
    }
}
