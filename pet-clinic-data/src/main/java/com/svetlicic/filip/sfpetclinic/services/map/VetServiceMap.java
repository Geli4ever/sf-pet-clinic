package com.svetlicic.filip.sfpetclinic.services.map;

import com.svetlicic.filip.sfpetclinic.model.Vet;
import com.svetlicic.filip.sfpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
