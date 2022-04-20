/*
OBS1: só pode haver ALTERAÇÕES se a televisão estiver ligada
OBS2: pode haver CONSULTA mesmo com a televisão desligada
OBS3: alterar o volume faz com que a TV saia do estado de mudo
 */
package ExercicioTV;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class Tv {

    private int volume;
    private boolean botao;
    private int canal;
    private int[] canalList;

    public Tv(int[] cL) {
        this.canalList = cL;
    }
//    public Tv() {
//    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isBotao() {
        return botao;
    }

    public void setBotao(boolean botao) {
        this.botao = botao;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "Tv{" + "volume=" + volume + ", botao=" + botao + ", canal=" + canal + '}';
    }

    public static boolean power(boolean s) {

        if (s == true) {
            s = false;
            return s;
        } else {
            s = true;
            return s;
        }
    }

    public static int aumentarVolume(int v) {
        if (v < 0 && v > 10) {
            System.err.println("Atenção Volume Maximo");
        } else {
            v = v + 1;
        }
        return v;
    }

    public static int diminuirVolume(int v) {
        if (v == 0) {
            System.err.println("Atenção Volume minimo");
        } else {
            v = v - 1;
        }
        return v;
    }

    public static int aumentarCanal(int c) {
        if (c == 999) {
            c = 2;
        } else {
            c = c + 1;
        }
        return c;
    }

    public static int diminuirCanal(int c) {
        if (c == 2) {
            c = 999;
        } else {
            c = c - 1;
        }
        return c;
    }

    public static int mudarCanal(int[] list, int c, int cDesejado) {
        int i;
        for (i = 2; i < list.length; i = i + 1) {
            if (list[i] == cDesejado) {
                c = cDesejado;
            }
        }
        return c;
    }

    public static int mudo(int v) {
        return v = 0;
    }
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean status;
        int volume, canal,c;
        int[] list = {2, 4, 6, 7, 9, 11, 13, 14, 17, 21, 22, 27, 29, 30, 31, 33, 39, 41, 43, 47, 49, 51, 55, 62, 70, 77, 99, 159, 301, 400, 555};

        Tv t = new Tv(list);

        volume = 6;
        canal = 999;
        status = false;

        status = t.power(status);

        if (status == false) {
            System.out.println("A Tv esta desliga não pode fazer alterações");
        } else {
            System.out.println("Volume atual=" + volume);
            volume = t.diminuirVolume(volume);
            System.out.println("Volume atual=" + volume);
            volume = t.mudo(volume);
            System.out.println("Volume atual=" + volume);
            volume = t.aumentarVolume(volume);
            volume = t.aumentarVolume(volume);
            volume = t.aumentarVolume(volume);
            System.out.println("Volume atual=" + volume);
            
            System.out.println("Canal atual=" + canal);
            canal = t.aumentarCanal(canal);
            System.out.println("Canal atual=" + canal);
            canal = t.diminuirCanal(canal);
            System.out.println("Canal atual=" + canal);
            c=9;
            canal = t.mudarCanal(list, canal, c);
            System.out.println("Canal atual=" + canal);
        }

    }
}
