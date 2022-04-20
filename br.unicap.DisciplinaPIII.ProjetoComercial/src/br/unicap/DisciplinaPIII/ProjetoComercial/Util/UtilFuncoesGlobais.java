package br.unicap.DisciplinaPIII.ProjetoComercial.Util;

/**
 *
 * @author Renato Nunes
 */
public class UtilFuncoesGlobais {

    public boolean validarApenasLetra(String num) {
        int tam = num.length(), i;
        boolean valido = true;
        for (i = 0; i < tam; i++) {
            if (Character.isLetter(num.charAt(i)) == false && Character.isSpaceChar(i) != false) {
                valido = false;
                break;
            }
        }
        return valido;
    }
        public boolean validarNum(String num)  {
        int tam = num.length(), i;
        boolean valido = true;
        for (i = 0; i < tam; i++) {
            if (Character.isDigit(num.charAt(i)) == false && Character.isSpaceChar(i) != false) {
                valido = false;
                break;
            }
        }
        return valido;
    }
}
