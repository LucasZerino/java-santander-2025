public class Main {
    public static void main( String[] args){
        Conta conta_corrente = new ContaCorrente();
        Conta conta_poupanca = new ContaPoupanca();
        Conta conta_poupanca2 = new ContaPoupanca();
        Conta conta_corrente2 = new ContaCorrente();

        conta_corrente.setContaTitular("João da Silva");
        conta_poupanca.setContaTitular("Maria da Silva");
        conta_poupanca2.setContaTitular("Pedro da Silva");
        conta_corrente2.setContaTitular("João da Silva");

        conta_corrente.depositar(100);
        conta_corrente.transferir(50, conta_poupanca);

        conta_corrente.imprimirExtrato();
        conta_poupanca.imprimirExtrato();
        conta_poupanca2.imprimirExtrato();
        conta_corrente2.imprimirExtrato();
    }
}
