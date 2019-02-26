package pl.sauermann.petclinic.services.map;

import org.springframework.stereotype.Service;
import pl.sauermann.petclinic.model.Vet;
import pl.sauermann.petclinic.services.VetRepositoryService;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetRepositoryService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
