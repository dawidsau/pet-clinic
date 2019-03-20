package pl.sauermann.petclinic.services.jpaservices;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.sauermann.petclinic.model.Speciality;
import pl.sauermann.petclinic.repositories.SpecialityRepository;
import pl.sauermann.petclinic.services.SpecialitiesRepositoryService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajparepository")
public class SpecialitiesJpaService implements SpecialitiesRepositoryService {

    private SpecialityRepository specialityRepository;

    public SpecialitiesJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
