package com.svetlicic.filip.sfpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name ="pets")
public class Pet extends BaseEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "birth_date")
    private LocalDate birthday;

    @ManyToOne
    @JoinColumn(name = "pet_type_id")
    private PetType type;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> visits = new HashSet<>();

}
