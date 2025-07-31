package one.digitalInnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository  extends CrudRepository<Cliente, Long> {

}
