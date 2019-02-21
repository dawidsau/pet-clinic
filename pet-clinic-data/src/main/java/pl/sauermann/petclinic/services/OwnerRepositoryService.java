package pl.sauermann.petclinic.services;

import pl.sauermann.petclinic.model.Owner;

import java.util.Set;

public interface OwnerRepositoryService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
