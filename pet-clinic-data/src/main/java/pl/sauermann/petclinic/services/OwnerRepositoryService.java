package pl.sauermann.petclinic.services;

import pl.sauermann.petclinic.model.Owner;

public interface OwnerRepositoryService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
