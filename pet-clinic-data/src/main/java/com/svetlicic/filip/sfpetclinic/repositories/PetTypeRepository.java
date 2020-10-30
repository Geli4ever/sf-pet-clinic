package com.svetlicic.filip.sfpetclinic.repositories;

import com.svetlicic.filip.sfpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
