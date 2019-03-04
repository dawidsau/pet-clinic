package pl.sauermann.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.thymeleaf.expression.Sets;
import pl.sauermann.petclinic.model.*;
import pl.sauermann.petclinic.services.OwnerRepositoryService;
import pl.sauermann.petclinic.services.PetTypeRepositoryService;
import pl.sauermann.petclinic.services.SpecialitiesRepositoryService;
import pl.sauermann.petclinic.services.VetRepositoryService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerRepositoryService ownerRepositoryService;
    private final VetRepositoryService vetRepositoryService;
    private final PetTypeRepositoryService petTypeRepositoryService;
    private final SpecialitiesRepositoryService specialitiesRepositoryService;

    public DataLoader(OwnerRepositoryService ownerRepositoryService,
                      VetRepositoryService vetRepositoryService,
                      PetTypeRepositoryService petTypeRepositoryService,
                      SpecialitiesRepositoryService specialitiesRepositoryService) {
        this.ownerRepositoryService = ownerRepositoryService;
        this.vetRepositoryService = vetRepositoryService;
        this.petTypeRepositoryService = petTypeRepositoryService;
        this.specialitiesRepositoryService = specialitiesRepositoryService;
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
        Speciality saveRadiology = specialitiesRepositoryService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality saveSurgery = specialitiesRepositoryService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality saveDentistry = specialitiesRepositoryService.save(dentistry);


        Owner owner = new Owner();
        owner.setFirstName("Arni");
        owner.setLastName("Szwar");
        owner.setPets(new HashSet<>(Arrays.asList(new Pet("Some dog", dog, owner, LocalDate.now()))));
        ownerRepositoryService.save(owner);

        Owner owner2 = new Owner();
        owner2.setFirstName("Niki");
        owner2.setLastName("Minash");
        owner2.setPets(new HashSet<>(Arrays.asList(new Pet("Some cat", cat, owner2, LocalDate.now()))));

        ownerRepositoryService.save(owner2);
        System.out.println();
        Vet vet1 = new Vet();
        vet1.setFirstName("Abbi");
        vet1.setLastName("Bak");
        vet1.setSpecialities(new HashSet<>(Arrays.asList(saveDentistry)));
        vetRepositoryService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Lak");
        vet2.setLastName("Law");
        vet2.setSpecialities(new HashSet<>(Arrays.asList(saveSurgery)));
        vetRepositoryService.save(vet2);
    }
}
