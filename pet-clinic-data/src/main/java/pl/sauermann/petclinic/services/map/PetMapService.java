package pl.sauermann.petclinic.services.map;

import org.springframework.stereotype.Service;
import pl.sauermann.petclinic.model.Pet;
import pl.sauermann.petclinic.services.PetResposiotyService;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetResposiotyService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
