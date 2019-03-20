package pl.sauermann.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.sauermann.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
