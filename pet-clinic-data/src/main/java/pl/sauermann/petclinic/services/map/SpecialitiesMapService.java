package pl.sauermann.petclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.sauermann.petclinic.model.Speciality;
import pl.sauermann.petclinic.services.SpecialitiesRepositoryService;

import java.util.Set;

@Service
@Profile({"default","map"})
public class SpecialitiesMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesRepositoryService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
