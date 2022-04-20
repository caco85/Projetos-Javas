package simuladorafd;

import java.util.Arrays;

/**
 *
 * @author Renato Nunes
 */
public class Automatos {

    private char[] palavras;

    public Automatos(char[] palavras) {
        this.palavras = palavras;
    }

    public void estados() {
        q0();
    }

    private void q0() {
        if (this.palavras[0] == 'a') {
            System.out.println("Foi pra o proximo estado q1");
            System.out.println("");
            q1();
        } else if (this.palavras[0] == 'c') {
            qf();
        } else {
            qErro();
        }
    }

    private void q1() {
        if (this.palavras[1] == 'b') {
            System.out.println("Foi pra o proximo estado q1");
            System.out.println("");
            q2();
        } else if (this.palavras[1] == 'c') {
            qf();
        } else {
            qErro();
        }
    }

    private void q2() {

    }

    private void q3() {

    }

    private void qf() {
        System.out.println("Palavra aceita pelo Automato!!");
    }

    public void qErro() {
        System.err.println("Palavra rejeitada pelo Automato!!");
    }
;
}
