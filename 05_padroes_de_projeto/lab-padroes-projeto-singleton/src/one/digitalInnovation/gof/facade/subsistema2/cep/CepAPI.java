package one.digitalInnovation.gof.facade.subsistema2.cep;

public class CepAPI {
    private static CepAPI instancia = new CepAPI();

    private CepAPI(){
        super();
    }

    public static CepAPI getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Natal";
    }

    public String recupeararEstado(String cep){
        return "RN";
    }
}
