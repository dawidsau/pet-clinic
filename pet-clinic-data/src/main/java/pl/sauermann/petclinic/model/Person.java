package pl.sauermann.petclinic.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person extends  BaseEntity{

    private String firstName;
    private String lastName;
}
