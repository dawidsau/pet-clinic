package pl.sauermann.petclinic.services.jpaservices;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.sauermann.petclinic.model.Visit;
import pl.sauermann.petclinic.repositories.VisitRepository;
import pl.sauermann.petclinic.services.VisitRepositoryService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajparepository")
public class VisitJpaService implements VisitRepositoryService {

    private VisitRepository visitRepository;

    public VisitJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
