package treinosetestes.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import treinosetestes.model.entities.Paciente;

public interface RepositorioPaciente extends CrudRepository<Paciente, Long> {
}
