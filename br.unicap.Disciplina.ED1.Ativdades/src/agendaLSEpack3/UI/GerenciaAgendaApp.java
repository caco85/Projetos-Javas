package agendaLSEpack3.UI;

import agendaLSEpack1.dados.Agenda;
import agendaLSEpack1.dados.LDEDecrescenteComRepetidos;
import agendaLSEpack2.model.Contato;
import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class GerenciaAgendaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcMenu,cont = 0;
        String nome;
         System.out.println("Digite  o obj para remoção:  ");
        nome = scanner.nextLine();
        Agenda agenda = new Agenda();
        Contato c = new Contato(nome);
        LDEDecrescenteComRepetidos teste = new LDEDecrescenteComRepetidos();
        cont = teste.removerContador(c);
        System.out.println("teste" +cont);
        do {
            Menu();
            opcMenu = scanner.nextInt();
            switch(opcMenu){
                case 1:agenda.cadastar();break;
                case 2:agenda.remover();           
                break;                
                case 3: agenda.exibir();break;
                case 4: agenda.exibirUm();break;
                case 5: agenda.alterar();break;
                case 6: agenda.copiaAgenda();break;
                case 0: agenda.sair();break;
                default:System.err.println("Voce digitou algo errado! ");;
            
            }
            
        } while (opcMenu != 0);      
    }
    public static void Menu(){
        System.out.println("1 – Inserir novo contato na agenda: ");
        System.out.println("2 – Remover um contato na agenda: ");
        System.out.println("3 – Listar todos os contatos da agenda: ");
        System.out.println("4 – Exibir apenas um contato da agenda:  ");
        System.out.println("5 – Alterar um contato da agenda: ");
        System.out.println("6 – copia todos os contatos da agenda: ");
        System.out.println("0 – Sair do programa ");
    }
}
