package com.svetlicic.filip.sfpetclinic.services;

import com.svetlicic.filip.sfpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
