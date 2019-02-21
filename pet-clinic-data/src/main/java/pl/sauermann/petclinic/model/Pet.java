package pl.sauermann.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Pet {

    private PetType type;
    private Owner owner;
    private LocalDate birthDate;
}
