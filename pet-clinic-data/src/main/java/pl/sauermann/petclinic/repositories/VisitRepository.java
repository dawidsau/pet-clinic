package pl.sauermann.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.sauermann.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
