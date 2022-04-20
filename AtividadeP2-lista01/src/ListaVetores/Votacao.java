
package ListaVetores;

/**
 *
 * @author Renato Nunes
 */
public class Votacao {
    private  static String nome;
    public static int calcVotos(int []v){
     int i,result = 0;
        for (i = 0; i < v.length; i=i+1) {
            result = result+ v[i];
        }
     return result;   
    }

    public static void exibirVotos(int[] v ,int calc) {
        int i;
        double result ;
        for (i = 0; i < v.length; i= i+1) {
            result = v[i]*100/calc;
            System.out.println("A quatidade de votos em: " + nomeExt(i)+"="+v[i]);
            System.out.println("A Porcentagem de votos de: "+ nomeExt(i)+"="+result+"%" );
            System.out.println("");
        } 
    }
    public static String nomeExt( int i){
        
                    switch (i){
                        case 0:
                            nome = "Branco"; 
                            break;
                        case 1:
                            nome = "João";
                            break;    
                        case 2:
                           nome = "Maria"; 
                            break;
                        case 3:
                           nome = "Pedro"; 
                            break;   
                        case 4:
                            nome = "Luís"; 
                            break;    

                        case 5:
                            nome = "Nulos";
                            break;    
                    }
        return nome;
    }
}
