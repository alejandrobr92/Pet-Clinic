package com.alejandrobr.petclinic.services;

import com.alejandrobr.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);


}
