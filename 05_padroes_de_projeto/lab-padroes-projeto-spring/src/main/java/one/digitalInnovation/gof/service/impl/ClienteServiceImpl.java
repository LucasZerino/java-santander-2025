package one.digitalInnovation.gof.service.impl;

import one.digitalInnovation.gof.model.Cliente;
import one.digitalInnovation.gof.model.ClienteRepository;
import one.digitalInnovation.gof.model.Endereco;
import one.digitalInnovation.gof.model.EnderecoRepository;
import one.digitalInnovation.gof.service.ClienteService;
import one.digitalInnovation.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    EnderecoRepository enderecoRepository;
    @Autowired
    ViaCepService viaCepService;
    // Todo Strategy: Implementar os métodos definidos na interface.
    // Todo Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }


    @Override
    public void inserir(Cliente cliente){
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente){
        Optional<Cliente> clienteEncontrado = clienteRepository.findById(id);
        if(clienteEncontrado.isPresent()){
            salvarClienteComCep(cliente);
        }
    }


    @Override
    public void deletar(Long id){
        clienteRepository.deleteById(id);
    }


    private void salvarClienteComCep(Cliente cliente){
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
