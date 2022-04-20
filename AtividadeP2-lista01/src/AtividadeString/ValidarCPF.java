
package AtividadeString;

import java.util.*;

/**
 *
 * @author Renato Nunes
 */
public class ValidarCPF {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String cpf;
        int cont = 0, tam = 0, i;
        char escolha;

        String[] vetCpf = new String[50];
        do {
            System.out.println("Digite o cpf");
            cpf = scanner.next();
            tam = cpf.length();

            if (tam == 11) {
                if (validaNum(cpf) != false) {
                    if (validarDigito(cpf) == true) {
                        imprimeCpf(cpf, tam);
                        vetCpf[cont] = cpf;
                        cont++;
                    } else {
                        System.out.println("Validação do digitou falhou,cpf invalido");
                    }

                } else {
                    System.out.println("O cpf precisa ser só numeros!");
                }
            } else {
                System.out.println("Você digitou a quantidade de numeros errado do cpf: ");
            }
            System.out.println("");
            System.out.println("Deseja valida outro cpf, responda S para sim ou N para encerra! ");
            escolha = scanner.next().charAt(0);
            escolha = Character.toLowerCase(escolha);
            System.out.println("");
        } while (escolha != 'n');
        System.out.println("Segue todos os cpfs validos");
        for (i = 0; i < cont; i++) {
            imprimeCpf(vetCpf[i], tam);
        }

    }

    public static boolean validarDigito(String cpf) {
        boolean valido = false;
        int result = 0, result2 = 0, resto, i, resto2, m, dig, dig2;
        char c, c2, c3;
        for (i = 0; i <= 9; i++) {
            c = cpf.charAt(i);
            m = Character.getNumericValue(c);
            if (i < 9) {
                result = result + (m * (10 - i));
            }
            result2 = result2 + (m * (11 - i));
            // System.out.println(result + "  "+ result2);
        }
        resto = result % 11;
        resto2 = result2 % 11;
        //System.out.println(resto);
        resto = 11 - resto;
        resto2 = 11 - resto2;
        c2 = cpf.charAt(9);
        c3 = cpf.charAt(10);
        dig = Character.getNumericValue(c2);
        dig2 = Character.getNumericValue(c3);
        if (resto == dig && resto2 == dig2) {
            valido = true;
            // System.out.println("deu certo");
        }
        return valido;
    }

    public static void imprimeCpf(String c, int t) {
        int i;
        char cars;
        String cpfTodo = "", cpfAux = "", cpfAux2 = "", cpfAux3 = "", cpfAux4 = "";
        char[] vet = new char[t];
        for (i = 0; i < t; i++) {
            cars = c.charAt(i);
            vet[i] = cars;
            if (i >= 0 && i < 3) {
                cpfAux = cpfAux + vet[i];
            } else if (i >= 3 && i < 6) {
                cpfAux2 = cpfAux2 + vet[i];
            } else if (i >= 6 && i < 9) {
                cpfAux3 = cpfAux3 + vet[i];
            } else {
                cpfAux4 = cpfAux4 + vet[i];
            }
        }

        System.out.println("o cpf validado foi: " + cpfTodo.concat(cpfAux + "." + cpfAux2 + "." + cpfAux3 + "-" + cpfAux4));
    }

    public static boolean validaNum(String c) {
        int tam = c.length(), i;
        boolean valido = true;
        for (i = 0; i < tam; i++) {
            if (Character.isDigit(c.charAt(i)) == false) {
                valido = false;
                break;
            }
        }
        return valido;
    }
}
