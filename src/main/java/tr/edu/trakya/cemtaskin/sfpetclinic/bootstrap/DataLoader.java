package tr.edu.trakya.cemtaskin.sfpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tr.edu.trakya.cemtaskin.sfpetclinic.model.Owner;
import tr.edu.trakya.cemtaskin.sfpetclinic.model.Pet;
import tr.edu.trakya.cemtaskin.sfpetclinic.model.PetType;
import tr.edu.trakya.cemtaskin.sfpetclinic.model.Vet;
import tr.edu.trakya.cemtaskin.sfpetclinic.services.map.OwnerServiceMap;
import tr.edu.trakya.cemtaskin.sfpetclinic.services.map.PetServiceMap;
import tr.edu.trakya.cemtaskin.sfpetclinic.services.map.VetServiceMap;

import java.time.LocalDate;
import java.util.Date;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerServiceMap ownerServiceMap;
    private final PetServiceMap petServiceMap;
    private final VetServiceMap vetServiceMap;

    public DataLoader(OwnerServiceMap ownerServiceMap, PetServiceMap petServiceMap, VetServiceMap vetServiceMap) {
        this.ownerServiceMap = ownerServiceMap;
        this.petServiceMap = petServiceMap;
        this.vetServiceMap = vetServiceMap;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Ali");
        owner1.setLastName("Duru");

        Owner owner2=new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Aliye");
        owner2.setLastName("Duru");

        Vet vet1=new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Vet 1 Name");
        vet1.setLastName("Vet 1 Surname");


        PetType petType=new PetType();
        petType.setId(1L);
        petType.setName("Dog");

        Pet pet1 = new Pet();
        pet1.setId(1L);
        pet1.setOwner(owner1);
        pet1.setPetType(petType);
        pet1.setBirthDate(LocalDate.now());

        ownerServiceMap.save(owner1);
        ownerServiceMap.save(owner2);
        vetServiceMap.save(vet1);
        petServiceMap.save(pet1);

        System.out.println("Owners created");
        System.out.println("One Vet created");
        System.out.println("One Pet created");
    }
}
