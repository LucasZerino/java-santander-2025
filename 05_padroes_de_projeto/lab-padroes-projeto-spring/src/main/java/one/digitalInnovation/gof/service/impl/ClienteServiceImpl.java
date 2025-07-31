package one.digitalInnovation.gof.service.impl;

import one.digitalInnovation.gof.model.Cliente;
import one.digitalInnovation.gof.service.ClienteService;

public class ClienteServiceImpl implements ClienteService {
    //Todo Singleton: Injetar os componentes do Sprint com @Autowired
    // Todo Strategy: Implementar os métodos definidos na interface.
    // Todo Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Cliente> buscarTodos(){
        // FIXME Buscar todos os Clientes.
        return null;
    }

    @Override
    public Cliente buscarPorID(Long id) {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        //FIXME Buscar Cliente por ID
        return null;
    }

    @Override
    public void inserir(Cliente cliente){
        //FIXME Verificar se o Endereco do Cliente já existe ( pelo CEP )
        //FIXME Caso não exista, integrar com o ViaCep e persistir o retorno.
        //FIXME Inserir Cliente, vinculando o Endereco ( novo ou existente).
    }

    @Override
    public void atualizar(Long id, Cliente cliente){
        //FIXME Buscar o cliente por Id, caso exista:
        //FIXME Verificar se o Endereço do clietne já existe ( Pelo cep )
        //FIXME Caso não exista, integrar com o viaCep e persisistir o retorno.
        //FIXME Alterar o cliente, vinculando o endereço ( seja ele novo ou existente).
    }

    @Override
    public void deletar(Long id){
        //FIXME Deletar Cliente por ID.
    }
}
