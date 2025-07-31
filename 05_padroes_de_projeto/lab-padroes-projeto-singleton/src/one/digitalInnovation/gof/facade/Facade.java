package one.digitalInnovation.gof.facade;

import one.digitalInnovation.gof.facade.subsistema1.crm.CrmService;
import one.digitalInnovation.gof.facade.subsistema2.cep.CepAPI;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recupeararEstado(cep);


        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
