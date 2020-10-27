package com.svetlicic.filip.sfpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vet extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}
