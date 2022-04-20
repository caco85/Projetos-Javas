package VetorObjetos;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class AppVetorPessoa {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        final int t= 2;
        Pessoa[] pessoas = new Pessoa[t];
        Pessoa p;
        int i;
        double altura,peso;
        char sexo;
        for ( i = 0; i < pessoas.length; i=i+1) {
            p = new Pessoa();
            System.out.println("Informe o Nome: ");
            p.setNome(scanner.nextLine());
            System.out.println("Informe a Idade de:"  );
            p.setIdade(scanner.nextInt());scanner.nextLine();
            System.out.println("Informe o sexo: M ou F ");
            sexo = scanner.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
            while (sexo !='M' && sexo != 'F' ) {                
                System.out.println("VC digitou errado ,Informe o sexo: M ou F ");
                sexo = scanner.next().charAt(0);
                sexo = Character.toUpperCase(sexo);
            }
            p.setSexo(sexo);
            System.out.println("Informe o Peso: ");
            peso =  scanner.nextDouble();scanner.nextLine();
            p.setPeso(peso);
            System.out.println("Informe a Altura: ");
            altura = scanner.nextDouble();scanner.nextLine();
            p.setAltura(altura);
            
            p.setPesoIdeal(Pessoa.CalcPeso(altura,sexo));
            pessoas[i]=p;
            System.out.println("");
        }
        
        Pessoa.exibirPessoa(pessoas);
        
    }
    
}
