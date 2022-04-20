package Rock80;

/**
 *
 * @author Ademir JR
 */
public class Musica implements Comparable<Musica>{

    private int codigo;
    private String titulo;
    private String artista;

    public Musica() {

    }

    public Musica(int codigo, String titulo, String artista) {
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

    @Override
    public String toString() {
        return "Musica{" + "codigo=" + codigo + ", titulo=" + titulo + ", artista=" + artista + '}';
    }
    
     @Override
    public int compareTo(Musica m) {    
         return this.codigo = m.getCodigo();
    }

    public Musica buscarMusica(int codigo, Musica[] musicas) {
        Musica musica = null;
        int i;
        for (i = 0; i < musicas.length; i = i + 1) {
            if (musicas[i] != null && musicas[i].getCodigo() == codigo) {
                musica = musicas[i];
                break;
            }
        }

        return musica;
    }

    public Musica buscarTitulo(String titulo, Musica[] musicas) {
        Musica musica = null;
        int i;
        for (i = 0; i < musicas.length; i = i + 1) {
            if (musicas[i] != null && musicas[i].getTitulo().equalsIgnoreCase(titulo)) {
                musica = musicas[i];
                break;
            }
        }

        return musica;
    }

    public Musica buscarArtista(String artista, Musica[] musicas) {
        Musica musica = null;
        int i;
        for (i = 0; i < musicas.length; i = i + 1) {
            if (musicas[i] != null && musicas[i].getTitulo().equalsIgnoreCase(artista)) {
                musica = musicas[i];
                break;
            }
        }

        return musica;
    }

 
}
