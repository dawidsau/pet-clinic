package pl.sauermann.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.sauermann.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
