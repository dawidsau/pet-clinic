package pl.sauermann.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.sauermann.petclinic.model.Owner;
import pl.sauermann.petclinic.model.Vet;
import pl.sauermann.petclinic.services.OwnerRepositoryService;
import pl.sauermann.petclinic.services.VetRepositoryService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerRepositoryService ownerRepositoryService;
    private final VetRepositoryService vetRepositoryService;


    public DataLoader(OwnerRepositoryService ownerRepositoryService, VetRepositoryService vetRepositoryService) {
        this.ownerRepositoryService = ownerRepositoryService;
        this.vetRepositoryService = vetRepositoryService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner = new Owner();
        owner.setFirstName("Arni");
        owner.setLastName("Szwar");

        ownerRepositoryService.save(owner);

        Owner owner2 = new Owner();
        owner2.setFirstName("Niki");
        owner2.setLastName("Minash");

        ownerRepositoryService.save(owner2);
        System.out.println();
        Vet vet1 = new Vet();
        vet1.setFirstName("Abbi");
        vet1.setLastName("Bak");

        vetRepositoryService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Lak");
        vet2.setLastName("Law");

        vetRepositoryService.save(vet2);
    }
}
