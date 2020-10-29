package com.svetlicic.filip.sfpetclinic.bootstrap;

import com.svetlicic.filip.sfpetclinic.model.Owner;
import com.svetlicic.filip.sfpetclinic.model.Pet;
import com.svetlicic.filip.sfpetclinic.model.PetType;
import com.svetlicic.filip.sfpetclinic.model.Vet;
import com.svetlicic.filip.sfpetclinic.services.OwnerService;
import com.svetlicic.filip.sfpetclinic.services.PetTypeService;
import com.svetlicic.filip.sfpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Filip");
        owner1.setLastName("Svetlicic");
        owner1.setAddress("Zagrebacka cesta 224");
        owner1.setCity("Zagreb");
        owner1.setTelephone("099123456");

        Pet pet = new Pet();
        pet.setName("Aron");
        pet.setType(savedDogPetType);
        pet.setOwner(owner1);
        pet.setBirthday(LocalDate.parse("2019-10-10"));
        owner1.getPets().add(pet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("Albinijeva 4");
        owner2.setCity("Zagreb");
        owner2.setTelephone("098123456");

        Pet pet1 = new Pet();
        pet1.setName("Baron");
        pet1.setType(savedCatPetType);
        pet1.setOwner(owner2);
        pet1.setBirthday(LocalDate.now());
        owner2.getPets().add(pet1);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }


}
