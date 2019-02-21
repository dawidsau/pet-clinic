package pl.sauermann.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.sauermann.petclinic.model.Vet;

@SpringBootApplication
public class PetClinicApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(PetClinicApplication.class, args);
    }

}
