public class ContaCorrente extends Conta{

    private static int SEQUENCIAL = 1;

    public ContaCorrente(){
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        super.prefixo = CONTA_CORRENTE_PREFIXO;
        super.nomeCliente = nomeCliente;
        super.saldo = 0;
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void setContaTitular(String nomeCliente){
        super.nomeCliente = nomeCliente;
    }
}
