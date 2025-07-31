package one.digitalInnovation.gof.facade.subsistema1.crm;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void gravarCliente(String nome, String cep,String cidade, String estado){
        System.out.println("Cliente salvo no sistema de CRM");
        System.out.printf("Nome do Cliente: %s\n", nome);
        System.out.printf("Cep do Cliente: %s\n", cep);
        System.out.printf("Cidade do Cliente: %s\n", cidade);
        System.out.printf("Estado do Cliente: %s\n", estado);
    }
}
