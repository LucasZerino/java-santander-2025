//Essa classe não pode ser instanciada, apenas herdada ( abstract )
public abstract class Conta implements IConta{

  protected static final int AGENCIA_PADRAO = 4885;
  protected static final int CONTA_CORRENTE_PREFIXO = 13;
  protected static final int CONTA_POUPANCA_PREFIXO = 22;

  // atributos
  protected int agencia;
  protected int prefixo; // prefixo da conta
  protected int numero;
  protected double saldo;
  protected String nomeCliente;

  //Métodos da interface

  @Override
  public void sacar(double valor){
    saldo -= valor;
  }

  @Override
  public void depositar(double valor){
    saldo += valor;
  }

  @Override
  public void transferir(double valor, Conta contaDestino){
    this.sacar(valor);
    contaDestino.depositar(valor);
  }

  // Métodos getters ( Setters não são necessários aqui )
  public int getAgencia(){
      return agencia;
  }

  public int getNumero(){
      return numero;
  }

  public double getSaldo(){
      return saldo;
  }

  public String getNomeCliente(){
    return nomeCliente;
  }

  protected void imprimirInfosComuns(){
    System.out.println(String.format("Agencia: %d", agencia));
    System.out.println(String.format("Conta: %d %d", prefixo, numero));
    System.out.println(String.format("Saldo: %.2f", saldo));
    System.out.println(String.format("Cliente: %s", nomeCliente));
  }
}
