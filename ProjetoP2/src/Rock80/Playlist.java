package Rock80;

import java.util.Arrays;

/**
 *
 * @author Ademir JR
 */
public class Playlist {

    public static final int TAM_MAX_MUSICAS = 100;
    private int codigo; // autoincremento
    private Usuario usuario;
    private String titulo;
    private int qtdMusicas;
    private Musica[] musicas;

    public Playlist() {
        this.musicas = new Musica[TAM_MAX_MUSICAS];
    }

    public Playlist(int codigo, Usuario usuario, String titulo, int qtdMusicas) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.titulo = titulo;
        this.qtdMusicas = qtdMusicas;
        this.musicas = new Musica[TAM_MAX_MUSICAS];
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdMusicas() {
        return qtdMusicas;
    }

    public void setQtdMusicas(int qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
    }

    public Musica[] getMusicas() {
        return musicas;
    }

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return "Playlist{" + "codigo=" + codigo + ", usuario=" + usuario + ", titulo=" + titulo + ", qtdMusicas=" + qtdMusicas + ", musicas=" + Arrays.toString(musicas) + '}';
    }
    
    public Playlist buscarPlay(int codigo, Playlist[] pList) {
        Playlist playList = null;
        int i;
        for (i = 0; i < pList.length; i = i + 1) {
            if (pList[i] != null && pList[i].getCodigo() == codigo) {
                playList = pList[i];
                break;
            }
        }

        return playList;
    }
        public  Playlist buscarPlayTitulo(String titulo, Playlist[] pList) {
        Playlist playList = null;
        int i;
        for (i = 0; i < pList.length; i = i + 1) {
            if (pList[i] != null && pList[i].getTitulo().equalsIgnoreCase(titulo)) {
                playList = pList[i];
                break;
            }
        }

        return playList;
    }

    public Musica [] cadastrarMusicaAuto() {
        int autoIncrs = 1, codigo;
        Musica musica, musica2, musica3, musica4, musica5, musica6, musica7, musica8, musica9, musica10;
        musica = new Musica();

        codigo = autoIncrs ;
        musica.setCodigo(codigo);
        musica.setTitulo("Faroeste Caboclo");
        musica.setArtista("Legião Urbana");
        musicas[0] = musica;
        autoIncrs = autoIncrs + 1;

        musica2 = new Musica();
        codigo = autoIncrs ;
        musica2.setCodigo(codigo);
        musica2.setTitulo("Radio Pirata");
        musica2.setArtista("RPM");
        musicas[1] = musica2;
        autoIncrs = autoIncrs + 1;
        
        musica3 = new Musica();
        codigo = autoIncrs;
        musica3.setCodigo(codigo);
        musica3.setTitulo("Here I Go Agains");
        musica3.setArtista("Whitesnake");
        musicas[2] = musica3;
        autoIncrs = autoIncrs + 1;

        musica4 = new Musica();
        codigo = autoIncrs ;
        musica4.setCodigo(codigo);
        musica4.setTitulo("I Want To Break Free");
        musica4.setArtista("Queem");
        musicas[3] = musica4;
        autoIncrs = autoIncrs + 1;
        
        musica5 = new Musica();
        codigo = autoIncrs;
        musica5.setCodigo(codigo);
        musica5.setTitulo("With or Without You ");
        musica5.setArtista("U2");
        musicas[4] = musica5;
        autoIncrs = autoIncrs + 1;
        
        musica6 = new Musica();
        codigo = autoIncrs;
        musica6.setCodigo(codigo);
        musica6.setTitulo("Don't Stop Believin");
        musica6.setArtista("Journey");
        musicas[5] = musica6;
        autoIncrs = autoIncrs + 1;

        musica7 = new Musica();
        codigo = autoIncrs ;
        musica7.setCodigo(codigo);
        musica7.setTitulo("Lick it Up");
        musica7.setArtista("Kiss");
        musicas[6] = musica7;
        autoIncrs = autoIncrs + 1;

        musica8 = new Musica();
        codigo = autoIncrs ;
        musica8.setCodigo(codigo);
        musica8.setTitulo("Jump");
        musica8.setArtista("Van Halen");
        musicas[7] = musica8;
        autoIncrs = autoIncrs + 1;
        
        musica9 = new Musica();
        codigo = autoIncrs ;
        musica9.setCodigo(codigo);
        musica9.setTitulo("The Trooper");
        musica9.setArtista("Iron Maiden");
        musicas[8] = musica9;
        autoIncrs = autoIncrs + 1;
        
        musica10 = new Musica();
        codigo = autoIncrs ;
        musica10.setCodigo(codigo);
        musica10.setTitulo("Linving on Prayer");
        musica10.setArtista("Bom Jovi");
        musicas[9] = musica10;
        autoIncrs = autoIncrs + 1;
        
        return musicas;
    }
}
