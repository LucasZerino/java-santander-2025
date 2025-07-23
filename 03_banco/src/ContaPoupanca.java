public class ContaPoupanca extends Conta{
    private static int SEQUENCIAL = 1;

    public ContaPoupanca(){
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        super.prefixo = CONTA_POUPANCA_PREFIXO;
        super.nomeCliente = nomeCliente;
        super.saldo = 0;
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void setContaTitular(String nomeCliente){
        super.nomeCliente = nomeCliente;
    }
}   
