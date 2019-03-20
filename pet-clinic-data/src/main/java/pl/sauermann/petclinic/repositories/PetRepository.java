package pl.sauermann.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.sauermann.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
