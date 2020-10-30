package com.svetlicic.filip.sfpetclinic.services.map;

import com.svetlicic.filip.sfpetclinic.model.Specialty;
import com.svetlicic.filip.sfpetclinic.model.Vet;
import com.svetlicic.filip.sfpetclinic.services.SpecialtyService;
import com.svetlicic.filip.sfpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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
        if(object != null){
            if(object.getSpecialties().size() > 0){
                object.getSpecialties().forEach(specialty -> {
                    if(specialty.getId() == null){
                        Specialty savedSpecialty = specialtyService.save(specialty);
                        specialty.setId(savedSpecialty.getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }
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
