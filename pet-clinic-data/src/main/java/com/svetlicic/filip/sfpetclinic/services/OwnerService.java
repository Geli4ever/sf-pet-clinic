package com.svetlicic.filip.sfpetclinic.services;

import com.svetlicic.filip.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
