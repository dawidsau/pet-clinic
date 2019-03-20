package pl.sauermann.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.sauermann.petclinic.model.Owner;

import java.util.Set;

public interface OwnerRepository extends CrudRepository<Owner, Long> {


    Owner findByLastName(String lastName);

}

