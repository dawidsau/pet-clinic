package pl.sauermann.petclinic.services;

import pl.sauermann.petclinic.model.Vet;

import java.util.Set;

public interface VetRepositoryService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
