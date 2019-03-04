package pl.sauermann.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "vet_specialities",joinColumns = @JoinColumn (name = "vets_id"),
                                    inverseJoinColumns = @JoinColumn(name =  "speciality_id"))
    private Set<Speciality> specialities;

}
