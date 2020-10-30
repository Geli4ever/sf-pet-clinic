package com.svetlicic.filip.sfpetclinic.repositories;

import com.svetlicic.filip.sfpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
