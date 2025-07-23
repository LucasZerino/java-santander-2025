public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        TerminalUI ui = new TerminalUI(meuIphone);
        ui.start();
    }
}