package one.digitalInnovation.gof.service;

import one.digitalInnovation.gof.model.Cliente;

public interface ClienteService {
    
    Iterable<Cliente> buscarTodos();

    void inserir ( Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

    Cliente buscarPorId(Long id);
}
