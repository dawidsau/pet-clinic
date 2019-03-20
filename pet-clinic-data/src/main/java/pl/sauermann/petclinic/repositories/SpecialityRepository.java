package pl.sauermann.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.sauermann.petclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
