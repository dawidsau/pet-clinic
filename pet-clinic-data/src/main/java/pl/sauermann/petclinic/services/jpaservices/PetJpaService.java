package pl.sauermann.petclinic.services.jpaservices;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.sauermann.petclinic.model.Pet;
import pl.sauermann.petclinic.repositories.PetRepository;
import pl.sauermann.petclinic.services.PetRepositoryService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajparepository")
public class PetJpaService implements PetRepositoryService {

    private PetRepository petRepository;

    public PetJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
