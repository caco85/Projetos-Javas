package Rock80;

import java.util.Scanner;

/**
 *
 * @author Ademir JR
 */
public class Aplicacao {

    public static Scanner entrada = new Scanner(System.in);
    private static Usuario[] usuarios = new Usuario[100];
    private static Musica[] musicas = new Musica[100];
    private static Playlist playList;
    private static Playlist[] playListArray = new Playlist[100];

    public static void main(String[] args) {
        int codigo, autoIncrs = 0, escolhaMenu;
        String login, senha, nome;
        Usuario users;
        cadastrarAuto();
        do {
            System.out.println("Digite a opção desejada 1 para Administrador ou 2 para Usuario");
            escolhaMenu = entrada.nextInt();
            entrada.nextLine();
            switch (escolhaMenu) {
                case 1:
                    areaAdm();
                    break;
                case 2:
                    areaUsuario();
                    break;
                case 3:
                    System.out.println("Sair!");
                    break;
                default:
                    System.out.println("Você Digitou algo errado! ");

            }
        } while (escolhaMenu != 0);

    }

    public static void areaAdm() {
        Usuario usuario;
        String login, senha, nome, confSenha, titulo, artista;
        int i, opcSub, opcPesquisa, codigo, autoIncrs = 0;
        Usuario usersPesuisa;
        usuario = new Usuario();
        Musica musicaPesquisa;
        Playlist playlistPesquisa;

        System.out.println("Digite seu Login");
        login = entrada.nextLine();
        System.out.println("Digite sua Senha");
        senha = entrada.nextLine();
        usuario = usuario.buscarLogin(login, usuarios);

        while (!login.equalsIgnoreCase(usuario.getLogin()) && senha.equalsIgnoreCase(usuario.getSenha()) && !usuario.getNome().equalsIgnoreCase("Administrador")) {
            System.out.println("Login ou Senha invalido");
            System.out.println("Digite seu Login");
            login = entrada.nextLine();
            System.out.println("Digite sua Senha");
            senha = entrada.nextLine();
            usuario = usuario.buscarLogin(login, usuarios);
        }
        System.out.println("Logado com sucesso!");
        System.out.println("");
        do {
            menuAdm();
            System.out.println("Bem vindo " + usuario.getNome() + " Digite a opção desejada! ");
            opcSub = entrada.nextInt();
            switch (opcSub) {
                case 1:
                    System.out.println("Lista de todos os usuarios: ");
                    for (i = 0; i < usuarios.length; i = i + 1) {
                        if (usuarios[i] != null) {
                            System.out.println("Todas as Musicas! " + usuarios[i]);
                        } else {
                            return;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Digite apção para pesquisar: 1- codigo ,2 - login ou 3- Nome");
                    opcPesquisa = entrada.nextInt();

                    if (opcPesquisa == 1) {
                        System.out.println("Digite o codigo do usuario");
                        codigo = entrada.nextInt();
                        usersPesuisa = usuario.buscar(codigo, usuarios);
                        if (usersPesuisa != null) {
                            System.out.println("O usuario encontrado foi: " + usersPesuisa);
                        } else {
                            System.out.println("Usuario não localizado");
                        }
                    } else if (opcPesquisa == 2) {
                        System.out.println("Digite o Login do usuario");
                        login = entrada.nextLine();
                        usersPesuisa = usuario.buscarLogin(login, usuarios);
                        if (usersPesuisa != null) {
                            System.out.println("O usuario encontrado foi: " + usersPesuisa);
                        } else {
                            System.out.println("Usuario não localizado");
                        }
                    } else if (opcPesquisa == 3) {
                        System.out.println("Digite o nome do usuario");
                        nome = entrada.nextLine();
                        usersPesuisa = usuario.buscarLogin(nome, usuarios);
                        if (usersPesuisa != null) {
                            System.out.println("O usuario encontrado foi: " + usersPesuisa);
                        } else {
                            System.out.println("Usuario não localizado");
                        }
                    } else {
                        System.out.println("VocÊ escolheu uma opção invalida");
                    }
                    break;
                case 3:
                    System.out.println("Digite o Codigo do usuario que deseja alterar a senha");
                    codigo = entrada.nextInt();
                    usersPesuisa = usuario.buscar(codigo, usuarios);
                    if (usersPesuisa != null) {
                        System.out.println("O usuario encontrado foi: " + usersPesuisa.getNome());
                        System.out.println("Digite a nova senha");
                        senha = entrada.nextLine();
                        System.out.println("Confirmea  nova senha");
                        confSenha = entrada.nextLine();
                        while (!senha.equalsIgnoreCase(confSenha)) {
                            System.out.println("Atenção devem ser iguais ! \n Digite a nova senha");
                            senha = entrada.nextLine();
                            System.out.println("Confirmea  nova senha");
                            confSenha = entrada.nextLine();
                        }
                        usersPesuisa.setSenha(senha);
                        for (int j = 0; j < usuarios.length; j = j + 1) {
                            if (usuarios[j] != null && usersPesuisa.getCodigo() == usuarios[j].getCodigo()) {
                                usuarios[j] = usersPesuisa;
                                break;
                            }
                        }
                    } else {
                        System.out.println("Usuario não localizado");
                    }
                    break;
                case 4:
                    Musica mus = new Musica();
                    autoIncrs = 0;
                    for (i = 0; i < musicas.length; i = i + 1) {
                        if (musicas[i] != null) {
                            autoIncrs = autoIncrs + 1;
                        }
                    }
                    mus.setCodigo(autoIncrs);
                    System.out.println("Digete o nome da musica");
                    titulo = entrada.nextLine();
                    mus.setTitulo(titulo);
                    System.out.println("Digete o nome da artista");
                    artista = entrada.nextLine();
                    mus.setArtista(artista);
                    musicas[autoIncrs] = mus;
                    break;
                case 5:
                    System.out.println("Lista de todas as Musicas: ");
                    for (i = 0; i < musicas.length; i = i + 1) {
                        if (musicas[i] != null) {
                            System.out.println(musicas[i]);
                        }
                    }
                    break;
                case 6:
                    mus = new Musica();
                    System.out.println("Digite apção para pesquisar: 1- codigo ,2 - Titulo ou 3- Artista");
                    opcPesquisa = entrada.nextInt();

                    if (opcPesquisa == 1) {
                        System.out.println("Digite o codigo da  musica");
                        codigo = entrada.nextInt();
                        musicaPesquisa = mus.buscarMusica(codigo, musicas);
                        if (musicaPesquisa != null) {
                            System.out.println("O A musica encontrado foi: " + musicaPesquisa);
                        } else {
                            System.out.println("Musica não localizado");
                        }
                    } else if (opcPesquisa == 2) {
                        System.out.println("Digite o nome da Musica");
                        titulo = entrada.nextLine();
                        musicaPesquisa = mus.buscarTitulo(titulo, musicas);
                        if (musicaPesquisa != null) {
                            System.out.println("a Musica encontrado foi: " + musicaPesquisa);
                        } else {
                            System.out.println("Musica não localizado");
                        }
                    } else if (opcPesquisa == 3) {
                        System.out.println("Digite o nome do usuario");
                        nome = entrada.nextLine();
                        musicaPesquisa = mus.buscarArtista(nome, musicas);
                        if (musicaPesquisa != null) {
                            System.out.println("A musica encontrado foi: " + musicaPesquisa);
                        } else {
                            System.out.println("Musica não localizado");
                        }
                    } else {
                        System.out.println("VocÊ escolheu uma opção invalida");
                    }
                    break;
                case 7:
                    mus = new Musica();
                    System.out.println("Digite o codigo da  musica");
                    codigo = entrada.nextInt();
                    musicaPesquisa = mus.buscarMusica(codigo, musicas);
                    if (musicaPesquisa != null) {
                        System.out.println("Digite o novo nome da musica");
                        titulo = entrada.nextLine();
                        musicaPesquisa.setTitulo(titulo);
                    } else {
                        System.out.println("Musica não localizado");
                    }
                    break;
                case 8:
                    playList = new Playlist();
                    System.out.println("Digite o codigo da  musica");
                    codigo = entrada.nextInt();
                    playlistPesquisa = playList.buscarPlay(codigo, playListArray);
                    if (playlistPesquisa != null) {
                        for (i = 0; i < playListArray.length; i++) {
                            System.out.println("Segue PlayLista" + playlistPesquisa.getCodigo()
                                    + playlistPesquisa.getUsuario() + playlistPesquisa.getTitulo());
                            for (int j = 0; j < musicas.length; j = j + 1) {
                                System.out.println(musicas[j]);
                            }
                        }
                    } else {
                        System.out.println("Musica não localizado");
                    }
                    break;
                case 9:
                    for (i = 0; i < playListArray.length; i = i + 1) {
                        if (playListArray[i] != null) {
                            System.out.println("Todas as Musicas! " + playListArray[i]);
                        } else {
                            return;
                        }
                    }
                    break;
                case 10:
                    System.out.println("Digite o titulo da play list");
                    titulo = entrada.nextLine();
                    playlistPesquisa = playList.buscarPlayTitulo(titulo, playListArray);
                    if (playlistPesquisa != null) {
                        System.out.println(playlistPesquisa.getTitulo());
                    } else {
                        System.out.println("Não foi localizada a Play list");
                    }
                    break;
                case 0:
                    System.out.println("Você escolheu a opção voltar pro menu!");
                    break;
                default:
                    System.out.println("D");

            }
        } while (opcSub != 0);

    }

    public static void areaUsuario() {
        Usuario usuario;
        String login, senha, nome, confSenha, titulo, artista;
        int i, opcSub, opcPesquisa, codigo, autoIncrs = 0;
        Usuario usersPesuisa;
        usuario = new Usuario();
        Musica musicaPesquisa;
        Playlist playlistPesquisa;

        System.out.println("Bem vindo a Area do Usuario:Digite 1-Para efetuar o Login 2-Cadastar");
        opcSub = entrada.nextInt();
        entrada.nextLine();
        if (opcSub == 1) {
            System.out.println("Digite seu Login");
            login = entrada.nextLine();
            System.out.println("Digite sua Senha");
            senha = entrada.nextLine();
            usuario = usuario.buscarLogin(login, usuarios);

            while (!login.equalsIgnoreCase(usuario.getLogin()) && senha.equalsIgnoreCase(usuario.getSenha())) {
                System.out.println("Login ou Senha invalido");
                System.out.println("Digite seu Login");
                login = entrada.nextLine();
                System.out.println("Digite sua Senha");
                senha = entrada.nextLine();
                usuario = usuario.buscarLogin(login, usuarios);
            }
            System.out.println("Bem vindo!" + usuario.getNome());
            System.out.println("");
            do {
                opcSub = 0;
                menuUsuario();
                System.out.println("Digite a opção desejada");
                opcSub = entrada.nextInt();
                switch (opcSub) {
                    case 1:
                        System.out.println("Dados:" + usuario);
                        break;
                    case 2:
                        System.out.println("Digite o novo nome");
                        nome = entrada.nextLine();

                        System.out.println("Confirmea sua senha");
                        confSenha = entrada.nextLine();
                        while (!usuario.getSenha().equalsIgnoreCase(confSenha)) {
                            System.out.println("Atenção devem ser iguais !");
                            System.out.println("Confirmea  nova senha");
                            confSenha = entrada.nextLine();
                        }
                        usuario.setNome(nome);
                        for (int j = 0; j < usuarios.length; j = j + 1) {
                            if (usuarios[j] != null && usuario.getCodigo() == usuarios[j].getCodigo()) {
                                usuarios[j] = usuario;
                                break;
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Digite o novo login");
                        login = entrada.nextLine();

                        System.out.println("Confirmea sua senha");
                        confSenha = entrada.nextLine();
                        while (!usuario.getSenha().equalsIgnoreCase(confSenha)) {
                            System.out.println("Atenção devem ser iguais !");
                            System.out.println("Confirmea  nova senha");
                            confSenha = entrada.nextLine();
                        }
                        usuario.setLogin(login);
                        for (int j = 0; j < usuarios.length; j = j + 1) {
                            if (usuarios[j] != null && usuario.getCodigo() == usuarios[j].getCodigo()) {
                                usuarios[j] = usuario;
                                break;
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Digite sua nova senha");
                        senha = entrada.nextLine();

                        System.out.println("Confirmea sua antiga senha");
                        confSenha = entrada.nextLine();
                        while (!usuario.getSenha().equalsIgnoreCase(confSenha)) {
                            System.out.println("Atenção devem ser iguais !");
                            System.out.println("Confirmea  nova senha");
                            confSenha = entrada.nextLine();
                        }
                        usuario.setSenha(senha);
                        for (int j = 0; j < usuarios.length; j = j + 1) {
                            if (usuarios[j] != null && usuario.getCodigo() == usuarios[j].getCodigo()) {
                                usuarios[j] = usuario;
                                break;
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Lista de usuarios");
                        for (int j = 0; j < usuarios.length; j = j + 1) {
                            if (usuarios[j] != null) {
                                System.out.println("Nome:" + usuarios[j].getNome());
                                break;
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Digite o nome do usuario");
                        nome = entrada.nextLine();
                        usersPesuisa = usuario.buscarLogin(nome, usuarios);
                        if (usersPesuisa != null) {
                            System.out.println("O usuario encontrado foi: " + usersPesuisa.getNome());
                        } else {
                            System.out.println("Usuario não localizado");
                        }
                        break;
                    case 7:
                        System.out.println("Lista de todas as Musicas: ");
                        for (i = 0; i < musicas.length; i = i + 1) {
                            if (musicas[i] != null) {
                                System.out.println(musicas[i]);
                            }
                        }
                        break;
                    case 8:
                        Musica mus = new Musica();
                        System.out.println("Digite apção para pesquisar: 1- codigo ,2 - Titulo ou 3- Artista");
                        opcPesquisa = entrada.nextInt();

                        if (opcPesquisa == 1) {
                            System.out.println("Digite o codigo da  musica");
                            codigo = entrada.nextInt();
                            musicaPesquisa = mus.buscarMusica(codigo, musicas);
                            if (musicaPesquisa != null) {
                                System.out.println("O A musica encontrado foi: " + musicaPesquisa);
                            } else {
                                System.out.println("Musica não localizado");
                            }
                        } else if (opcPesquisa == 2) {
                            System.out.println("Digite o nome da Musica");
                            titulo = entrada.nextLine();
                            musicaPesquisa = mus.buscarTitulo(titulo, musicas);
                            if (musicaPesquisa != null) {
                                System.out.println("a Musica encontrado foi: " + musicaPesquisa);
                            } else {
                                System.out.println("Musica não localizado");
                            }
                        } else if (opcPesquisa == 3) {
                            System.out.println("Digite o nome do usuario");
                            nome = entrada.nextLine();
                            musicaPesquisa = mus.buscarArtista(nome, musicas);
                            if (musicaPesquisa != null) {
                                System.out.println("A musica encontrado foi: " + musicaPesquisa);
                            } else {
                                System.out.println("Musica não localizado");
                            }
                        } else {
                            System.out.println("VocÊ escolheu uma opção invalida");
                        }
                        break;
                    case 9:
                        System.out.println("Play List ---");
                        for (i = 0; i < playListArray.length; i++) {
                            System.out.println("Segue PlayLista" + playListArray[i].getCodigo()
                                    + playListArray[i].getUsuario() + playListArray[i].getTitulo());
                            for (int j = 0; j < musicas.length; j = j + 1) {
                                System.out.println(musicas[j]);
                            }
                        }
                        break;
                    case 10:
                        System.out.println("Play List ---");
                        for (i = 0; i < playListArray.length; i++) {
                            if (!playListArray[i].getUsuario().getNome().equalsIgnoreCase(usuario.getNome())) {
                                System.out.println("Segue PlayLista" + playListArray[i].getCodigo()
                                        + playListArray[i].getUsuario() + playListArray[i].getTitulo());
                                for (int j = 0; j < musicas.length; j = j + 1) {
                                    System.out.println(musicas[j]);
                                }
                            }

                        }
                        break;
                    case 11:
                        System.out.println("Digite o titulo da play list");
                        titulo = entrada.nextLine();
                        playlistPesquisa = playList.buscarPlayTitulo(titulo, playListArray);
                        if (playlistPesquisa != null) {
                            System.out.println(playlistPesquisa.getTitulo());
                        } else {
                            System.out.println("Não foi localizada a Play list");
                        }
                        break;
                    case 12:
                        int resp;
                        playList = new Playlist();
                        System.out.println("Digite o titutlo da playList");
                        titulo = entrada.nextLine();
                        playList.setTitulo(titulo);
                        for (int j = 0; j < musicas.length; j = j + 1) {
                            System.out.println(musicas[j]);
                            System.out.println("Deseja Cadatra musica? 1 para sim 2 para não");
                            resp = entrada.nextInt();
                            if (resp == 1) {
                                playList.setMusicas(musicas);
                            }
                        }
                        break;
                    case 13:
                        System.out.println("Digite o codigo da play list");
                        codigo = entrada.nextInt();
                        playlistPesquisa = playList.buscarPlay(codigo, playListArray);
                        if (playlistPesquisa != null) {
                            for (int j = 0; j < musicas.length; j = j + 1) {
                                System.out.println(musicas[j]);
                                System.out.println("Deseja excluir musica?digite o codigo dela");
                                codigo = entrada.nextInt();
                                if (musicas[j].getCodigo() == codigo) {
                                    musicas[j] = null;
                                }
                            }
                            for (i = 0; i < playListArray.length; i++) {
                                if (playListArray[i].getCodigo() == playlistPesquisa.getCodigo()) {
                                    playListArray[i] = playlistPesquisa;
                                }
                            }
                        } else {
                            System.out.println("Play List não foi encontrada");
                        }

                        break;
                    case 14:
                        System.out.println("Digite o codigo da play list");
                        codigo = entrada.nextInt();
                        playlistPesquisa = playList.buscarPlay(codigo, playListArray);
                        if (playlistPesquisa != null) {
                            for (int j = 0; j < musicas.length; j = j + 1) {
                                System.out.println(musicas[j]);
                                System.out.println("Deseja Cadatra musica? 1 para sim 2 para não");
                                resp = entrada.nextInt();
                                if (resp == 1) {
                                    playlistPesquisa.setMusicas(musicas);
                                }
                            }
                            for (i = 0; i < playListArray.length; i++) {
                                if (playListArray[i].getCodigo() == playlistPesquisa.getCodigo()) {
                                    playListArray[i] = playlistPesquisa;
                                }
                            }
                            System.out.println("Deseja excluir play list? 1 para sim 2 para não");
                            resp = entrada.nextInt();
                            if (resp == 1) {
                                for (i = 0; i < playListArray.length; i++) {
                                    if (playListArray[i].getCodigo() == playlistPesquisa.getCodigo()) {
                                        playListArray[i] = null;
                                    }
                                }
                            }
                        } else {
                            System.out.println("Play List não foi encontrada");
                        }

                        break;
                    case 15:
                        System.out.println("Digite o codigo da play list");
                        codigo = entrada.nextInt();
                        playlistPesquisa = playList.buscarPlay(codigo, playListArray);
                        if (playlistPesquisa != null) {
                            System.out.println(playlistPesquisa.getCodigo() + playlistPesquisa.getTitulo());
                            System.out.println("Musicas das Play List");
                            for (int j = 0; j < musicas.length; j = j + 1) {
                                if (musicas[j] != null) {
                                    System.out.println(musicas[j]);
                                }
                            }

                        } else {
                            System.out.println("Não foi localizada a Play list");
                        }
                        break;
                    case 16:
                        System.out.println("Digite o codigo da play list");
                        codigo = entrada.nextInt();
                        playlistPesquisa = playList.buscarPlay(codigo, playListArray);
                        if (playlistPesquisa != null) {
                            if (playlistPesquisa.getUsuario().getNome() != usuario.getNome()) {
                                usuario.setPlaylistsFav(playListArray);
                            }                          

                        } else {
                            System.out.println("Não foi localizada a Play list");
                        }
                        break;
                    case 0:
                        System.out.println("");
                        break;
                    default:
                        System.out.println("Voce digitou algo errado!");

                }

            } while (opcSub != 0);

        } else if (opcSub == 2) {
            System.out.println("Bem vindo a area de Cadastro");
            System.out.println("Digite o nome");
            nome = entrada.nextLine();
            usuario.setNome(nome);
            System.out.println("Digite o Login");
            login = entrada.nextLine();
            usuario.setNome(login);
            System.out.println("Digite a senha");
            senha = entrada.nextLine();
            System.out.println("Digite a confirmação de senha");
            confSenha = entrada.nextLine();
            while (!senha.equalsIgnoreCase(confSenha)) {
                System.out.println("Atenção devem ser iguais ! \n Digite a nova senha");
                senha = entrada.nextLine();
                System.out.println("Confirmea  nova senha");
                confSenha = entrada.nextLine();
            }
            usuario.setSenha(senha);
            autoIncrs = 0;
            for (int j = 0; j < usuarios.length; j = j + 1) {
                if (usuarios[j] != null) {
                    autoIncrs = autoIncrs + 1;
                }
            }
            usuarios[autoIncrs] = usuario;
        } else {
            System.out.println("Voce Digitou algo errado!");
        }

    }

    public static void menuAdm() {

        System.out.println("1 - Lista todos os Usuarios: ");
        System.out.println("2 - Buscar por codigo,login ou nome: ");
        System.out.println("3 - Alterar senha de um usuario");
        System.out.println("4- Cadastrar nova musica");
        System.out.println("5- Listar Todas as Musicas");
        System.out.println("6- Buscar musica por codigo,titulo, artista");
        System.out.println("7- Alterar musica");
        System.out.println("8- Excluir musica");
        System.out.println("9-  Listar todas as Playlistas");
        System.out.println("10- Consultar Playlista pelo codigo,nome ou titulo");
        System.out.println("0- voltar pra o menu principal");
    }

    public static void menuUsuario() {
        System.out.println("1- Listar dados do usuario");
        System.out.println("2- Alterar Nome");
        System.out.println("3- Alterar Login");
        System.out.println("4- Alterar Senha");
        System.out.println("5- Listar  Nomes dos Usuarios");
        System.out.println("6- Buscar usuario por Nome");
        System.out.println("7- Listar todas musicas");
        System.out.println("8- Buscar musica por codigo, titulo ou artista");
        System.out.println("9- Listar Suas PlayList");
        System.out.println("10- Listar todas as playlist dos demais usuarios");
        System.out.println("11- Listar playlist por codigo,titulo ou musica");
        System.out.println("12- Cadastrar PlayList");
        System.out.println("13- Adicionar musica a playlist ");
        System.out.println("14- Excluir musida de sua playlist");
        System.out.println("15- Excluir sua playlist");
        System.out.println("16- Favoritar sua playList");
        System.err.println("0- voltar para o menu! ");
    }

    private static void cadastrarAuto() {
        int codigo, i, autoIncrs = 1;
        String login, senha, nome;
        Usuario users, users2, users3, users4;
        playList = new Playlist();

        musicas = playList.cadastrarMusicaAuto();

        codigo = autoIncrs;
        users = new Usuario();
        users.setCodigo(codigo);
        login = "Admin";
        users.setLogin(login);
        nome = "Administrador";
        users.setNome(nome);
        senha = "m@st3r2016";
        users.setSenha(senha);
        usuarios[0] = users;
        autoIncrs = autoIncrs + 1;

        playList.setCodigo(autoIncrs);
        playList.setMusicas(musicas);
        playList.setTitulo("Padrão");
        playList.setUsuario(usuarios[0]);
        playList.setQtdMusicas(contarMusicas(musicas));

        playListArray[0] = playList;

        //System.out.println(autoIncrs);
        codigo = autoIncrs;
        users2 = new Usuario();
        users2.setCodigo(codigo);
        login = "Ademir";
        users2.setLogin(login);
        nome = "Ademir JR";
        users2.setNome(nome);
        senha = "123456";
        users2.setSenha(senha);
        usuarios[1] = users2;

        codigo = autoIncrs;
        users3 = new Usuario();
        users3.setCodigo(codigo);
        login = "Paul";
        users3.setLogin(login);
        nome = "Paul Simons ";
        users3.setNome(nome);
        senha = "147258";
        users3.setSenha(senha);
        usuarios[2] = users3;

        codigo = autoIncrs;
        users4 = new Usuario();
        users4.setCodigo(codigo);
        login = "Jhon";
        users4.setLogin(login);
        nome = "Jhon Bon Jovi";
        users4.setNome(nome);
        senha = "963852";
        users4.setSenha(senha);
        usuarios[3] = users4;

//        for (i = 0; i < 4; i++) {;
//            System.out.println(usuarios[i]);
//
//            System.out.println(musicas[i]);
//
//        }
//        System.out.println(playList);
    }

    private static int contarMusicas(Musica[] mus) {
        int qtd = 0;
        for (int i = 0; i < mus.length; i = i + 1) {
            if (mus[i] != null) {
                qtd = qtd + 1;
            } else {
                break;
            }
        }
        return qtd;
    }
}
