package com.svetlicic.filip.sfpetclinic.repositories;

import com.svetlicic.filip.sfpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
