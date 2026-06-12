package treinosetestes.model.repositories;

import org.springframework.data.repository.CrudRepository;
import treinosetestes.model.entities.Cadastrado;

public interface RepoCadastrado extends CrudRepository<Cadastrado, Integer> {
}
