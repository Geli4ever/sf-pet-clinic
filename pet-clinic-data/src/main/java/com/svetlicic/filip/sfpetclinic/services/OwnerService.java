package com.svetlicic.filip.sfpetclinic.services;

import com.svetlicic.filip.sfpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
