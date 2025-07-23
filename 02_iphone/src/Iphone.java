public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    /* Listas internas para armazenar dados simulados */
    private java.util.List<String> contatos = new java.util.ArrayList<>();
    private java.util.List<String> musicas = new java.util.ArrayList<>();
    private java.util.List<String> paginas = new java.util.ArrayList<>();

    private String musicaAtual;

    /* --- Métodos utilitários para contatos --- */
    public void adicionarContato(String contato) {
        if (!contatos.contains(contato)) {
            contatos.add(contato);
            System.out.println("Contato adicionado: " + contato);
        }
    }

    public void listarContatos() {
        System.out.println("Lista de contatos:");
        contatos.forEach(c -> System.out.println("- " + c));
    }

    /* --- Métodos utilitários para músicas --- */
    public void adicionarMusicaBiblioteca(String musica) {
        if (!musicas.contains(musica)) {
            musicas.add(musica);
            System.out.println("Música adicionada à biblioteca: " + musica);
        }
    }

    public void listarMusicas() {
        System.out.println("Biblioteca de músicas:");
        musicas.forEach(m -> System.out.println("- " + m));
    }

    /* --- Métodos utilitários para páginas --- */
    public void adicionarPaginaFavorita(String url) {
        if (!paginas.contains(url)) {
            paginas.add(url);
            System.out.println("Página adicionada aos favoritos: " + url);
        }
    }

    public void listarPaginas() {
        System.out.println("Páginas favoritas:");
        paginas.forEach(p -> System.out.println("- " + p));
    }

    // ReprodutorMusical
    @Override
    public void tocar() {
        if (musicaAtual != null) {
            System.out.println("Tocando: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
        adicionarMusicaBiblioteca(musica);
    }

    // AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
        adicionarContato(numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
        adicionarPaginaFavorita(url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
} 