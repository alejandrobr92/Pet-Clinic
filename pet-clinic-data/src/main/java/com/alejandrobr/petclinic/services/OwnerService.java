package com.alejandrobr.petclinic.services;

import com.alejandrobr.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);


}
