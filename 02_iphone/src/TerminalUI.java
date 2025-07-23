import java.util.Scanner;

public class TerminalUI {

    private Iphone iphone;

    public TerminalUI(Iphone iphone) {
        this.iphone = iphone;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            printPhoneFrame();
            System.out.print("\nEscolha uma opção: ");
            String opcao = sc.nextLine();
            switch (opcao) {
                case "1":
                    menuTelefone(sc);
                    break;
                case "2":
                    menuMusica(sc);
                    break;
                case "3":
                    menuInternet(sc);
                    break;
                case "0":
                    System.out.println("Saindo... Até logo!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    /* ---------------------- MENUS ---------------------- */

    private void menuTelefone(Scanner sc) {
        while (true) {
            System.out.println("\n--- Aplicativo Telefone ---");
            System.out.println("1) Ligar");
            System.out.println("2) Atender");
            System.out.println("3) Correio de Voz");
            System.out.println("4) Ver contatos");
            System.out.println("0) Voltar");
            System.out.print("Opção: ");
            String op = sc.nextLine();
            switch (op) {
                case "1":
                    System.out.print("Número para ligar: ");
                    String numero = sc.nextLine();
                    iphone.ligar(numero);
                    break;
                case "2":
                    iphone.atender();
                    break;
                case "3":
                    iphone.iniciarCorreioVoz();
                    break;
                case "4":
                    iphone.listarContatos();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void menuMusica(Scanner sc) {
        while (true) {
            System.out.println("\n--- Reprodutor de Música ---");
            System.out.println("1) Selecionar música");
            System.out.println("2) Tocar");
            System.out.println("3) Pausar");
            System.out.println("4) Ver biblioteca");
            System.out.println("0) Voltar");
            System.out.print("Opção: ");
            String op = sc.nextLine();
            switch (op) {
                case "1":
                    System.out.print("Nome da música: ");
                    String musica = sc.nextLine();
                    iphone.selecionarMusica(musica);
                    break;
                case "2":
                    iphone.tocar();
                    break;
                case "3":
                    iphone.pausar();
                    break;
                case "4":
                    iphone.listarMusicas();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void menuInternet(Scanner sc) {
        while (true) {
            System.out.println("\n--- Navegador de Internet ---");
            System.out.println("1) Exibir página");
            System.out.println("2) Nova aba");
            System.out.println("3) Atualizar página");
            System.out.println("4) Favoritos");
            System.out.println("0) Voltar");
            System.out.print("Opção: ");
            String op = sc.nextLine();
            switch (op) {
                case "1":
                    System.out.print("URL: ");
                    String url = sc.nextLine();
                    iphone.exibirPagina(url);
                    break;
                case "2":
                    iphone.adicionarNovaAba();
                    break;
                case "3":
                    iphone.atualizarPagina();
                    break;
                case "4":
                    iphone.listarPaginas();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    /* ---------------------- DESENHO ---------------------- */

    /** Limpa o terminal (ANSI) para dar sensação de tela atualizada */
    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void printPhoneFrame() {
        clearScreen();

        // Cabeçalho
        System.out.println("+-------------------------------+");
        System.out.println("|           iPhone              |");
        System.out.println("|-------------------------------|");

        // Primeira fileira de ícones (1,2,3)
        System.out.println("|  +---+    +---+    +---+      |");
        System.out.println("|  | 1 |    | 2 |    | 3 |      |");
        System.out.println("|  +---+    +---+    +---+      |");
        System.out.println("|  Tel      Música   Safari     |");

        // Espaço vazio
        System.out.println("|                               |");

        // Botão sair centralizado
        System.out.println("|            +---+              |");
        System.out.println("|            | 0 |              |");
        System.out.println("|            +---+              |");
        System.out.println("|             Sair              |");
        System.out.println("+-------------------------------+");
    }
} 