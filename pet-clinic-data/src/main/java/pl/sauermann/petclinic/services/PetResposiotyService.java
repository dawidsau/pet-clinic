package pl.sauermann.petclinic.services;

import pl.sauermann.petclinic.model.Pet;

import java.util.Set;

public interface PetResposiotyService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
