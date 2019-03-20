package pl.sauermann.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.sauermann.petclinic.model.*;
import pl.sauermann.petclinic.services.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerRepositoryService ownerRepositoryService;
    private final VetRepositoryService vetRepositoryService;
    private final PetTypeRepositoryService petTypeRepositoryService;
    private final SpecialitiesRepositoryService specialitiesRepositoryService;
    private final VisitRepositoryService visitRepositoryService;

    public DataLoader(OwnerRepositoryService ownerRepositoryService,
                      VetRepositoryService vetRepositoryService,
                      PetTypeRepositoryService petTypeRepositoryService,
                      SpecialitiesRepositoryService specialitiesRepositoryService, VisitRepositoryService visitRepositoryService) {
        this.ownerRepositoryService = ownerRepositoryService;
        this.vetRepositoryService = vetRepositoryService;
        this.petTypeRepositoryService = petTypeRepositoryService;
        this.specialitiesRepositoryService = specialitiesRepositoryService;
        this.visitRepositoryService = visitRepositoryService;
    }

    @Override
    public void run(String... args) throws Exception {
        int counter = petTypeRepositoryService.findAll().size();
        if (counter == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        petTypeRepositoryService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        petTypeRepositoryService.save(cat);


        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialitiesRepositoryService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialitiesRepositoryService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialitiesRepositoryService.save(dentistry);


        Owner owner = new Owner();
        owner.setFirstName("Arni");
        owner.setLastName("Szwar");
        Pet pet1 = new Pet("Some dog", dog, owner, LocalDate.now(),null);
        owner.setPets(new HashSet<>(Arrays.asList(pet1)));
        ownerRepositoryService.save(owner);

        Owner owner2 = new Owner();
        owner2.setFirstName("Niki");
        owner2.setLastName("Minash");
        Pet pet2 = new Pet("Some cat", cat, owner2, LocalDate.now(),null);
        owner2.setPets(new HashSet<>(Arrays.asList(pet2)));

        ownerRepositoryService.save(owner2);
        System.out.println();
        Vet vet1 = new Vet();
        vet1.setFirstName("Abbi");
        vet1.setLastName("Bak");
//        vet1.getSpecialities().add(savedRadiology);
        vetRepositoryService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Lak");
        vet2.setLastName("Law");
//        vet2.getSpecialities().add(savedSurgery);
        vetRepositoryService.save(vet2);

        Visit visit1 = new Visit();
        visit1.setPet(pet1);
        visit1.setLocalDate(LocalDate.now());

        visitRepositoryService.save(visit1);

        Visit visit2 = new Visit();
        visit2.setPet(pet2);
        visit2.setLocalDate(LocalDate.now());

        visitRepositoryService.save(visit2);
    }
}
