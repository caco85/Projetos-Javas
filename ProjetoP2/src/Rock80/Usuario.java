/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rock80;

import java.util.Arrays;

/**
 *
 * @author Ademir JR
 */
public class Usuario {

    public static final int TAM_MAX_PLYLST = 200;
    private int codigo; // autoincremento
    private String nome;
    private String login;
    private String senha;
    private int qtdPlaylists;
    private Playlist[] playlists;
    private int qtdPlaylistsFav;
    private Playlist[] playlistsFav;

    public Usuario() {
        this.playlists = new Playlist[TAM_MAX_PLYLST];
        this.playlistsFav = new Playlist[TAM_MAX_PLYLST];
    }

    public Usuario(int codigo, String nome, String login, String senha, int qtdPlaylists, int qtdPlaylistsFav) {
        this.codigo = codigo;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.qtdPlaylists = qtdPlaylists;
        this.qtdPlaylistsFav = qtdPlaylistsFav;
        this.playlists = new Playlist[TAM_MAX_PLYLST];
        this.playlistsFav = new Playlist[TAM_MAX_PLYLST];
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getQtdPlaylists() {
        return qtdPlaylists;
    }

    public void setQtdPlaylists(int qtdPlaylists) {
        this.qtdPlaylists = qtdPlaylists;
    }

    public Playlist[] getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Playlist[] playlists) {
        this.playlists = playlists;
    }

    public int getQtdPlaylistsFav() {
        return qtdPlaylistsFav;
    }

    public void setQtdPlaylistsFav(int qtdPlaylistsFav) {
        this.qtdPlaylistsFav = qtdPlaylistsFav;
    }

    public Playlist[] getPlaylistsFav() {
        return playlistsFav;
    }

    public void setPlaylistsFav(Playlist[] playlistsFav) {
        this.playlistsFav = playlistsFav;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", nome=" + nome + ", login=" + login + ", qtdPlaylists=" + qtdPlaylists + ", playlists=" + Arrays.toString(playlists) + ", qtdPlaylistsFav=" + qtdPlaylistsFav + ", playlistsFav=" + Arrays.toString(playlistsFav) + '}';
    }

    public Usuario buscar(int codigo, Usuario[] usuarios) {
        Usuario usuario = null;
        int i;
        for (i = 0; i < usuarios.length; i = i + 1) {
            if (usuarios[i] != null && usuarios[i].getCodigo() == codigo) {
                usuario = usuarios[i];
                break;
            }
        }

        return usuario;
    }

    public Usuario buscarLogin(String login, Usuario[] usuarios) {
        int i;
        Usuario usuario = null;
        for (i = 0; i < usuarios.length; i = i + 1) {
            if (usuarios[i] != null && usuarios[i].getLogin().equalsIgnoreCase(login)) {
                usuario = usuarios[i];
                break;
            }
        }

        return usuario;
    }

    public Usuario buscarNome(String nome, Usuario[] usuarios) {
        int i;
        Usuario usuario = null;
        for (i = 0; i < usuarios.length; i = i + 1) {
            if (usuarios[i] != null && usuarios[i].getNome().equalsIgnoreCase(nome)) {
                usuario = usuarios[i];
                break;
            }
        }

        return usuario;
    }
    public void cadastrarPlayFav(Playlist [] playFav){
        int i ,autoIncrms= 1;
        for (i = 0; i < playFav.length; i++) {
            this.playlistsFav[autoIncrms] = playFav[i];
        }
    
    }

}
