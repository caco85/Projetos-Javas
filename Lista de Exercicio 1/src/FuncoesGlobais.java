
/**
 *
 * @author Renato Nunes
 */
//Procedimentos
public class FuncoesGlobais {

    public static void imprimirCaracteres(char c, int n) {
        int i;
        for (i = 1; i <= n; i = i + 1) {
            System.out.print(c);
        }
    }

    public static void imprimirArvore(int r) {
        int i;
        for (i = 1; i <= r; i = i + 1) {
            imprimirCaracteresDireita('*', i);
            System.out.println();
        }
    }

    public static void imprimirCaracteresDireita(char c, int n) {
        int i;
        for (i = 1; i <= n; i = i + 1) {
            if (n == 1) {
                System.out.print("    " + c);
            } else if (n == 2) {
                // System.out.print(" "+c);
            } else if (n == 3) {
                System.out.print(c);
            } else if (n == 4) {
                System.out.print(c);
            } else {
                System.out.print(c);
            }

        }
    }

    public static void imprimirSequencia(int x0, int x1) {
        for (int i = x0; i <= x1; i = i + 1) {
            System.out.print(i);
        }
    }

    public static void imprimirArvore2(int r) {
        int i;
        for (i = r; i >= 1; i = i - 1) {
            imprimirCaracteresDireita('*', i);
            System.out.println();
        }
    }

  

    //Funções ou Metodos--------------------------------------------------
     private static boolean primos(int numero) {
        for (int i = 2; i < numero / 2; i = i + 1) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static double quadrado(double x) {
        double result = x * x;
        return result;
    }

    public static double imc(double peso, double altura) {
        return peso / quadrado(altura);
    }

    public static int qtdDigitos(int n) {
        int result = 0;
        while (n != 0) {
            result = result + 1;
            n = n / 10;
        }
        return result;
    }

    public static int somaDivisores(int n) {
        int result = 1, i;
        for (i = 2; i < 10; i++) {
            if (n % i == 0) {
                result = result + i;
            }
        }
        return result;
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static double media(int a, int b) {
        return (double) (a + b) / 2;
    }

    public static double media3(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }

    public static int maior2(int a, int b) {
        if (a > b) {
            return a;

        }
        return b;
    }

    public static int maior3(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        return c;
    }
    public boolean amigos(int n1, int n2) {
        return n1 == somaDivisores(n2) && n2 == somaDivisores(n1);
    }

    public boolean nPerfeito(int n) {
        return n == somaDivisores(n);
    }

    public int fatorial(int n) {
        int i, result = 1;
        for (i = n; i > 1; i = i - 1) {
            result = result * i;
        }
        return result;
    }
    public static int maiorFatorPrimo(int n) {
        int i;
        for (i = n - 1; i > 1; i = i - 1) {
            if (n%i==0 && primos(i)) {
                return i;
            }
        }
        return -1;
    }
    public static int fibonacci(int n){
        int i, numAnterior = 0, num = 0;
        for (i = 1; i <= n; i = i + 1) {
            if (i == 1) {
                num = i;
                numAnterior = 0;
            } else {
                num = num + numAnterior;
                numAnterior = num - numAnterior;
            }
        }
        return num;
    }
    
       //Funçôes Recursivas --------------------------------
    public static int fatorialRecursiva(int n){
        if(n == 0){
            return 1;
        } 
        return n*fatorialRecursiva(n-1);
    }
    public static int fibonacciRecursiva(int n){
        if (n<2) {
            return n;
        }
        return fibonacciRecursiva(n-1)+fibonacciRecursiva(n-2);
    }
    public static double potenciaRecursiva(double base,int expoente){
        if (expoente == 0) {
            return 1;            
        }
        if (base==0) {
            return 0;
        }
        if (expoente <0) {
            return 1.0/potenciaRecursiva(base,-expoente);
            
        }
        return base*potenciaRecursiva(base, expoente-1);
    
    }
}
