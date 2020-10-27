package com.svetlicic.filip.sfpetclinic.services;

import com.svetlicic.filip.sfpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
