/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracao;

/**
 *
 * @author Renat
 */
public class EnumMusicas {
        public enum musicas {

        LivingOnPrayer(1, "Linving on Prayer", "Bon Jovi"),
        One(2,"One", "Metallica"),
        TreTropper(4, "The Trooper", "Iron Maiden"),
        Jump(5, "Jump", "Van Halen"),
        DontSpotBeliven(6, "Don't Stop Believin", "Journey"),
        WithorWithoutYou (7, "With or Without You ", "U2"),
        IWantToBreakFree (8, "I Want To Break Free", "Queem"),
        HereIGoAgains(9, "Here I Go Agains ", "WhiteSnake"),
        WantedDeadorAlive(10," Wanted Dead or Alive", "Bon Jovi"),
        YouGiveLoveaBadName(11, "You Give Love a Bad Name", "Bon Jovi"),
        RadioPirata(12, "Radio Pirata", "RPM"),
        AindaECedo (13, "Ainda é Cedo", "Legião Urbana"),
        FaroesteCaboclo(14, "Faroeste Caboclo", "Legião Urbana"),
        CouldYouBeLoved(15, "Could You Be Loved", "Bob Marley"),
        ForeverYoung(16, "Forever Young", "Alphaville"),
        Heaven(17, "Heaven", "Brian Adams"),
        KarmaChameleon(18, "Karma Chameleon", "Culture Club"),
        BeteBalanco(19, "Bete Balanço", "Barão Vermelho"),
        TakeOnME(20, "Take On ME", "a-ha"),
        MoneyForNothing(21, "Money For Nothing", "Dire Straits"),
        TheFinalCountdonw(22, "The  Final Countdonw", "Europe"),
        TheNumberOfTheBeast(23, "The Number Of The Beast", "Iron Maiden"),
        MusicaUrbana(24, "Musica Urbana", "Capital Inicial"),
        Natasha(25, "Natasha", "Capital Inicial"),
        HuntingHighAndLow(26, "Hunting High And Low", "a-ha"),
        EveryBreathYouTake(27, "Every Breath You Take", "The Police"),
        WereNotGonnaTakeIT(28, "Were Not Gonna Take IT", "Twisted Sister"),
        HomemPrimata(30, "Homem Primata", "Titãs");
         
        
        
        private int codigo;
        private String titulo;
        private String artista;

        private musicas(int codigo, String titulo, String artista) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.artista = artista;
        }

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getArtista() {
            return artista;
        }

        public void setArtista(String artista) {
            this.artista = artista;
        }
        
        
    

    }
    
}
