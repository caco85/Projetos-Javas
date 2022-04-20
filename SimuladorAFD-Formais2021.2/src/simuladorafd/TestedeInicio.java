package simuladorafd;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class TestedeInicio {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int cont = 0;
        char palavra[];
        String sentenca;

        TestedeInicio teste = new TestedeInicio();
        System.out.println("Digite a entrada da AFD");
        sentenca = scanner.nextLine();
        palavra = sentenca.toCharArray();
        teste.inicar(cont, palavra);
   
    }

    public void inicar(int cont, char palavra[]) {

        q0(cont, palavra);
    }

    public void q0(int cont, char palavra[]) {
        if (cont < palavra.length) {

            if (palavra[cont] == 'a') {
                cont++;
                q1(cont, palavra);
            } else if (palavra[cont] == 'c') {
                qf();
            } else {
                qErro();
            }

        } else {
            qErro();
        }
    }

    public void q1(int cont, char palavra[]) {
        if (cont < palavra.length) {
            if (palavra[cont] == 'b') {
                cont++;
                System.out.println("A palavra "+palavra[cont] + "Digitada não é estado final foi para o proximo q");
                q2(cont, palavra);
            } else {
                qErro();
            }
        } else {
            qErro();
        }
    }

    public void q2(int cont, char palavra[]) {
        if (cont < palavra.length) {
            if (palavra[cont] == 'b') {
                cont++;
                 System.out.println("A palavra "+palavra[cont] + "Digitada não é estado final foi para o proximo q");
                q0(cont, palavra);
            } else {
                qErro();
            }
        } else {
            qErro();
        }
    }

    public void qf() {
        System.out.println("Palavra aceita pelo Automato!!");
    }

    public void qErro() {
        System.err.println("Palavra rejeitada pelo Automato!!");
    };
}
